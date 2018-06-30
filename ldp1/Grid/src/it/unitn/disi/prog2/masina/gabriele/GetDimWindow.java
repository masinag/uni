/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
class GetDimWindow extends Stage {
    private final static String TITLE = "Scegli la dimensione";
    private final static double SPACING = 20;
    private final static Insets PADDING = new Insets(30);
    private Label label;
    private TextField text;
    private GridButton submit;
    public GetDimWindow() {
        setTitle(TITLE);
        
        label = new Label(TITLE);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        text = new TextField();
        submit = new GridButton("Conferma", GridButton.SUBMIT);
        
        VBox root = new VBox(label, text, submit);
        root.setSpacing(SPACING);
        root.setPadding(PADDING);
        setScene(new Scene(root));
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hide();
            }
        });
    }
    
    public String getText(){
        return text.getText();
    }
    
}
