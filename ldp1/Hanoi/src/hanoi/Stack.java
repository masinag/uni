/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.util.Collection;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;

/**
 * Pila composta da un palo e i dischi in esso infilati.
 * @author gabriele
 */
public class Stack extends StackPane {
    /**
     * Dischi del gioco.
     */
    public final static Disc[] DISCS = createDiscs(); 
    private Pole pole;
    private DiscStack stack;
    /**
     * Inizializza la pila i-esima.
     * @param i indice della pila.
     */
    public Stack(int i) {
        pole = new Pole("p" + (i+1), this);
        stack = new DiscStack();     
        setAlignment(stack, Pos.BOTTOM_CENTER);
        setAlignment(pole, Pos.BOTTOM_CENTER);
        setMinWidth(Disc.getMaxWidth());
        getChildren().addAll(pole, stack);
        
    }
    /**
     * Restituisce il numero di dischi presenti sulla pila.
     * @return numero di dischi presenti sulla pila
     */
    public int  getNDiscs(){
        return stack.getChildren().size();
    }
    /**
     * Verifica se la pila è vuota.
     * @return indica se la pila è vuota.
     */
    public boolean isEmpty(){
        return getNDiscs() == 0;
    }
    /**
     * Aggiunge tutti i dischi alla pila.
     */
    public void addAllDiscs(){
        stack.getChildren().addAll(DISCS);
    }
    public void removeAllDiscs(){
        stack.getChildren().removeAll(DISCS);
    }
    /**
     * Crea i dischi utilizzati dal gioco.
     * @return array di dischi.
     */
    private static Disc[] createDiscs(){
        Disc discs[] = new Disc[Hanoi.N_DISCS];
        for(int i=0; i<Hanoi.N_DISCS; i++)
            discs[i] = new Disc(i);
        return discs;
    }
    public Disc getTopDisc(){
        return (Disc)stack.getChildren().get(0);
    }

    void addDisc(Disc topDisc) {
        stack.getChildren().add(topDisc);
        topDisc.toBack();
    }
}

