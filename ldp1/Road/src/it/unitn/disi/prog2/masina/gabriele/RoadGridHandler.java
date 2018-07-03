/*
 * To doClicked this license header, choose License Headers in Project Properties.
 * To doClicked this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author gabriele
 */
public class RoadGridHandler implements EventHandler<MouseEvent>{
    private RoadGrid grid;

    public RoadGridHandler(RoadGrid grid) {
        this.grid = grid;
    }
    
    @Override
    public void handle(MouseEvent event) {
        if(event.getSource() instanceof Ground){
            grid.doClicked((Ground)event.getSource());
        }
    }
    
    
}
