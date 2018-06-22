/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
public class ButtonBox extends HBox {
    private Button reset, print;
    private TransitionButton transition;
    private Counter counter;
    final static int SPACING = 10;
    final static String TRANSITION_ID = "transition",
            RESET_ID = "reset", PRINT_ID = "print";
    private Game game;
    public ButtonBox(Game game) {
        this.game = game;
        reset = new Button("RESET");
        reset.setId(RESET_ID);
        print = new Button("PRINT");
        print.setId(PRINT_ID);
        transition = new TransitionButton();
        transition.setId(TRANSITION_ID);
        counter = new Counter(game);
        setSpacing(SPACING);
        setMinWidth(100);
        getChildren().addAll(reset, print, transition, counter);
        setAlignment(Pos.CENTER);
        addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Button btn = (Button)(event.getTarget());
                if(btn.getId().equals(TRANSITION_ID))
                    ((TransitionButton)btn).changeValue();
                else if (btn.getId().equals(PRINT_ID))
                    game.printStatus();
                else if (btn.getId().equals(RESET_ID))
                    game.reset();
            }   
        });
    }
    public Counter getCounter(){
        return counter;
    }
    public void reset(){
        counter.reset();
        transition.reset();
    }
    public TransitionButton getTransition(){
        return transition;
    }
}
