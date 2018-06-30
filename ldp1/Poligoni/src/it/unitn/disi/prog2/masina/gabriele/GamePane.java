/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import java.util.HashSet;
import java.util.Iterator;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

/**
 * Pannello di gioco.
 * Pannello dove vengono mostrati i poligoni.
 * @author gabriele
 */
public class GamePane extends StackPane {
    /**
     * Dimensione dei poligoni.
     */
    public final static double POLY_SIZE = 60;
    private final static double SPACING = 10;
    private final static double PADDING_VALUE = 10;
    private final static Insets PADDING = new Insets(PADDING_VALUE);
    private final static double GAP = 10;
    private final static String VICTORY_TEXT = "Vince il %s";
    private HashSet<Shape> polygons;
    private HBox field;
    private Label victoryText;
    private Game game;
    
    /**
     * 
     * @param game 
     */
    public GamePane(Game game) {
        
        setStyle("-fx-background-color: white;");
        
        setPadding(PADDING);
        
        this.game = game;
     
        createPolygons();
        field = new HBox();
        field.getChildren().addAll(polygons);
        field.setSpacing(SPACING);
        victoryText = new Label();
        victoryText.setPadding(PADDING);
        victoryText.setStyle("-fx-background-color: white;"
                + "-fx-border-color: black");
        victoryText.setVisible(false);
        
        getChildren().addAll(field, victoryText);
    }
    
    private void createPolygons(){
        polygons = new HashSet<>();
        polygons.add(new MyTriangle());
        polygons.add(new MyCircle());
        polygons.add(new MySquare());
    }
    
    public boolean validPolygon(String text) {
        boolean valid = false;
        for (Iterator<Shape> iterator = polygons.iterator(); iterator.hasNext() && !valid;) {
            Shape p = iterator.next();
            valid = (p.getId().equals(text));        
        }
        return valid;
    }
    /**
     * 
     * @param poly_id
     * @param direction 
     */
    public void move(String poly_id, String direction){
        boolean polyFound = false;
        Shape poly = null;
        for (Iterator<Shape> iterator = polygons.iterator(); iterator.hasNext() && !polyFound;) {
            poly = iterator.next();
            polyFound = poly.getId().equals(poly_id);            
        }
        if(polyFound){
            switch(direction){
                case GameButton.DOWN_ID:
                    move(poly, GAP); break;
                case GameButton.UP_ID:
                    for (Shape p : polygons) {
                        if(p != poly)
                            move(p, -GAP);
                    }
            }
        }
    };
    
    private void move(Shape p, double gap){
        p.setTranslateY(p.getTranslateY() + gap);
        if(p.getTranslateY()+POLY_SIZE+PADDING_VALUE >= this.getHeight()){
            showVictory(p);
            game.victory();
        }
    }
    private void showVictory(Shape p){
        victoryText.setText(String.format(VICTORY_TEXT, p.getProperties().get("name")));
        victoryText.setVisible(true);
    }
    
    public void moveRandom(){
        for (Shape p : polygons) {
            move(p, (int)(Math.random()*GAP) + 1);
        }
    }
    
    public void reset(){
        for(Shape p : polygons) {
            p.setTranslateY(0);
        }
        victoryText.setVisible(false);
    }
}
