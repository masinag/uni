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
class MoveButtons extends SideButtons {
    private GameButton up, down;

    public MoveButtons() {
        up = new GameButton("UP", GameButton.UP_ID);
        down = new GameButton("DOWN", GameButton.DOWN_ID);
        getChildren().addAll(up, down);
    }
    
}
