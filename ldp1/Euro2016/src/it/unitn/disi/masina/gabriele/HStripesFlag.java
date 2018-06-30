/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 * Rappresenta una bandiera a tre strisce orizzontali
 * @author gabriele
 */
public class HStripesFlag extends Flag {

    public HStripesFlag(Paint color1, Paint color2, Paint color3) { 
        Rectangle r1 = new Rectangle(WIDTH, HEIGHT/3, color1);
        Rectangle r2 = new Rectangle(WIDTH, HEIGHT/3, color2);
        Rectangle r3 = new Rectangle(WIDTH, HEIGHT/3, color3);
        getChildren().addAll(r1, r2, r3);
    }
    
}
