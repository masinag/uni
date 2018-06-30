/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

/**
 *
 * @author gabriele
 */
public class MyTriangle extends Polygon {
    public final static String ID = "T";
    private final static String NAME = "Triangolo";
    
    private final static Paint COLOR = Color.YELLOW, STROKE = Color.BLACK;;
    public MyTriangle() {
        super(0, GamePane.POLY_SIZE,
                GamePane.POLY_SIZE/2, 0,
                GamePane.POLY_SIZE, GamePane.POLY_SIZE);
        setFill(COLOR);
        setStroke(STROKE);
        setId(ID);
        getProperties().put("name", NAME);
    }
    
}
