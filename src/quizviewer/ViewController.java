/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizviewer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;


/**
 *
 * @author srge
 */
public class ViewController extends StackPane {
    
    private HashMap<String, Node> views = new HashMap<>();
    
    /** QuizController variablen*/
    private boolean quizFinished = false;
    private int Fragenanzahl = 30;

    ManagedView myScreenControler;
	
    /*Loader Variablen */
    private ArrayList<Frage> AlleFragen; 
    
    public ViewController() {
        super();
    }
    
    //Add the screen to the collection
    public void addView(String name, Node view) {
        views.put(name, view);
    }
    
    //Returns the Node with the appropriate name
    public Node getView(String name) {
        return views.get(name);
    }

    
    //Loads the fxml file, add the screen to the screens collection and
    //finally injects the screenPane to the controller.
    public boolean loadScreen(String name, String resource) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
            Parent loadView = (Parent) myLoader.load();
            myScreenControler = ((ManagedView) myLoader.getController());
            myScreenControler.setViewParent(this);
            addView(name, loadView);
            return true;
            
        } catch (Exception e) {
            System.out.println("here die 2? : "+e.getMessage());
            return false;
            
        }
    }
    
    
    /* 
    * This method tries to displayed the screen with a predefined name.
    * First it makes sure the screen has been already loaded.  Then if there is more than
    * one screen the new screen is been added second, and then the current screen is removed.
    * If there isn't any screen being displayed, the new screen is just added to the root.
    * @param final String name
    */
    public boolean setView(final String name) {       
        /*if (views.get(name) != null) {   //screen loaded
        
            final DoubleProperty opacity = opacityProperty();

            if (!getChildren().isEmpty()) {    //if there is more than one screen
                Timeline fade = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
                        new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent t) {
                        getChildren().remove(0);                    //remove the displayed screen
                        getChildren().add(0, views.get(name));     //add the screen
                        Timeline fadeIn = new Timeline(
                                new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                                new KeyFrame(new Duration(800), new KeyValue(opacity, 1.0)));
                        fadeIn.play();
                    }
                }, new KeyValue(opacity, 0.0)));
                fade.play();

            } else {
                setOpacity(0.0);
                getChildren().add(views.get(name));       //no one else been displayed, then just show
                Timeline fadeIn = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                        new KeyFrame(new Duration(2500), new KeyValue(opacity, 1.0)));
                fadeIn.play();
            }
            return true;
        } else {
            System.out.println("View wurde nicht geladen!!! \n");
            return false;
        }*/
        /*  Das ganze ohne Animation? */

        /*Node screenToRemove;*/
        
        if(views.get(name) != null) {   //screen loaded
            if(!getChildren().isEmpty()){    //if there is more than one screen

            getChildren().remove(0);                     //remove the displayed screen
            getChildren().add(0, views.get(name));       //add the screen

            } else {
                getChildren().add(views.get(name));       //no one else been displayed, then just show
           }
           return true;
        } else {
            System.out.println("screen hasn't been loaded!!! \n");
            return false;
        }
    }
    
    
    public boolean unloadView(String name) {
        if (views.remove(name) == null) {
            System.out.println("View existiert nicht!");
            return false;
        } else {
		return true;
        }
	}
	
	
	
    /*** 
     * FUNCTIONS FOR QUIZ CONTROLLER
     * 
     * *@param int res;
     */
    
    public void InitQuiz(int _FragenAnzahl) {
        System.out.println("VIEW CONTROLLER InitQuiz");
        Fragenanzahl = _FragenAnzahl;
		//.out.println(views.toString());
        setView(App.screen2ID);

        if(LoadFragen()){
            System.out.println(AlleFragen.size());
            Frage frage = AlleFragen.get(AlleFragen.size()-1);
        
            System.out.println("InitQuest - frage\n" + frage.getFrage());
          //  ArrayList<String> antworten = frage.getAntworten();  
          
            for(String antwort : frage.getAntworten() ){
                System.out.println("Antwort:" + antwort);
            }
        }

    }
    

    
    public void nextQuest() {
	if(quizFinished != true){
            Frage frage = AlleFragen.get(AlleFragen.size());
        //    myScreenControler.nextQuest(frage);
        }
	System.out.println("main from controller");
        
	}
    
	
    /*** LOADER FUNCTIONS */
    private boolean LoadFragen() {
       System.out.println("LOAD FRAGEN \n");
       AlleFragen = createFragenList();
       Collections.shuffle(AlleFragen);
       return true;
    }
        
    
    private ArrayList<Frage> createFragenList() {
        ArrayList<Frage> Quizlist = new<Frage> ArrayList();
        for (int i = 0; i < Fragenanzahl; i++) {
            ArrayList Antworten = new ArrayList(Arrays.asList("abc", "efg", "blup"));
            Quizlist.add(new Frage("Trulala"+i, Antworten));
        } 
        return Quizlist;
    }

}
