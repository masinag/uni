/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author gabriele
 */
class MoneyBox extends AnchorPane {
    private final static int START_COINS = 3;
    private final static double FIRST_TOP_DISTANCE = 50,
            FIRST_LEFT_DISTANCE = 20, DISTANCE_INCR = 20;
    
    private Coin coins[];

    public MoneyBox(Game game) {
        coins = new Coin[START_COINS];
        for(int i=0; i<START_COINS; i++){
            coins[i] = new Coin(game);
            AnchorPane.setTopAnchor(coins[i], FIRST_TOP_DISTANCE + DISTANCE_INCR*i);
            AnchorPane.setLeftAnchor(coins[i], FIRST_LEFT_DISTANCE + DISTANCE_INCR*i);
        }
        getChildren().addAll(coins);
    }
            
    
    
}
