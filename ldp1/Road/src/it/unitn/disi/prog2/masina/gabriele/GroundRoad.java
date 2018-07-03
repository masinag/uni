/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author gabriele
 */
public class GroundRoad extends Ground {
    private final static Paint COLOR = Color.GREY;

    private Car car;
    private int nCars;
    public GroundRoad() {
        setBackground(COLOR);
        car = new Car(GROUND_SIZE/2);
        car.setVisible(false);
        nCars = 0;
        getChildren().add(car);       
    }
    public void putCar(boolean show){
        
        if(show) nCars++;
        else if (nCars > 0) nCars--;
        car.setVisible(nCars>0);
    }
    public int getNCars(){
        return nCars;
    }
    
}
