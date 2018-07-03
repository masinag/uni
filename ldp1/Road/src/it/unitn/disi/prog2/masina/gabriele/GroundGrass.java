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
public class GroundGrass extends Ground {
    private final static Paint COLOR = Color.GREEN;

    public GroundGrass() {
        setBackground(COLOR);
    }
}
