/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author gabriele
 */
class Coin extends StackPane {
    public final static double COIN_RADIUS = 30.0;
    public final static double COIN_VALUE = 100;
    
    private final static String COIN_TEXT = "1 Euro";
    private final static Paint COIN_COLOR = Color.CORNFLOWERBLUE;
    private final static Paint TEXT_COLOR = Color.WHITE;
    
    private Game game;
    
    private TranslateTransition anim;
    public Coin(Game game) {
        this.game = game;
        Circle circle = new Circle(COIN_RADIUS, COIN_COLOR);
        circle.setStroke(TEXT_COLOR);
        
        Label label = new Label(COIN_TEXT);
        label.setTextFill(TEXT_COLOR);
        
        getChildren().addAll(circle, label);
        addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                game.getSlotMachine().incrCredit(COIN_VALUE);
                disappear();
            }
            
        });
        anim = new TranslateTransition(Duration.seconds(1), this);
        anim.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setTranslateX(0);
                setTranslateY(0);
                setVisible(false);
            }
        });
    }
    
    private void disappear(){
        System.out.println("Y: " + (getLayoutY()) +
                "\nslotY:  " + game.getSlotMachine().getLayoutY() +
                "\nslotW: " + game.getSlotMachine().getWidth());
        double posX = -((getParent().getLayoutX() + getLayoutX())-
                (game.getSlotMachine().getLayoutX() + game.getSlotMachine().getWidth())) - 
                game.getSlotMachine().getWidth()/2 - COIN_RADIUS;
        double posY = - getLayoutY() + game.getSlotMachine().getLayoutY();
        anim.setToX(posX);
        anim.setToY(posY);
        anim.play();
    }
    
}
