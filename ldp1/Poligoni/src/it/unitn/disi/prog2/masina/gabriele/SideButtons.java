/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

/**
 *
 * @author gabriele
 */
class SideButtons extends VBox {
    private final static double SPACING = 10;
    private final static Insets PADDING = new Insets(10);

    public SideButtons() {
        setSpacing(SPACING);
        setPadding(PADDING);
    }
    private void enableAll(boolean enable){
        for (Node n : getChildren()) {
            if(n instanceof GameButton && !((GameButton)n).getId().equals(GameButton.RESET_ID))
                ((GameButton)n).setDisable(!enable);
        }
    }
    public void enableAll(){
        enableAll(true);
    }
    public void disableAll(){
        enableAll(false);
    }
}
