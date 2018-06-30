/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author gabriele
 */
public class Display extends TextField{
    final static int WIDTH = 250, FONT_SIZE = 20;
    final static String DEFAULT_TEXT = "0";
    Display(){
        setFocusTraversable(false);
        setShape(new Rectangle(WIDTH, DisplayBox.HEIGHT));
        setMinWidth(WIDTH);
        setMaxWidth(WIDTH);
        setMinHeight(DisplayBox.HEIGHT);
        setFont(new Font(FONT_SIZE));
        setEditable(false);
        setAlignment(Pos.CENTER_RIGHT);
        setText(DEFAULT_TEXT);
        setStyle("-fx-border-color: black;");
    }
}
