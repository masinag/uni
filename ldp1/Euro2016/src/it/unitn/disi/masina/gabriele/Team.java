/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class Team extends HBox implements Comparable<Team> {
    private final static double NAME_WIDTH = 100;
    
    private final static double SPACING = 20;
    private final static double POINTS_WIDTH = 50;
    
    private Label pointsText;
    
    private int points;
    private String name;
    private Flag flag;
    
    public Team(String name, Flag flag) {
        setSpacing(SPACING);
        setAlignment(Pos.CENTER);
        
        pointsText = new Label();
        pointsText.setPrefWidth(POINTS_WIDTH);
        setPoints(0);
        
        this.name = name;
        this.flag = flag;
        
        Label nameText = new Label(name);
        nameText.setPrefWidth(NAME_WIDTH);
        getChildren().addAll(pointsText, nameText, flag);
    }
    
    
    private void setPoints(int p){
        points = p;
        pointsText.setText("" + p);
    }
    
    public int getPoints(){
        return points;
    }

    public String getName(){
        return name;
    }
    
    public void draw(){
        setPoints(points + Board.DRAW_POINTS);
    }
    public void win(){
        setPoints(points + Board.WIN_POINTS);
    }

    @Override
    public int compareTo(Team o) {
        int res = 0;
        if(getPoints() < o.getPoints())
            res = 1;
        else if(getPoints() > o.getPoints())
            res = -1;
        else
            res = getName().compareTo(o.getName());
        return res;
                    
    }
    
    
}
