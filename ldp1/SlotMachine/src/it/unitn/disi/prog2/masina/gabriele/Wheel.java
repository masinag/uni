/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

/**
 *
 * @author gabriele
 */
class Wheel extends StackPane{
    public final static double SYMBOL_SIZE = 40;
    public final static String CIRCLE = "circle", ELLIPSE = "ellipse", HEX = "hex",
            HRECT = "hrect", VRECT = "vrect", TRIANGLE = "triangle";
    private Shape symbols[];
    private final static double PADDING_VALUE = 40;
    private final static Insets PADDING = new Insets(PADDING_VALUE);
    private final static Paint BACKGROUND_COLOR = Color.WHITE;
    private final static Paint BORDER_COLOR = Color.BLACK;
    private Shape symbol;
    private Game game;
    
    public Wheel(Game game) {
        createSymbols();
        setPadding(PADDING);
        
        this.game = game;
        Rectangle background = new Rectangle(SYMBOL_SIZE+PADDING_VALUE,
        SYMBOL_SIZE+PADDING_VALUE, BACKGROUND_COLOR);
        background.setStroke(BORDER_COLOR);
        
        getChildren().addAll(background, symbols[0]);
        
        addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                if(game.getSlotMachine().getScore()>0){
                    spin(true);
                    game.getSlotMachine().divideScore();
                }                
            }
            
        });
    }

    private void createSymbols() {
        symbols = new Shape[] {
            new MyCircle(), 
            new MyHRectangle(),
            new MyVRectangle(),
            new MyHexagon(),
            new MyTriangle(),
            new MyEllipse()
        };
    }
    
    public void spin(boolean checkVictory){
        setSymbolWithAnimation((int)(Math.random()*symbols.length), checkVictory);
    }

    private void setSymbolWithAnimation(int i, boolean checkVictory) {
        Shape currentSymbol = (Shape)getChildren().get(1);
        FadeTransition fade = new FadeTransition(Duration.seconds(1), currentSymbol);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                currentSymbol.setOpacity(1);
                setSymbol(i);
                if(checkVictory) game.getSlotMachine().checkVictory();
            }
        });
        fade.play();
    }
    private void setSymbol(int i){
        getChildren().set(1, symbols[i]);
    }
    private String getSymbolId(){
        return getChildren().get(1).getId();
    }

    @Override
    public boolean equals(Object obj) {
        boolean eq = false;
        if(obj instanceof Wheel){
            eq = ((Wheel)obj).getSymbolId().equals(getSymbolId());
        }
        return eq;
    }
}
