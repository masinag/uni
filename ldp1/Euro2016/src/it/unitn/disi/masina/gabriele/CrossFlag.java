/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 * Rappresenta una bandiera con una croce.
 * @author gabriele
 */
public class CrossFlag extends Flag {

    private final static double CROSS_WIDTH = 2;
    public CrossFlag(Paint backColor, Paint crossColor) {
        
        setStyle("-fx-background-color: red");
        
        //setAlignment(Pos.TOP_LEFT);
        
        double height = (HEIGHT-CROSS_WIDTH)/2;
        
        Rectangle sq1 = new Rectangle(height, height, backColor);
        Rectangle sq2 = new Rectangle(height, height, backColor);
        Rectangle r1 = new Rectangle(WIDTH - CROSS_WIDTH - height, height, backColor);
        Rectangle r2 = new Rectangle(WIDTH - CROSS_WIDTH - height, height, backColor);
        
        Rectangle c1 = new Rectangle(CROSS_WIDTH, height, crossColor);
        Rectangle c2 = new Rectangle(WIDTH, CROSS_WIDTH, crossColor);
        Rectangle c3 = new Rectangle(CROSS_WIDTH, height, crossColor);
       
        VBox container = new VBox(new HBox(sq1, c1, r1),
                                    c2,
                                    new HBox(sq2, c3, r2));
        getChildren().addAll(container);
    }
    
}
