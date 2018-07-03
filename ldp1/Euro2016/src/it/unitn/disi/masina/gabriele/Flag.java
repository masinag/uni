/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gabriele
 */
public abstract class Flag extends StackPane {
    protected final static double WIDTH = 60, HEIGHT = 36;
    
    private final static double BORDER_WIDTH = 3;
    private final static Paint BORDER_COLOR = Color.BLACK;
    public Flag() {
        getChildren().add(new Rectangle(WIDTH + BORDER_WIDTH, HEIGHT + BORDER_WIDTH,
            BORDER_COLOR));
        
        //setMaxWidth(WIDTH);
        
    }
    
}
