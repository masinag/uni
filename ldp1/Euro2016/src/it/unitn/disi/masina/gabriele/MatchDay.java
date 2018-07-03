/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author gabriele
 */
public class MatchDay extends VBox {
    public final static int FIRST = 0, SECOND = 1, THIRD = 2;
    
    //private final static double SPACING = 20;
    private final static String TITLE = "=== %d a giornata ===";
    private final static double FONT_SIZE = 15;
    private final static Font FONT = Font.font("Arial", FontWeight.BOLD, FONT_SIZE);
    
    
    private ArrayList<Match> matches;
    public MatchDay(ArrayList<Team> teams, int day) {
        
        
        //setSpacing(SPACING);
        matches = new ArrayList<>();
        switch(day){
            case FIRST:
                matches.add(new Match(teams.get(0), teams.get(1)));
                matches.add(new Match(teams.get(2), teams.get(3))); break;
            case SECOND:
                matches.add(new Match(teams.get(0), teams.get(2)));
                matches.add(new Match(teams.get(1), teams.get(3))); break;
            case THIRD:
                matches.add(new Match(teams.get(0), teams.get(3)));
                matches.add(new Match(teams.get(1), teams.get(2))); break;
        }
        Label title = new Label(String.format(TITLE, day+1));
        title.setFont(FONT);
        getChildren().add(title);
        getChildren().addAll(matches);
    }
    
    public void play(){
        for (Match match : matches) {
            match.play();
        }
    }
    
}
