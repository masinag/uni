/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class ControlWindow extends Stage {
    private final static String TITLE = "Controlli";
    private final static double SPACING = 20;
    private final static Insets PADDING = new Insets(SPACING);
    private GameField gameField;
    private RoadButton up, down, left, right, random, start, stop;
    public ControlWindow(GameField gameField) {
        this.gameField = gameField;
        
        up = new RoadButton("Su", RoadButton.UP);
        down = new RoadButton("Giù", RoadButton.DOWN);
        left = new RoadButton("Sinistra", RoadButton.LEFT);
        right = new RoadButton("Destra", RoadButton.RIGHT);
        random = new RoadButton("Random", RoadButton.RANDOM);
        start = new RoadButton("Start", RoadButton.START_ANIMATION);
        stop = new RoadButton("Stop", RoadButton.STOP_ANIMATION);
        
        stop.setDisable(true);
        
        setTitle(TITLE);
        
        TilePane btns = new TilePane(up, down, left, right, random, start, stop);
        btns.addEventHandler(ActionEvent.ACTION, new ControlHandler(this, gameField));
        
        btns.setPrefColumns(2);
        btns.setPadding(PADDING);
        btns.setHgap(SPACING);
        btns.setVgap(SPACING);
        setScene(new Scene(btns));
    }
    
    public void setPlay(boolean play){
        start.setDisable(play);
        stop.setDisable(!play);
    }
}
