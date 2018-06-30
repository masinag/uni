/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gabriele
 */
public class MyVRectangle extends Rectangle {
    private final static Paint COLOR = Color.PINK,
            BORDER_COLOR = Color.BLACK;
    public MyVRectangle() {
        super(Wheel.SYMBOL_SIZE/2, Wheel.SYMBOL_SIZE, COLOR);
        setId(Wheel.VRECT);
        setStroke(BORDER_COLOR);
    }
}
