/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.prog2.masina.gabriele;

import javafx.scene.control.Button;

/**
 *
 * @author gabriele
 */
public class MyGridButton extends Button{
    final static int SIZE = 100;
    private int row, col;
    public MyGridButton(int label, int row, int col) {
        setText("" + label);
        this.row = row;
        this.col = col;
        setMinSize(SIZE, SIZE);
        setMaxSize(SIZE, SIZE);
    }
    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }
    boolean isCloseToPane(MyGridPane pane){
        return (getRow() == pane.getRow()-1 && getCol() == pane.getCol()) ||
               (getRow() == pane.getRow() && getCol() == pane.getCol()-1) ||
               (getRow() == pane.getRow() && getCol() == pane.getCol()+1) ||
               (getRow() == pane.getRow()+1 && getCol() == pane.getCol());
    }
}
