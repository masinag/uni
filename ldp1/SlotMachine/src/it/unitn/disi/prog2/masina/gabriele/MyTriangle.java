/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

/**
 *
 * @author gabriele
 */
public class MyTriangle extends Polygon {
    private final static Paint COLOR = Color.ORANGE,
            BORDER_COLOR = Color.BLACK;
    public MyTriangle() {
        super(0, Wheel.SYMBOL_SIZE, Wheel.SYMBOL_SIZE, Wheel.SYMBOL_SIZE,
               Wheel.SYMBOL_SIZE/2, 0);
        setId(Wheel.TRIANGLE);
        setFill(COLOR);
        setStroke(BORDER_COLOR);
    }

}
