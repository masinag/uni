/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.prog2.masina.gabriele;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;

/**
 *
 * @author gabriele
 */
public class MyTilePane extends TilePane{
    final static int NROWS = 3, NCOLS = 3;
    MyGridButton btns [] = new MyGridButton[NROWS*NCOLS];

    MyTilePane(){
        setPrefRows(NROWS);
        setPrefColumns(NCOLS);
        addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                int i = Integer.parseInt(event.getCharacter());
                if (event.getCode().isDigitKey() || i < NROWS*NCOLS) {
                    if(getChildren().remove(btns[i])){
                        StackPane pane = new StackPane();
                        pane.setMinSize(MyGridButton.BTN_SIZE, MyGridButton.BTN_SIZE);
                        getChildren().add(i,pane);
                    }
                }
            }
        
        });
    }
    public void addButtons(){
        for(int i=0; i<NROWS*NCOLS; i++){
            MyGridButton btn = new MyGridButton(i);
            btns[i] = btn;
            getChildren().add(btn);
        }   
    }
}
