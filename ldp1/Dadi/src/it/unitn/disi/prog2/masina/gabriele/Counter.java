/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class Counter extends HBox {
    private TextField textField;
    private Label label;
    private int counter;
    private final static double SPACING = 20;
    final static int START_VALUE = 10;
    Game game;
    public Counter(Game game) {
        this.game = game;
        setSpacing(SPACING);
        textField = new TextField();
        reset();

        textField.setEditable(false);
        label = new Label("Contatore");
        getChildren().addAll(label, textField);
    }
    public void setValue(int value){
        counter = value;
        textField.setText("" + value);
    }
    public int getValue(){
        return counter;
    }
    public void reset(){
        setValue(START_VALUE);
    }
    public void decrease(){
        textField.setText("" + (--counter));
        if(counter == 0){
            game.endGame();
        }
    }
}
