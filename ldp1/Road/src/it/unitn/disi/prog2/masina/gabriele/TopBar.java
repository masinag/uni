/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Rappresenta una barra superiore della finestra.
 * Contiene un campo dove vengono mostrate le auto ancora disponibili e due 
 * bottoni per aggiungere un auto o per iniziare la fase di movimento delle auto.
 * 
 * @author gabriele
 */
public class TopBar extends HBox {
    private final static String N_CARS_LABEL = "Auto disponibili";
    private final static double SPACING = 20;
    private final static double PADDING_VALUE = 20;
    private final static Insets PADDING = new Insets(PADDING_VALUE, 0, PADDING_VALUE, 0);
    
    private int nCars;
    private TextField nCarsText;
    private RoadButton add, start_game;
    public TopBar(int nCars) {
        this.nCars = nCars;
        Label nCarsLabel = new Label(N_CARS_LABEL);
        nCarsText = new TextField("" + nCars);
        nCarsText.setEditable(false);
        add = new RoadButton("Aggiungi auto", RoadButton.ADD);
        start_game = new RoadButton("Inizia", RoadButton.START_GAME);
        
        getChildren().addAll(nCarsLabel, nCarsText, add, start_game);
        
        setAlignment(Pos.CENTER);
        setSpacing(SPACING);
        setPadding(PADDING);
    }
    
    public void decrementNCars(){
        nCarsText.setText("" + (--nCars));
        if(nCars == 0){
            add.setDisable(true);
        }
    }
    
}
