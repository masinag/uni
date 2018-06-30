/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.control.Button;

/**
 *
 * @author gabriele
 */
public class GameButton extends Button {
    public final static String UP_ID = "up", DOWN_ID = "down", START_ID = "start",
            STOP_ID = "stop", RESET_ID = "reset";
    
    private final static double WIDTH = 70;

    public GameButton(String label, String id) {
        super(label);
        setId(id);
        
        setMinWidth(WIDTH);
    }
    
}
