/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class Game extends HBox {
    
    private final static double PADDING_VALUE = 20;
    private final static Insets PADDING = new Insets(PADDING_VALUE);
    
    
    private SlotMachine slotMachine;
    private MoneyBox moneyBox;
    
    public Game() {
        
        setPadding(PADDING);
   
        slotMachine = new SlotMachine(this);
        moneyBox = new MoneyBox(this);
        getChildren().addAll(slotMachine, moneyBox);
        
    }
    
    public SlotMachine getSlotMachine(){
        return slotMachine;
    }

    
    public void spin(){
        slotMachine.spin();
    }
}
