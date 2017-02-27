package quizviewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author srge
 */
public class SettingsController implements Initializable, ManagedView {
    
    private Parent parent;
    private int Fragenanzahl = 3;
    
    ViewController myController;

    /**
     * Initializes the controller class.
     */
    
    
    @FXML 
    private Slider sliderFragenanzahl;
    
    
    @FXML
    private Text textFragenanzahl;
    
    
    /*public ReadOnlyObjectProperty<reference> currentFragenanzahl() {
        return this.Fragenanzahl;
    }*/
    
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        textFragenanzahl.setText( String.valueOf(Fragenanzahl) );

        /* Listener für veränderungen der Werte des "Fragen Anzahl" Sliders */
        sliderFragenanzahl.valueProperty().addListener((observable, oldValue, newValue) -> {
            Fragenanzahl = newValue.intValue();
            textFragenanzahl.setText( String.valueOf(Fragenanzahl) );
            System.out.println("Slider Value Changed (newValue: " + newValue.intValue() + ")");
        });
    }
    
    
    
    
    @FXML
    private void StartLernquiz(ActionEvent event) throws Exception {
        
       // try {
            /* Dieser Teil hat mir eine Ewigkeit gekostet
             https://stackoverflow.com/questions/573679/open-resource-with-relative-path-in-java           
            */
         //   FXMLLoader  loader = new FXMLLoader(getClass().getResource("/lernquiz/views/Quiz.fxml")); 
         //   parent =    loader.load();
          //  TestQuizController quizController = (TestQuizController) loader.getController();
         //   System.out.println("HERE: "+allFragen.toString());
          //  quizController.setQuizfragen(allFragen);
            
        /*} catch (Exception e) {
            
            System.out.println("nonon here" + e.getMessage() + "--- "+ e.getCause() );
        }
        
        if(parent instanceof Parent) {
            
            Scene homeScene = new Scene(parent);
            Stage appStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            appStage.hide(); 
            appStage.setScene(homeScene);
            appStage.show();  
        }*/
      //  System.out.println(App.screen2ID);
      //  myController.InitQuiz(Fragenanzahl);
      myController.InitQuiz(Fragenanzahl);
    // ---> myController.setView(App.screen2ID);
    }
    
    public void setViewParent(ViewController screenParent){
        myController = screenParent;
    }
    

}