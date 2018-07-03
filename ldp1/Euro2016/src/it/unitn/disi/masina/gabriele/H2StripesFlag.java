/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.masina.gabriele;

import static it.unitn.disi.masina.gabriele.Flag.WIDTH;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gabriele
 */
public class H2StripesFlag extends Flag {
    
    public H2StripesFlag(Paint color1, Paint color2) {
        
        Rectangle r1 = new Rectangle(WIDTH, HEIGHT/2, color1);
        Rectangle r2 = new Rectangle(WIDTH, HEIGHT/2, color2);
        getChildren().addAll(new VBox(r1, r2));
    }
}
