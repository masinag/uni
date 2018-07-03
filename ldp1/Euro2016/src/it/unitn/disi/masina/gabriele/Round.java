/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

/**
 * Rappresenta un girone del torneo.
 * @author gabriele
 */
public class Round extends VBox {    
    private ArrayList<Team> teams;
    private ArrayList<MatchDay> matchDays;
    private Ranking ranking;
    
    private final static double SPACING = 20;
    private final static Insets PADDING = new Insets(SPACING);
    
    
    public Round(ArrayList<Team> teams) {
        setStyle("-fx-border-color: black");
        setPadding(PADDING);
        setSpacing(SPACING);
        
        this.teams = teams;
        matchDays = new ArrayList<>();
        matchDays.add(new MatchDay(teams, MatchDay.FIRST));
        matchDays.add(new MatchDay(teams, MatchDay.SECOND));
        matchDays.add(new MatchDay(teams, MatchDay.THIRD));
        VBox matchesBox = new VBox();
        matchesBox.getChildren().addAll(matchDays);
        
        ranking = new Ranking(teams);
        
        getChildren().addAll(matchesBox, ranking);
    }
    
    public void playDay(int i){
        matchDays.get(i).play();
        ranking.refresh();
    }
}
