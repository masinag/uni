/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

/**
 *
 * @author gabriele
 */
class WheelsBox extends HBox {
    private final static double SPACING = 15;
    private Wheel wheels[];
            
    public WheelsBox(Game game) {
        wheels = new Wheel[SlotMachine.N_WHEELS];
        for(int i=0; i<SlotMachine.N_WHEELS; i++){
            wheels[i] = new Wheel(game);
        }
        setSpacing(SPACING);
        
        setAlignment(Pos.CENTER);
        getChildren().addAll(wheels);
    }
    
    public void spin(){
        for(int i=0; i<wheels.length; i++)
            wheels[i].spin(i==(wheels.length-1));
    }
    
    public boolean allEquals(){
        boolean eq = true;
        for(int i=1; eq && i<wheels.length; i++)
            eq = wheels[i].equals(wheels[i-1]);
        return eq;
    }
    
}
