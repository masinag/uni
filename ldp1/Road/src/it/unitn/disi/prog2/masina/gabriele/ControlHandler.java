/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author gabriele
 */
public class ControlHandler implements EventHandler<ActionEvent>{
    private GameField gameField;
    private ControlWindow controlWindow;
    public ControlHandler(ControlWindow controlWindow, GameField gameField) {
        this.controlWindow = controlWindow;
        this.gameField = gameField;
    }

    @Override
    public void handle(ActionEvent event) {
        RoadButton btn = (RoadButton)event.getTarget();
        switch(btn.getId()){
            case RoadButton.UP:
            case RoadButton.DOWN:
            case RoadButton.LEFT:
            case RoadButton.RIGHT:
            case RoadButton.RANDOM:
                gameField.getGrid().moveCars(btn.getId()); break;
            case RoadButton.START_ANIMATION:
                gameField.getGrid().playAnimation(true); 
                controlWindow.setPlay(true);
                break;
            case RoadButton.STOP_ANIMATION:
                gameField.getGrid().playAnimation(false); 
                controlWindow.setPlay(false);
                break;
               
        }
    }
    
    
}
