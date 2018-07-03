/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import java.util.ArrayList;
import java.util.Collections;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author gabriele
 */
public class Ranking extends VBox {
    private final static String TITLE = "CLASSIFICA";
    private final static double SPACING = 5;
    private ArrayList<Team> teams;

    public Ranking(ArrayList<Team> teams) {
        setSpacing(SPACING);
        
        this.teams = teams;
        Collections.sort(this.teams);
        Label title = new Label(TITLE);
        
        setAlignment(Pos.CENTER);
        getChildren().add(title);
        getChildren().addAll(teams);
    }
    
    public void refresh(){
        getChildren().removeAll(teams);
        Collections.sort(teams);
        getChildren().addAll(teams);
    }
}
