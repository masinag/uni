/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 *
 * @author gabriele
 */
class TopLabel extends Label {
    private final static double FONT_SIZE = 20;
    private final static double PADDING_VALUE = 30;
    private final static String TEXT = "Slot Machine";
    private final static Font FONT = new Font(FONT_SIZE);

    public TopLabel() {
        super(TEXT);
        setAlignment(Pos.CENTER);
        setFont(FONT);
    }
    
    
}
