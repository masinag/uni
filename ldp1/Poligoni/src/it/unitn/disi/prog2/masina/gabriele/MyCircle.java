/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 *
 * @author gabriele
 */
public class MyCircle extends Circle {

    public final static String ID = "C";
    private final static String NAME = "Cerchio";
    
    private final static Paint COLOR = Color.RED, STROKE = Color.BLACK;;
    public MyCircle() {
        super(GamePane.POLY_SIZE/2, COLOR);
        setStroke(STROKE);
        setId(ID);
        getProperties().put("name", NAME);
    }
    
}
