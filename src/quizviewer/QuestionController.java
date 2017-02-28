package quizviewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

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
    
    
    @FXML
    private TextArea meinfeld;
    
    @FXML
    public Button nextButton;
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        
        System.out.println(myController);
        
        meinfeld.setText("From controller\n");
        nextButton.setOnAction((event) -> {
            
            System.out.println(myController);

            meinfeld.appendText("Button Action\n");
	//nextQuest();
        });
    }  



    public void setViewParent(ViewController screenParent){
        myController = screenParent;
    }

}





/*

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        ListView<String> answerList = new ListView<>(Answers);
        answerList.setEditable(true);
        
    //    stage.getIcons().add(new Image("resources/icon.png")getClass().getResource("resources/icon.png"));
        System.out.println(stage.getIcons().toString());
        
    //    answerList.addAll(Answers);
        answerList.setCellFactory(
        new Callback<ListView<String>, ListCell<String>>() {
            @Override public ListCell<String> call(ListView<String> param) {
                final ListCell<String> cell;
                cell = new ListCell<String>() {
                    
                    VBox vb;
                    Label content;
                    Button button;
                        
                    {
                        super.setPrefWidth(100);
                        
                        vb = new VBox();
                        content = new Label("fk");
                        button = new Button("AFL");
                        vb.getChildren().addAll(content, button);
                        setGraphic(vb);      
                    }
                    
                    @Override public void updateItem(String item,
                        boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {
                            setText(item);
                            if (item.contains("A")) {
                                setTextFill(Color.RED);
                            }
                            else if (item.contains("B")){
                                setTextFill(Color.GREEN);
                            }
                            else {
                                setTextFill(Color.BLACK);
                            }
                        }
                        else {
                            setText(null);
                        }
                    }
                };
            return cell;
        }
                    
    });

    VBox layout = new VBox(answerList);
    Scene scene = new Scene(layout);
    stage.setScene(scene);
    stage.show();
    }
*/