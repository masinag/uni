/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class Road extends Application {
    private GameField gameField;
    private ControlWindow controls;
    @Override
    public void start(Stage primaryStage) {
        gameField = new GameField(this);
        controls = new ControlWindow(gameField);
        
        Scene scene = new Scene(gameField);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public GameField getGameField() {
        return gameField;
    }
    
    public void startGame(){
        controls.show();
    }
    
}
