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
public class SlotButton extends Button {
    public final static String NEW_GAME_ID = "newGame",
            SPIN_ID = "spin", PAY_ID = "pay"; 

    public SlotButton(String text, String id) {
        super(text);
        setId(id);
    }
    
}
