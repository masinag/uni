/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import java.util.ArrayList;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;

/**
 * Rappresenta il tabellone del torneo.
 * Contiene e mostra i 4 gironi.
 * @author gabriele
 */
public class Board extends TilePane {

    private final static int PREF_COLS = 2;
    private final static int N_ROUNDS = 4;
    
    private ArrayList<Round> rounds;
    private ArrayList<Team> teams;
    public Board() {
        setPrefRows(PREF_COLS);

        createTeams();
        addTeamsToRounds();
        
        getChildren().addAll(rounds);
    }

    
    private void createTeams(){
        teams = new ArrayList<>();
        teams.add(new Team("Austria", new HStripesFlag(Color.RED, Color.WHITE, Color.RED)));
        teams.add(new Team("Svezia", new CrossFlag(Color.BLUE, Color.YELLOW)));   
        teams.add(new Team("Italia", new VStripesFlag(Color.GREEN, Color.PINK, Color.RED)));

    }
    
    private void addTeamsToRounds(){
        rounds = new ArrayList<>();
        Round r1 = new Round(teams);
    
        rounds.add(r1);
        
    }
    
    
}
