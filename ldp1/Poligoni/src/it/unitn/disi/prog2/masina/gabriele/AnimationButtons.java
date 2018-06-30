/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

/**
 *
 * @author gabriele
 */
class AnimationButtons extends SideButtons {
    private GameButton start, stop, reset;

    public AnimationButtons() {
        start = new GameButton("START", GameButton.START_ID);
        stop = new GameButton("STOP", GameButton.STOP_ID);
        reset = new GameButton("RESET", GameButton.RESET_ID);
        
        getChildren().addAll(start, stop, reset);
    }
    
}
