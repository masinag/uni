package hanoi;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

/**
 * Rappresenta una pila di dischi posizionata su un palo.
 * @author gabriele
 */
public class DiscStack extends VBox {
    /**
     * Costruttore vuoto che inizializza la pila di dischi vuota.
     */
    public DiscStack() {
        setMaxHeight(0);
        setAlignment(Pos.BOTTOM_CENTER);
    }
}
