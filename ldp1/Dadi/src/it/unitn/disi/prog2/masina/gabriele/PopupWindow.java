/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
class PopupWindow  extends Stage {
    private Text message;
    final static int WIDTH = 300;
    final static String WIN_TITLE="Vittoria", 
            WIN_MESSAGE = "Hai vinto!",
            GO_TITLE = "Sconfitta",
            GO_MESSAGE = "Hai perso!",
            STATUS_TITLE = "Stato partita";
    final static Insets PADDING = new Insets(30);
    private Game game;
    PopupWindow(){
        setMinWidth(WIDTH);
        message = new Text();
        StackPane pane = new StackPane(message);
        pane.setPadding(PADDING);
        setScene(new Scene(pane));
    }
    public void setGame(Game game){
        this.game = game;
    }
    public void showWin(){
        setTitle(WIN_TITLE);
        message.setText(WIN_MESSAGE);
        show();
    }
    public void showGameOver(){
        setTitle(GO_TITLE);
        message.setText(GO_MESSAGE);
        show();
    }
    public void printStatus(){
        setTitle(STATUS_TITLE);
        String status = "";
        Dice[] dices = game.getGreenField().getDices();
        int tot = 0;
        for(int i=0; i<dices.length; i++){
            if(dices[i].isVisible()){
                status += "Dado " + (i+1) + ": " + dices[i].getValue() + "\n";
                tot += dices[i].getValue();
            }
        }
        status += "Totale: " + tot + "\n";
        status += "Punteggio: " + game.getButtonBox().getCounter().getValue() + "\n";
        message.setText(status);
        show();
    }
}
