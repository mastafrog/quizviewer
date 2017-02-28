/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizviewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author srge
 */
public class App extends Application {
    
    public static String screen1ID = "main";
    public static String screen1File = "Settings.fxml";

    public static String screen2ID = "next";
    public static String screen2File = "Question.fxml";
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        ViewController mainContainer = new ViewController();
        
        mainContainer.loadScreen(this.screen1ID, this.screen1File);
        mainContainer.loadScreen(this.screen2ID, this.screen2File);
             
        mainContainer.setView(this.screen1ID);
    //    mainContainer.InitQuiz(10);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
