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
public class Main extends Application {
    private final static int WINDOW_SIZE = 400;
    @Override
    public void start(Stage primaryStage) {
        
        Game game = new Game(primaryStage);
        
        Scene scene = new Scene(game, WINDOW_SIZE, WINDOW_SIZE);
        primaryStage.setTitle("Poligoni");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
