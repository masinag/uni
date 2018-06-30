/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author gabriele
 */
class DeleteButton extends Button {
    
    public DeleteButton() {
        this.setText("C");
        int size = DisplayBox.HEIGHT;
        setMinSize(size, size);
        setShape(new Rectangle(size, size));
        this.setStyle("-fx-background-color: red;"
                + "-fx-border-width: 1px;"
                + "-fx-border-color: black;"
                + "-fx-text-fill: white");
        setId(Calculator.DELETE);
    }
    
}
