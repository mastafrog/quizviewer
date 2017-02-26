/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizviewer;

/**
 *
 * @author srge
 */
public interface ManagedView {
    
    //Erlaubt das Injezieren von dem Eltern Pane View
    public void setViewParent(ViewController screenView);
}