/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class ButtonsBox extends HBox{
    private final static double SPACING = 30;
    private SlotButton newGame, spin, pay;
    private Game game;
    public ButtonsBox(Game game) {
        setSpacing(SPACING);
        setAlignment(Pos.CENTER);
        
        this.game = game;        
        newGame = new SlotButton("Nuova partita", SlotButton.NEW_GAME_ID);
        spin = new SlotButton("Spin", SlotButton.SPIN_ID);
        pay = new SlotButton("Pay", SlotButton.PAY_ID);
        getChildren().addAll(newGame, spin, pay);
        addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                SlotButton btn = (SlotButton)event.getTarget();
                switch(btn.getId()){
                    case SlotButton.NEW_GAME_ID: game.getSlotMachine().newGame(); break;
                    case SlotButton.SPIN_ID: game.spin(); break;
                    case SlotButton.PAY_ID: game.getSlotMachine().pay();
                }
            }
            
        
        });
    }
    
    public void enableButtons(boolean enable){
        spin.setDisable(!enable);
        pay.setDisable(!enable);
    }
    
    
}
