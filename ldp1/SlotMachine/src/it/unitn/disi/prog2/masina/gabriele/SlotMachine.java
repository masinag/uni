/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

/**
 *
 * @author gabriele
 */
class SlotMachine extends VBox {
    final static int N_WHEELS = 3;
    private final static double SPACING = 20;
    
    private TopLabel topLabel;
    private WheelsBox wheelsBox;
    private FieldsBox fieldsBox;
    private ButtonsBox buttonsBox;
    private PopupMessage popupMessage;
    
    public SlotMachine(Game game) {
        setAlignment(Pos.TOP_CENTER);
        setSpacing(SPACING);
    
        popupMessage = new PopupMessage();
        topLabel = new TopLabel();
        wheelsBox = new WheelsBox(game);
        buttonsBox = new ButtonsBox(game);
        fieldsBox = new FieldsBox(this);
        
        getChildren().addAll(topLabel, wheelsBox, fieldsBox, buttonsBox);        
    }

    public void incrCredit(double value) {
        fieldsBox.getCreditField().incrCredit(value);
    }
    public void decrCredit(double value) {
        fieldsBox.getCreditField().decrCredit(value);
    }
    public void setDefaultScore(){
        fieldsBox.getScoreField().setDefaultScore();
    }
    public void resetScore(){
        fieldsBox.getScoreField().resetScore();
    }
    public ButtonsBox getButtonsBox(){
        return buttonsBox;
    }    
    public double getCredit(){
        return fieldsBox.getCreditField().getCredit();
    }
    public int getScore(){
        return fieldsBox.getScoreField().getScore();
    }
    public void divideScore(){
        fieldsBox.getScoreField().divideScore();
    }
    
    public void spin(){
        wheelsBox.spin();
        divideScore();
    }
    public void checkVictory(){
        if(wheelsBox.allEquals()){
            popupMessage.show(PopupMessage.VICTORY);
            incrCredit(getScore()*Coin.COIN_VALUE);
            resetScore();
        }
    }
    public void newGame(){
     if(getCredit() < Coin.COIN_VALUE)
            popupMessage.show(PopupMessage.NOT_ENOUGH_CREDIT);
        else {
            decrCredit(Coin.COIN_VALUE);
            setDefaultScore();
        }
    }
    public void pay(){
        popupMessage.show(String.format(PopupMessage.PAY, getCredit()/Coin.COIN_VALUE));
        reset();
    }
    
    public void reset(){
        fieldsBox.reset();
    }
}
