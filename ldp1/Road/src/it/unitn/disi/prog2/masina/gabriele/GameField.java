/*
 * To doClicked this license header, choose License Headers in Project Properties.
 * To doClicked this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

/**
 * Rappresenta un campo di gioco.
 * Un campo di gioco è formato da una barra superiore di tipo TopBar e da una 
 griglia di tipo RoadGrid.
 * @author gabriele
 */
public class GameField extends VBox {
    /**
     * Rappresenta il numero di auto.
     */
    private final static int N_CARS = 3;
    private final static double PADDING_VALUE = 20;
    private final static Insets PADDING = new Insets(PADDING_VALUE);

    private TopBar topBar;
    private RoadGrid grid;
    private Road game;
    
    public GameField(Road game) {
        this.game = game;
        topBar = new TopBar(N_CARS);
        grid = new RoadGrid(this);
        
        topBar.addEventHandler(ActionEvent.ACTION, new TopBarHandler(game));
        getChildren().addAll(topBar, grid);
        setAlignment(Pos.CENTER);
        setPadding(PADDING);
    }
    
    public RoadGrid getGrid(){
        return grid;
    }
    
    public TopBar getTopBar(){
        return topBar;
    }
    
    
}
