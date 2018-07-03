/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gabriele
 */
public abstract class Ground extends StackPane {
    protected final static double GROUND_SIZE = 60;
    
    private Rectangle background;
    public Ground() {
        background = new Rectangle(GROUND_SIZE, GROUND_SIZE);
        getChildren().add(background);
    }
    
    protected void setBackground(Paint color){
        background.setFill(color);
    }
    
}
