/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author gabriele
 */
public class MyEllipse extends Ellipse {
    private final static Paint COLOR = Color.YELLOW,
            BORDER_COLOR = Color.BLACK;
    public MyEllipse() {
        super(Wheel.SYMBOL_SIZE/2, Wheel.SYMBOL_SIZE/4);
        setId(Wheel.ELLIPSE);
        setFill(COLOR);
        setStroke(BORDER_COLOR);
    }
}
