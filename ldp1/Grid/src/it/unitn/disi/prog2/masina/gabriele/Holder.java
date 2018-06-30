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
import javafx.geometry.Pos;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author gabriele
 */
class Holder extends VBox {
    private TopBar topButtons;
    private Grid grid;
    private BottomBar bottomButtons;
    private MatrixWindow matrixWindow;
    private Timeline animation;
    public Holder(int dim) {
        setAlignment(Pos.CENTER);
        
        
        matrixWindow = new MatrixWindow();
        
        topButtons = new TopBar();
        grid = new Grid();
        bottomButtons = new BottomBar();
        getChildren().addAll(topButtons, grid, bottomButtons);
        
        addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                GridButton btn = (GridButton)event.getTarget();
                String btnId = btn.getId();
                
                switch(btnId){
                    case GridButton.PRINT:
                        matrixWindow.showMatrix(grid); break;
                    case GridButton.CLEAR:
                        grid.clear(); break;
                    case GridButton.STEP:
                        step(); break;
                    case GridButton.ALG1:
                    case GridButton.ALG2:
                    case GridButton.ALG3:
                        topButtons.select(btn); break;
                    case GridButton.START:
                        animation.play(); break;
                    case GridButton.STOP:
                        animation.stop(); break;          
                }
            }
           
        });
        
        addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                switch(event.getCode()){
                    case S: step(); break;
                    case C: grid.clear(); break;
                }
            }
            
        });
        createGrid(dim);
        
        animation = new Timeline(new KeyFrame(Duration.seconds(1), 
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                step();
            }
        }));
        animation.setCycleCount(Animation.INDEFINITE);
    }
    
    
    public void createGrid(int dim){
        grid.initialize(dim);
    }
    
    private void step(){
        grid.move(topButtons.getSelected().getId());
    }

    
    
}
