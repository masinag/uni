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
public class RoadButton extends Button {
    public final static String ADD = "add";
    public final static String START_GAME = "start_game";
    public final static String LEFT = "left";
    public final static String RIGHT = "right";
    public final static String UP = "up";
    public final static String DOWN = "down";
    public final static String RANDOM = "random";
    public final static String START_ANIMATION = "start";
    public final static String STOP_ANIMATION = "stop";
    
    private final static double BTN_WIDTH = 150;

    public RoadButton(String label, String id) {
        super(label);
        setId(id);
        
        //setWidth(BTN_WIDTH);
        setPrefWidth(BTN_WIDTH);
    }
    
    
}
