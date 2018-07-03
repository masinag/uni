/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 * Rappresenta una bandiera a tre strisce verticali.
 * @author gabriele
 */
public class VStripesFlag extends Flag {

    public VStripesFlag(Paint color1, Paint color2, Paint color3) {
        
        Rectangle r1 = new Rectangle(WIDTH/3, HEIGHT, color1);
        Rectangle r2 = new Rectangle(WIDTH/3, HEIGHT, color2);
        Rectangle r3 = new Rectangle(WIDTH/3, HEIGHT, color3);
        getChildren().addAll(new HBox(r1, r2, r3));
    }
    
}
