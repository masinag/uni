package hanoi;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 * Classe che rappresenta un disco sulla torre di Hanoi
 * 
 * @author gabriele
 */
public class Disc extends Rectangle{
    
    /**
     * Rappresenta le lunghezze dei dischi in ordine crescente.
     */
    private final static double WIDTHS[] = {30, 50, 70, 90};
    /**
     * Rappresenta l'altezza dei dischi.
     */
    private final static double HEIGHT = 20;
    /**
     * Rappresenta i colori dei dischi in ordine crescente.
     */
    private final static Paint COLORS[] = {Color.AQUAMARINE, Color.GREENYELLOW,
                                          Color.PURPLE, Color.BROWN};
    /**
     * Rappresenta il 'numero' del disco. I dischi sono numerati da 
     * 0 a Hanoi.N_DISCS-1 in ordine di grandezza.
     */
    private int index;
    /**
     * Metodo costruttore. Inizializza la variabile di istanza index con il 
     * parametro dato e crea un rettangolo di larghezza e colore dipendenti da index.
     * @param index inizializza il corrispondente.
     */
    public Disc(int index) {
        super(WIDTHS[index], HEIGHT, COLORS[index]);
        this.index = index;
    }
    /**
     * Metodo statico che restituisce la larghezza del disco più grande.
     * @return 
     */
    public static double getMaxWidth(){
        return WIDTHS[WIDTHS.length-1];
    }
    
}
