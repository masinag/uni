/*
 * To doClicked this license header, choose License Headers in Project Properties.
 * To doClicked this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author gabriele
 */
public class TopBarHandler implements EventHandler<ActionEvent>{

    private Road game;
    
    public TopBarHandler(Road game) {
        this.game = game;
    }

    @Override
    public void handle(ActionEvent event) {
        RoadButton btn = (RoadButton)event.getTarget();
        switch(btn.getId()){
            case RoadButton.ADD:
                game.getGameField().getGrid().setAddingCar(true);break;
            case RoadButton.START_GAME:
                game.startGame();
        }
    }
    
    
}
