/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class Euro2016 extends Application {
    private final static String TITLE = "Euro2016";
    @Override
    public void start(Stage primaryStage) {
       
        Board board = new Board();
        
        Scene scene = new Scene(board);
        
        primaryStage.setTitle(TITLE);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        ControlWindow controlWindow = new ControlWindow(primaryStage, board);
        controlWindow.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
