/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class GreenField extends HBox {
    final static int HEIGHT = 300, WIDTH = 500, NDICES=3, SPACING = 60;
    final static Insets PADDING = new Insets(SPACING);
    Dice dices[];
    Game game;
    public GreenField(Game game) {
        this.game = game;
        // setMinSize(WIDTH, HEIGHT);
        setSpacing(SPACING);
        setPadding(PADDING);
        setStyle("-fx-background-color: green");
        dices = new Dice[NDICES];
        for(int i=0; i<NDICES; i++)
            dices[i] = new Dice(this);
        getChildren().addAll(dices);
        addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                showNextDice();
            }
        });
    }
    private void showNextDice(){
        boolean diceShowed = false;
        for(int i=0; i<NDICES && !diceShowed; i++)
            if(!dices[i].isVisible()){
                System.out.println("Showing dice");
                dices[i].setVisible(true);
                diceShowed = true;
            }
    }
    public Dice[] getDices(){
        return dices;
    }
    public void reset(){
        for(int i=0; i<NDICES; i++)
            dices[i].reset();
    }

    public boolean allDicesVisible() {
        boolean allDicesVisible = true;
        for(int i=0; i<NDICES && allDicesVisible; i++)
            allDicesVisible = dices[i].isVisible();
        return allDicesVisible;
    }
    
    public Game getGame() {
        return game;
    }

    public boolean victory() {
        int min, max, other;
        min = max = other = dices[0].getValue();
        for(int i=1; i<NDICES; i++){
            int currValue = dices[i].getValue();
            if (currValue < min){
                other = min;
                min = currValue;
            } else if (currValue > max){
                other = max;
                max = currValue;
            }else
                other = currValue;
        }
        return (other == max-1 && other == min+1);        
    }
}
