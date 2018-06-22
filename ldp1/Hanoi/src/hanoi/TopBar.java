package hanoi;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Barra in alto della finestra principale.
 * @author gabriele
 */
public class TopBar extends HBox {
    private HanoiButton clear;
    private Label fromLabel, toLabel;
    private TextField from, to;
    private final static int SPACING = 30;
    /**
     * Costruttore che inizializza la barra con due campi di testo indicanti
     * il palo di partenza e quello di arrivo e un bottone per ripulirli.
     */
    public TopBar() {
        from = new TextField();
        from.setEditable(false);
        fromLabel = new Label("from");
        to = new TextField();
        to.setEditable(false);
        toLabel = new Label("to");
        clear = new HanoiButton("Clear", HanoiButton.CLEAR);
        setAlignment(Pos.CENTER);
        setSpacing(SPACING);
        getChildren().addAll(fromLabel, from, toLabel, to, clear);
    }
    /**
     * Scrive nel campo 'from' il nome del palo passato.
     * @param p palo che verrà impostato 'di partenza'
     */
    public void setFrom(Pole p){
        from.setText(p.getName());
    }
    /**
     * Scrive nel campo 'to' il nome del palo passato.
     * @param p palo che verrà impostato 'di arrivo'
     */
    public void setTo(Pole p){
        to.setText(p.getName());
    }
    /**
     * Resetta i valori dei campi 'from' e 'to'.
     */
    public void resetFields(){
        from.setText("");
        to.setText("");
    }
}
