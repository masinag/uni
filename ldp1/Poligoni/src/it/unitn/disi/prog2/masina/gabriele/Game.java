/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author gabriele
 */
class Game extends BorderPane {
    private final static Insets PADDING = new Insets(10);
    
    private TextField textField;
    private GamePane gamePane;
    private MoveButtons moveButtons;
    private AnimationButtons animationButtons;
    private ErrorWindow errorWindow;
    private Timeline animation;
    private Stage primaryStage;
    
    public Game(Stage primaryStage) {
        //setPadding(PADDING);
        
        textField = new TextField();
        
        gamePane = new GamePane(this);
        moveButtons = new MoveButtons();
        animationButtons = new AnimationButtons();
        errorWindow = new ErrorWindow(primaryStage);
        animation = new Timeline(
                new KeyFrame(Duration.seconds(1),
                             new EventHandler<ActionEvent>(){
                                @Override
                                public void handle(ActionEvent event) {
                                    gamePane.moveRandom();
                                }                                 
                             }
                ));
        animation.setCycleCount(Animation.INDEFINITE);
        
        moveButtons.addEventHandler(ActionEvent.ACTION, new MoveHandler(this));
        animationButtons.addEventHandler(ActionEvent.ACTION, new AnimationHandler(this));
        
        setCenter(gamePane);
        setLeft(animationButtons);
        setRight(moveButtons);
        StackPane textPane = new StackPane(textField);
        textPane.setPadding(PADDING);
        setTop(textPane);
        
    }
    
    public void move(String direction){
        String poly = textField.getText();
        if(gamePane.validPolygon(poly)){
            gamePane.move(poly, direction);
        } else {
            errorWindow.showMessage(poly);
        }
    }

    public void reset(){
        gamePane.reset();
        textField.setText("");
        moveButtons.enableAll();
        animationButtons.enableAll();
    }
    
    public void playAnimation(){
        animation.play();
    }
    public void stopAnimation(){
        animation.stop();
    }
    
    public void victory(){
        stopAnimation();
        animationButtons.disableAll();
        moveButtons.disableAll();
    }
    
}
