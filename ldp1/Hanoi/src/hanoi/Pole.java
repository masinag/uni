/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Palo su cui saranno posizionati i dischi.
 * @author gabriele
 */
public class Pole extends Rectangle {
    private String name;
    private final static double WIDTH = 15, HEIGHT = 200;
    private Stack stack;
    /**
     * Inizializza il palo con i parametri forniti
     * @param name nome del palo
     * @param stack pila a cui appartiene il palo
     */
    public Pole(String name, Stack stack) {
        super(WIDTH, HEIGHT, Color.BLACK);
        this.stack = stack;
        this.name = name;
    }
    /**
     * Restituisce il nome del palo
     * @return nome del palo
     */
    public String getName(){
        return name;
    }
    /**
     * Restituisce la pila a cui appartiene il palo.
     * @return pila a cui appartiene il palo.
     */
    public Stack getStack(){
        return stack;
    }
}
