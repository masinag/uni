/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;

/**
 *
 * @author gabriele
 */
class BottomBar extends ButtonsBar {
    private GridButton print, clear, step, start, stop;
    public BottomBar() {
        print = new GridButton("Print", GridButton.PRINT);
        clear = new GridButton("Clear", GridButton.CLEAR);
        step = new GridButton("Step", GridButton.STEP);
        start = new GridButton("Start", GridButton.START);
        stop = new GridButton("Stop", GridButton.STOP);
        getChildren().addAll(print, clear, step, start, stop);
    }
}
