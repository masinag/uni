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
public class MySquare extends Rectangle {

    public final static String ID = "Q";
    private final static String NAME = "Quadrato";
    
    private final static Paint COLOR = Color.BLUEVIOLET,
            STROKE = Color.BLACK;
    
    public MySquare() {
        super(GamePane.POLY_SIZE, GamePane.POLY_SIZE, COLOR);
        setStroke(STROKE);
        setId(ID);
        getProperties().put("name", NAME);
    }
    
}
