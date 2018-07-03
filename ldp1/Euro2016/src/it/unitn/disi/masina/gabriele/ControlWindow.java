/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author gabriele
 */
public class ControlWindow extends Stage {
    private final static double PADDING_VALUE = 20;
    private final static Insets PADDING = new Insets(PADDING_VALUE);
    
    private Board board;
    private ArrayList<ControlButton> btns;
    
    public ControlWindow(Stage owner, Board board) {
        initOwner(owner);
        this.board = board;

        btns = new ArrayList<>();
        btns.add(new ControlButton(ControlButton.ROUNDS, 0));
        btns.add(new ControlButton(ControlButton.ROUNDS, 1));
        btns.add(new ControlButton(ControlButton.ROUNDS, 2));
        btns.add(new ControlButton(ControlButton.QUARTERS, 0));
        btns.add(new ControlButton(ControlButton.SEMIFINALS, 0));
        btns.add(new ControlButton(ControlButton.FINALS, 0));
        btns.get(0).setDisable(false);

        
        GridPane grid = new GridPane();
        grid.setPadding(PADDING);
        
        grid.addRow(0, btns.get(0), btns.get(1), btns.get(2));
        grid.addRow(1, btns.get(3), btns.get(4), btns.get(5));
        
        grid.addEventHandler(ActionEvent.ACTION, new ButtonsListener(board));
        setScene(new Scene(grid));
        setY(owner.getY() + owner.getHeight());
        setX(owner.getX());
        
        
    }
    private void showError(){
        Stage errorWindow = new Stage();
        errorWindow.initOwner(getOwner());
        
        Label message = new Label("Non ancora implementato");
        message.setPadding(PADDING);
        
        errorWindow.setScene(new Scene(message));
        errorWindow.setOnHiding(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.exit(0);
            }
        });
        errorWindow.show();
    }
    
    
    class ButtonsListener implements EventHandler<ActionEvent>{
        private Board board;
        public ButtonsListener(Board board) {
            this.board = board;
        }

        @Override
        public void handle(ActionEvent event) {
            
            ControlButton btn = (ControlButton)event.getTarget();
            btn.setDisable(true);
            switch(btn.getType()){
                case ControlButton.ROUNDS:
                    board.playDay(btn.getDay()); break;
                default:
                    showError();                        
            }
            btns.get(btns.indexOf(btn)+1).setDisable(false);

        }
        
        
    }
    
}
