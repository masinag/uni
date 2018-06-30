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
public class MoveHandler implements EventHandler<ActionEvent>{
    private Game game;
    public MoveHandler(Game game) {
        this.game = game;
    }
    
    @Override
    public void handle(ActionEvent event) {
        GameButton btn = (GameButton)event.getTarget();
        game.move(btn.getId());
    }
    
}
