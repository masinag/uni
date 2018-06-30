/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author gabriele
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        GetDimWindow getDimWindow = new GetDimWindow();
        getDimWindow.setOnHiding(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                int dim = 0;
                do {
                    try {
                        dim = Integer.parseInt(getDimWindow.getText());
                    } catch (NumberFormatException e){
                        System.out.println("Dimensione non valida");
                    }
                } while(dim < 0);
                startApplication(dim, primaryStage);
            }
        });
        getDimWindow.show();
    }
    
    private void startApplication(int dim, Stage primaryStage){
        Holder holder = new Holder(dim);
        primaryStage.setTitle("Griglia");
        primaryStage.setScene(new Scene(holder));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
