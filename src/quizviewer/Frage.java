package quizviewer;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srge
 */
public class Frage {
    private String Frage;    
    private ArrayList<String> Antworten;
    private int RichtigeAntwort;
    private int Beantwortet;  // 0 Nicht, 1 - ja:richtig 2 - ja:falsch

//    private DateTime; // MAYBE: +joda-time

    
    public Frage(String _frage, ArrayList<String> _antworten) {
        setFrage(_frage);
        setAntworte(_antworten);
    }
    
    /**
     * @return the Frage
     */
    public String getFrage() {
        return Frage;
    }

    /**
     * @param Frage the Frage to set
     */
    public void setFrage(String Frage) {
        this.Frage = Frage;
    }

    /**
     * @return the Antworten
     */
    
    public ArrayList<String> getAntworten() {
        return Antworten;
    }

    /**
     * @param Antworten the Antworten to set
     */
    public void setAntworte(ArrayList<String> Antworten) {
        this.Antworten = Antworten;
    }
    
    /**
     * @param Antworten the Antworten to set
     */
    public void setAntwort(String antwort) {
        this.Antworten.add(antwort);
    }
}
