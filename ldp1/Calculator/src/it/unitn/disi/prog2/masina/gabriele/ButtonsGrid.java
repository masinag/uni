/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;

/**
 *
 * @author gabriele
 */
public class ButtonsGrid extends TilePane{
    final static int NROWS = 4, NCOLS = 4, SPACING = 20;    
    public ButtonsGrid(Calculator calc) {
        setVgap(SPACING);
        setHgap(SPACING);
        
        setPrefRows(NROWS);
        setPrefColumns(NCOLS);
        addButtons();
    }
    
    private void addButtons(){
        addButton("+");
        addButton("=", Calculator.EVALUATE);
        addButton(".");
        addButton("0");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                addButton("" + (3*(i+1)-j));
        addButton("/", 3);
        addButton("*", 7);
        addButton("-", 11);
    }
    private void addButton(String s){
        addButton(s, 0);
    }
    private void addButton(String s, String id){
        addButton(s, id, 0);
    }
    private void addButton(String s, int i){
        addButton(s, s, i);
    }
    private void addButton(String s, String id, int i){
        addButton(new CalcButton(s, id), i);
    }
    private void addButton(CalcButton b, int i){
        getChildren().add(i, b);
    }

    
}
