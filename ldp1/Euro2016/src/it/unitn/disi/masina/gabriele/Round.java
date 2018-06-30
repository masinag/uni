/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import java.util.ArrayList;
import javafx.scene.layout.VBox;

/**
 * Rappresenta un girone del torneo.
 * @author gabriele
 */
public class Round extends VBox {
    private ArrayList<Team> teams;
    public Round(ArrayList<Team> teams) {
        this.teams = teams;
        getChildren().addAll(teams);
    }
    
}
