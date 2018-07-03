/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.scene.control.Button;

/**
 *
 * @author gabriele
 */
public class ControlButton extends Button {
    public final static String ROUNDS = "r", QUARTERS = "q", SEMIFINALS = "s", 
            FINALS = "f";
    private final static double WIDTH = 100;
    
    private String type;
    private int day;
    public ControlButton(String type) {
        this(type, 0);
    }
    public ControlButton(String type, int day) {
        setMaxWidth(WIDTH);
        
        this.type = type;
        this.day = day;
        String label = "";
        switch(type){
            case ROUNDS: label = (day+1) + "a giornata"; break;
            case QUARTERS: label = "Quarti"; break;
            case SEMIFINALS: label = "Semifinali"; break;
            case FINALS: label = "Finali"; break;
        }
        setText(label);
        setDisable(true);
    }
    
    public String getType(){
        return type;
    }
    public int getDay(){
        return day;
    }
    
}
