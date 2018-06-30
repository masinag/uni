/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class FieldsBox extends HBox {
    protected final static double SPACING = 20;
    
    private CreditField creditField;
    private ScoreField scoreField;
    

    public FieldsBox(SlotMachine slotMachine) {
        setSpacing(SPACING);
        
        creditField = new CreditField("Credito", slotMachine);
        scoreField = new ScoreField("Punteggio");
        
        getChildren().addAll(creditField, scoreField);
        
        
    }
    
    public CreditField getCreditField(){
        return creditField;
    }
    
    public ScoreField getScoreField(){
        return scoreField;
    }
    
    public void reset(){
        creditField.resetCredit();
        scoreField.resetScore();
    }
}
