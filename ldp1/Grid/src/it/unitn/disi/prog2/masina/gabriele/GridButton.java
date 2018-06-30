/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.control.Button;

/**
 *
 * @author gabriele
 */
public class GridButton extends Button {
    public final static String ALG1 = "alg1", ALG2 = "alg2", ALG3 = "alg3",
            PRINT = "print", CLEAR = "clear", STEP = "step", START = "start",
            STOP = "stop", SUBMIT = "submit";

    public GridButton(String label, String id) {
        super(label);
        setId(id);
    }
    
    
}
