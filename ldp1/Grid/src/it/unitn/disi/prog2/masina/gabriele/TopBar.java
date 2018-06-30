/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

/**
 *
 * @author gabriele
 */
public class TopBar extends ButtonsBar {
    private GridButton alg1, alg2, alg3;
    private GridButton selected;
    public TopBar() {
        alg1 = new GridButton("Alg1", GridButton.ALG1);
        alg2 = new GridButton("Alg2", GridButton.ALG2);
        alg3 = new GridButton("Alg3", GridButton.ALG3);
        
        select(alg1);
        getChildren().addAll(alg1, alg2, alg3);
    }
    void select(GridButton btn){
        alg1.setDisable(false);
        alg2.setDisable(false);
        alg3.setDisable(false);
        btn.setDisable(true);
        selected = btn;
    }
    
    public GridButton getSelected(){
        return selected;
    }
    
}
