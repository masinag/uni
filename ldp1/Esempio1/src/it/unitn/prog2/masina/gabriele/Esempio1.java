/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.prog2.masina.gabriele;

import com.sun.webkit.dom.KeyboardEventImpl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class Esempio1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        MyTilePane root = new MyTilePane();
       
        root.addButtons();
        Scene scene = new Scene(root, MyTilePane.NCOLS*MyGridButton.BTN_SIZE, 
                                      MyTilePane.NROWS*MyGridButton.BTN_SIZE);
        
        root.getChildren().remove(root);
        primaryStage.setTitle("");
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
