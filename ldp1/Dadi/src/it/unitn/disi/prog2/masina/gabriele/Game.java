/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author gabriele
 */
class Game extends VBox {
    GreenField greenField;
    ButtonBox buttonBox;
    PopupWindow popup;
    public Game(PopupWindow popup) {
        this.popup = popup;
        greenField = new GreenField(this);
        buttonBox = new ButtonBox(this);
        getChildren().addAll(greenField, buttonBox);
        addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode().equals(KeyCode.R)){
                    reset();
                } else if (event.getCode().equals(KeyCode.S)) {
                    popup.printStatus();
                }
            }
            
        });
    }
    public ButtonBox getButtonBox(){
        return buttonBox;
    }
    public GreenField getGreenField(){
        return greenField;
    }
    public void endGame(){
        if(greenField.victory())
            popup.showWin();
        else
            popup.showGameOver();
    }
    public void printStatus(){
        popup.printStatus();
    }
    public void reset(){
        greenField.reset();
        buttonBox.reset();
    }
}
