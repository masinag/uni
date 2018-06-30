/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

/**
 *
 * @author gabriele
 */
class CalcButton extends Button{
    static int RADIUS = 30;
    
    CalcButton(String label){
        super(label);
        
        setShape(new Circle(RADIUS));
        setMinSize(2*RADIUS, 2*RADIUS);
    }
    CalcButton(String label, String id){
        this(label);
        setId(id);
    }
}
