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

/**
 * FXML Controller class
 *
 * @author srge
 */
public class TestFXMLController implements Initializable, ManagedView {

    ViewController myController;
    /**
     * Initializes the controller class.
     */
            
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setViewParent(ViewController screenParent){
        myController = screenParent;
    }

}
