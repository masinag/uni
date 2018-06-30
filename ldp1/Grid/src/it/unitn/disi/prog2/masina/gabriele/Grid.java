/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Transition;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

/**
 *
 * @author gabriele
 */
class Grid extends GridPane {
    private int dim;
    GridElement elems[][];
    public Grid(){
        setGridLinesVisible(true);
        setAlignment(Pos.CENTER);
    }
    public void initialize(int dim){
        elems = new GridElement[dim][dim];
        for(int i=0; i<dim; i++)
            for(int j=0; j<dim; j++){
                elems[i][j] = new GridElement();
                add(elems[i][j], j, i);
            }
    }
    public int getDim(){
        return elems.length;
    }
    
    public GridElement getElement (int i, int j){
        return elems[i][j];
    }
    
    public void clear(){
        for(int i=0; i<elems.length; i++)
            for(int j=0; j<elems[0].length; j++)
                elems[i][j].showCircle(false);
    }
    
    protected void copyStatus(GridElement ee[][]){
        for(int i=0; i<ee.length; i++)
            for(int j=0; j<ee[0].length; j++)
                elems[i][j].showCircle(ee[i][j].getVisible());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Grid grid = new Grid();
        grid.initialize(getDim());
        grid.copyStatus(elems);
        return grid;
    }
    
    public GridElement get(int i, int j){
        return elems[i][j];
    }
    
    public void move(String alg){
        //HashSet moved = new HashSet();
        Grid temp = new Grid();
        try {
            temp = (Grid)(this.clone());
        } catch (CloneNotSupportedException ex) {
            System.out.println("Error in cloning");
        }
        clear();
        for(int i=0; i<elems.length; i++){
            for (int j = 0; j<elems[0].length; j++){
                if(temp.get(i, j).getVisible()){
                    int ii = i, jj = j;
                    switch(alg){
                        case GridButton.ALG1: ii--; jj++; break;
                        case GridButton.ALG2: jj--; break;
                        case GridButton.ALG3: ii++; break;
                    }
                    if(ii>=0 && ii<elems.length && jj>=0 && jj<elems[0].length)
                        elems[ii][jj].showCircle(true);
                }
            }
        }
    }
    
   
}
