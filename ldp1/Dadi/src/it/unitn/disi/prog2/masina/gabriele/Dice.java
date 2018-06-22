/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author gabriele
 */
class Dice extends GridPane {
    final static int NROWS = 3, NCOLS = 3, RADIUS = 20, GAP = 20;
    final static Insets PADDING = new Insets(GAP);
    private Circle circles[];
    private int value;
    GreenField greenField;
    FadeTransition fade;
    TranslateTransition trans;
    public Dice(GreenField greenField) {
        this.greenField = greenField;
        circles = new Circle[NROWS*NCOLS];
        setHgap(GAP);
        setVgap(GAP);
        setPadding(PADDING);
        setMaxHeight(4*GAP + 3*2*RADIUS);
        setStyle("-fx-background-color: white");
        createDices();
        
        hide();
        addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                if(greenField.allDicesVisible()){
                    setRandomValue();
                    greenField.getGame().getButtonBox().getCounter().decrease();
                }
            }
            
        });
        addFade();
        addTrans();
    }
    
    private void addFade(){
        fade = new FadeTransition(Duration.seconds(1), this);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.setOnFinished(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    setOpacity(1.0);
                    hide();
                }
        });
    }
    
    private void addTrans(){
        double x = getLayoutX(), y = getLayoutY();
        trans = new TranslateTransition(Duration.seconds(1), this);
        trans.setFromX(x);
        trans.setFromY(y);
        trans.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hide();
                setTranslateX(0);
                setTranslateY(0);
            }
        });
    }
    public int getValue(){
        return value;
    }
    private void hide(int i){
        circles[i].setFill(Color.WHITE);
    }
    private void show(int i){
        circles[i].setFill(Color.BLACK);
    }
    private void setRandomValue() {
        value = (int)(Math.random()*6) + 1;
        for(int i=0; i<NROWS*NCOLS; i++)
            hide(i);
        
        if(value %2 == 1)
            show(4);
        if(value>1){
            show(0);
            show(8);
        }
        if(value>3){
            show(2);
            show(6);
        }
        if(value == 6){
            show(1);
            show(7);
        }
    }
    public void reset(){
        if (greenField.getGame().getButtonBox().getTransition().getValue().equals(TransitionButton.DISSOLVE)){
            fade.play();
         } else {
            double by[] = getShift();
            
            trans.setByX(by[0]);
            trans.setByY(by[1]);
            trans.play();            
        }
        
    }
    private double distance(double x, double y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    private double[] getShift(){
        double shift[] = new double[2];
        double radius = distance(GreenField.WIDTH, GreenField.HEIGHT);
        shift[0] = Math.random()*radius;
        do {
            shift[1] = Math.random()*radius;
        } while (distance(shift[0], shift[1])<radius);
        return shift;
    }

    private void createDices() {
        for(int i=0; i<NROWS; i++){
            for(int j=0; j<NCOLS; j++){
                circles[i*NCOLS + j] = new Circle(RADIUS, Color.WHITE);
                add(circles[i*NCOLS + j], j, i);
            }
        }
    }
    
    public void hide(){
        setVisible(false);
        setRandomValue();
    }
}
