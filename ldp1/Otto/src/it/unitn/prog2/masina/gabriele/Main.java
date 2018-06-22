/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.prog2.masina.gabriele;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class Main extends Application{
    final static int N_ROWS = 3;
    final static int N_COLS = 3;
    
    @Override
    public void start(Stage primaryStage) {
        MyGrid pane = new MyGrid(N_ROWS, N_COLS);
        Scene scene = new Scene(pane);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
