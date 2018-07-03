/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author gabriele
 */
public class CrashWindow extends Stage {

    private static double PADDING_VALUE = 30;
   
    private final static String ERROR_MESSAGE = "Crash!";
    private final static Insets PADDING = new Insets(PADDING_VALUE);
    
    private Label text;

    public CrashWindow() {
        text = new Label(ERROR_MESSAGE);
        text.setPadding(PADDING);
        setScene(new Scene(text));
        initModality(Modality.APPLICATION_MODAL);
        
        setOnHiding(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.exit(0);
            }
        });
    }
    
    
    
}
