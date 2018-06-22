/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.prog2.masina.gabriele;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author gabriele
 */
public class MyGrid extends GridPane{
    private int rows, cols;
    private MyGridButton btns[];
    private MyGridPane pane;
    public MyGrid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        btns = new MyGridButton[rows*cols-1];
        addButtons();
        pane = new MyGridPane(rows-1, cols-1);
        add(pane, pane.getCol(), pane.getRow());
        addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                char c = event.getCharacter().charAt(0);
                if(Character.isDigit(c))
                    moveButton(Integer.parseInt("" + c));
            }
        });
    }
    
    private void addButtons(){
        int i;
        for(i=0; i<rows-1; i++)
            for(int j=0; j<cols; j++)
                addButton(i, j);
        
        for(int j=0; j<cols-1; j++)
            addButton(i, j);
    }
    
    private void addButton(int i, int j){
        MyGridButton btn = new MyGridButton(i*cols+j+1, i, j);
        btns[i*cols+j] = btn;
        add(btn, j, i);
    }
    private void moveButton(int n){
        if(0<n && n<rows*cols){
            if(btns[n-1].isCloseToPane(pane)){
                swap(btns[n-1], pane);  
            }
        }
    }
    private void swap(MyGridButton btn, MyGridPane pane){
        int tmp = pane.getRow();
        pane.setRow(btn.getRow());
        btn.setRow(tmp);
        tmp = pane.getCol();
        pane.setCol(btn.getCol());
        btn.setCol(tmp);
        
        setRowIndex(btn, btn.getRow());
        setColumnIndex(btn, btn.getCol());
        setRowIndex(pane, pane.getRow());
        setColumnIndex(pane, pane.getCol());
    }
}
