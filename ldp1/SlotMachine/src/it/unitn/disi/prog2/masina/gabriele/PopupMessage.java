/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class PopupMessage extends Stage {
    public final static String NOT_ENOUGH_CREDIT = "Non hai credito sufficiente";
    public final static String VICTORY = "Hai vinto";
    public final static String PAY = "Hai vinto %.2f Euro";
    private Text message;
    public PopupMessage() {
        setTitle("Messaggio");
        
        message = new Text();
        StackPane pane = new StackPane(message);
        setScene(new Scene(pane));
    }
    public void show(String message){
        this.message.setText(message);
        show();
    }
    
}
