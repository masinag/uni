/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;

/**
 *
 * @author gabriele
 */
public abstract class Flag extends FlowPane {
    protected final static double WIDTH = 50, HEIGHT = 30;

    public Flag() {
        setVgap(0);
        setHgap(0);
    }
    
}
