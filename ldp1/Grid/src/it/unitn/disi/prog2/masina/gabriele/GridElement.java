/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gabriele
 */
public class GridElement extends StackPane {
    private final static double DIM = 40, BORDER_SIZE = 2;
    private final static Paint BACKGROUND_COLOR = Color.WHITE,
            BORDER_COLOR = Color.BLACK, CIRCLE_COLOR = Color.BLUE;

    private Circle circle;
    public GridElement() {
        Rectangle border = new Rectangle(DIM+BORDER_SIZE, DIM+BORDER_SIZE, BORDER_COLOR);
        Rectangle rect = new Rectangle(DIM, DIM, BACKGROUND_COLOR);
        circle = new Circle(DIM/2, CIRCLE_COLOR);
        showCircle(false);
        getChildren().addAll(border, rect, circle);
        addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                showCircle(event.getTarget() instanceof Rectangle);                   
            }
            
        });
    }
    
    public void showCircle(boolean show){
        circle.setVisible(show);
    }
    
    public boolean getVisible(){
        return circle.isVisible();
    }
    
}
