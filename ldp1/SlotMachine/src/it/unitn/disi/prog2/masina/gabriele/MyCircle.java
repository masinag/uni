/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
/**
 *
 * @author gabriele
 */
public class MyCircle extends Circle {
    private final static Paint COLOR = Color.RED,
            BORDER_COLOR = Color.BLACK;
    public MyCircle() {
        super(Wheel.SYMBOL_SIZE/2, COLOR);
        setId(Wheel.CIRCLE);
        setStroke(BORDER_COLOR);
    }
    
}
