/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Rappresenta il tabellone del torneo.
 * Contiene e mostra i 4 gironi.
 * @author gabriele
 */
public class Board extends TilePane {
    public final static int DRAW_POINTS = 1;
    public final static int WIN_POINTS = 3;
    
    private final static int PREF_COLS = 2;
    private final static int N_ROUNDS = 4;
    private final static int N_TEAMS_PER_ROUND = 4;
    private final static double SPACING = 20;
    
    private final Insets PADDING = new Insets(SPACING);
    
    private ArrayList<Round> rounds;
    private ArrayList<Team> teams;
    public Board() {
        
        setPrefColumns(PREF_COLS);
        setHgap(SPACING);
        setVgap(SPACING);
        setPadding(PADDING);
        
        createTeams();
        createRounds();
        
        getChildren().addAll(rounds);
    }

    
    private void createTeams(){
        teams = new ArrayList<>();
        teams.add(new Team("Spagna", new H3StripesFlag(Color.RED, Color.YELLOW, Color.RED)));
        teams.add(new Team("Germaina", new H3StripesFlag(Color.RED, Color.YELLOW, Color.BLACK)));
        teams.add(new Team("Russia", new H3StripesFlag(Color.WHITE, Color.RED, Color.BLUE)));
        teams.add(new Team("Olanda", new H3StripesFlag(Color.RED, Color.WHITE, Color.BLUE)));
        teams.add(new Team("Bulgaria", new H3StripesFlag(Color.WHITE, Color.GREEN, Color.RED)));
        teams.add(new Team("Ungheria", new H3StripesFlag(Color.RED, Color.WHITE, Color.GREEN)));
        teams.add(new Team("Austria", new H3StripesFlag(Color.RED, Color.WHITE, Color.RED)));
         
        teams.add(new Team("Italia", new VStripesFlag(Color.GREEN, Color.WHITE, Color.RED)));
        teams.add(new Team("Belgio", new VStripesFlag(Color.RED, Color.YELLOW, Color.BLACK)));
        teams.add(new Team("Irlanda", new VStripesFlag(Color.ORANGE, Color.WHITE, Color.GREEN)));
        teams.add(new Team("Francia", new VStripesFlag(Color.RED, Color.WHITE, Color.BLUE)));

        teams.add(new Team("Svezia", new CrossFlag(Color.BLUE, Color.YELLOW)));
        teams.add(new Team("Finlandia", new CrossFlag(Color.WHITE, Color.BLUE)));
        teams.add(new Team("Danimarca", new CrossFlag(Color.RED, Color.WHITE)));  

        teams.add(new Team("Polonia", new H2StripesFlag(Color.WHITE, Color.RED))); 
        teams.add(new Team("Ucraina", new H2StripesFlag(Color.BLUE, Color.YELLOW))); 

    }
    
    private void createRounds(){
        rounds = new ArrayList<>();
        ArrayList<Team> temp = new ArrayList<>(teams);
        for(int i=0; i<N_ROUNDS; i++){
            // scelgo N_TEAMS_PER_ROUND squadre non ancora scelte;
            ArrayList<Team> round_teams = new ArrayList<>();
            for(int j=0; j<N_TEAMS_PER_ROUND; j++){
                int pos = (int)(Math.random()*temp.size());
                round_teams.add(temp.get(pos));
                temp.remove(pos);
            }
            rounds.add(new Round(round_teams));
        }
        
    }
    
    public void playDay(int i){
        for (Round round : rounds) {
            round.playDay(i);
        }
    }
    
    
}
