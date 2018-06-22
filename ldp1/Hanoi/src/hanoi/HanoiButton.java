package hanoi;

import javafx.scene.control.Button;

/**
 * Bottone utilizzato dal programma Hanoi.
 * @author gabriele
 */
public class HanoiButton extends Button {
    /**
     * Possibile ID di un bottone utilizzato dal programma.
     */
    public final static String CLEAR = "clear", RESET = "reset", MOVE = "move",
            CLOSE = "close";
    /**
     * Inizializza un bottone con i parametri passati.
     * @param text rappresenta il testo visualizzato sul bottone.
     * @param id rappresenta un codice identificativo del bottone.
     */
    public HanoiButton(String text, String id) {
        super(text);
        setId(id);
        if(id.equals(CLOSE))
            setDisable(true);
    }
    
}
