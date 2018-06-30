/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
public class ButtonsBar extends HBox{
    private final static double SPACING = 20;
    public ButtonsBar() {
        setSpacing(SPACING);
        setAlignment(Pos.CENTER);
    }
    
}
