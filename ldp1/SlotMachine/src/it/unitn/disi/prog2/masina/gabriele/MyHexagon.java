/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

/**
 *
 * @author gabriele
 */
public class MyHexagon extends Polygon{
    private final static Paint COLOR = Color.GREEN,
            BORDER_COLOR = Color.BLACK;
    private final static double R = Wheel.SYMBOL_SIZE/2,
            VGAP = R*(1-Math.sqrt(3/4));
    public MyHexagon() {
        super(0,R, R/2,R-VGAP, R+R/2,R-VGAP, 2*R,R,
              R+R/2,R+VGAP, R/2,R+VGAP);
        setId(Wheel.HEX);
        setFill(COLOR);
        setStroke(BORDER_COLOR);
    }
}
