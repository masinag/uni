/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
public class UserField extends HBox {
    protected final static double SPACING = 10;
    
    protected TextField textField;
    protected Label label;
    public UserField() {        
        setSpacing(SPACING);
        
        label = new Label();
       
        textField = new TextField();
        textField.setEditable(false);
        textField.setFocusTraversable(false);
        getChildren().addAll(label, textField);
    }
}
