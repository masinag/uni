/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.prog2.masina.gabriele;

import javafx.scene.control.Button;

/**
 *
 * @author gabriele
 */
public class MyGridButton extends Button{
    static final int BTN_SIZE = 100;
    MyGridButton(int i){
        this.setText(""+i);
        this.setMinSize(BTN_SIZE, BTN_SIZE);
    }
}
