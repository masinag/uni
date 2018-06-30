/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
class ErrorWindow extends Stage {
    private final static String ERROR = "'%s' non è un poligono valido. Sono accettati:\n"
            + "* 'T' per Triangolo\n"
            + "* 'C' per Cerchio\n"
            + "* 'Q' per Quadrato";
    private final static Insets PADDING = new Insets(30);
    private final static String TITLE = "Errore";
    private Text errorMessage;

    public ErrorWindow(Stage owner) {
        initOwner(owner);
        
        errorMessage = new Text();
        StackPane pane = new StackPane(errorMessage);
        pane.setPadding(PADDING);
        setTitle(TITLE);
        
        setScene(new Scene(pane));
        
    }
    public void showMessage(String wrongPolygon){
        errorMessage.setText(String.format(ERROR, wrongPolygon));
        show();
    }
    
    
    
}
