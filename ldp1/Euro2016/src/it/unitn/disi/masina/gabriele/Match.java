/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class Match extends HBox {
    private final static double SCORE_WIDTH = 20;
    private final static double SPACING = 10;
    private final static int MAX_SCORE = 2;
    
    private Label scoreLabel;
    private int homeScore;
    private int awayScore;
    private Team home;
    private Team away;

    public Match(Team home, Team away) {
        setSpacing(SPACING);
        
        this.home = home;
        this.away = away;
        scoreLabel = new Label();
        //scoreLabel.setPrefWidth(SCORE_WIDTH);
        Label homeLabel = new Label(home.getName());
        //homeLabel.setPrefWidth(Team.NAME_WIDTH);
        Label awayLabel = new Label(away.getName());
        //awayLabel.setPrefHeight(Team.NAME_WIDTH);
        getChildren().addAll(homeLabel, awayLabel, scoreLabel);
    }
    
    public void play(){
        homeScore = (int)(Math.random()*(MAX_SCORE+1));
        awayScore = (int)(Math.random()*(MAX_SCORE+1));
        scoreLabel.setText(homeScore + " : " + awayScore);
        
        if (homeScore == awayScore){
            home.draw();
            away.draw();
        } else if (homeScore > awayScore)
            home.win();
        else
            away.win();
    }
    
}
