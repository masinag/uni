/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 *
 * @author gabriele
 */
class Team extends HBox {
    private final static double SPACING = 20;
    
    private Text pointsText;
    
    private int points;
    private String name;
    private Flag flag;
    public Team(String name, Flag flag) {
        setSpacing(SPACING);
        setAlignment(Pos.CENTER);
        
        pointsText = new Text();
        setPoints(0);
        
        this.name = name;
        this.flag = flag;
        
        getChildren().addAll(pointsText, new Text(name), flag);
    }
    
    
    private void setPoints(int p){
        points = p;
        pointsText.setText("" + p);
    }
}
