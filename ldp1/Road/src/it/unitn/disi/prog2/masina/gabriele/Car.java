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
public class Car extends Circle {
    private final static Paint COLOR = Color.RED,
            STROKE_COLOR = Color.BLACK;

    public Car(double size) {
        super(size/2, COLOR);
        setStroke(STROKE_COLOR);
    }
    
    
}
