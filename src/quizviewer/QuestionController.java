package quizviewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 * text that is required to fit within a specific space, and thus may need
 * to use an ellipsis or truncation to size the string to fit. Labels also are
 * useful in that they can have mnemonics which, if used, will send focus to
 * the Control listed as the target of the <code>labelFor</code> property.
 * <p>
 * Label sets focusTraversable to false.
 * </p>
 *
 * <p>Example:
 * <pre><code>Label label = new Label("a label");</code></pre>
 * @since JavaFX 2.0
 * @author srge
 */

public class QuestionController implements Initializable, ManagedView {

    ViewController myController;
    /**
     * Initializes the controller class.
     */
    
    /*
    @FXML
    private TextArea meinfeld;
    
    @FXML
    private Button nextButton;
    */
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
    }
  
    /*private void setShit(){
      meinfeld.setText( "test from controller");
    }*/
    
    
   /* 
    private void nextQuest(){
        meinfeld.setText( "test from controller"); 
        nextButton.setOnAction(this::handleButtonAction);
        System.out.println("sfsfsf");
    }
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Button Action\n");
    }
    */
    
    public void setViewParent(ViewController screenParent){
        myController = screenParent;
    }

}
