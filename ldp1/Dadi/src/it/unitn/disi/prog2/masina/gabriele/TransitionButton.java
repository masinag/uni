/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 *
 * @author gabriele
 */
class TransitionButton extends Button {
    final static String MOVE = "Spostamento", DISSOLVE = "Dissolvimento";
    public TransitionButton() {
        reset();        
    }
    public void changeValue(){
        this.setText(getText().equals(MOVE)?DISSOLVE:MOVE);
    }
    public void reset(){
        this.setText(MOVE);
    }
    public String getValue(){
        return getText();
    }
    
}
