package hanoi;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

/**
 * Classe che rappresenta il campo da gioco. Contiene al suo interno i pali
 * su cui è possibile spostare i dischi.
 * @author gabriele
 */
public class GameField extends HBox {
    private Stack stacks[];
    private final static int N_STACKS = 3, SPACING = 30;
    private final static Insets PADDING = new Insets(30);
    private final static String FIELD_COLOR = "aliceblue";
    
    /**
     * Costruttore vuoto che inizializza il campo da gioco con i parametri di 
     * default.
     */
    public GameField() {
        setSpacing(SPACING);
        setPadding(PADDING);
        
        setStyle("-fx-background-color: " + FIELD_COLOR);
        setAlignment(Pos.CENTER);
        stacks = new Stack[N_STACKS];
        for(int i=0; i<N_STACKS; i++)
             stacks[i] = new Stack(i);
        reset();
        getChildren().addAll(stacks);
        
    }
    public void reset(){
        stacks[0].removeAllDiscs();
        stacks[0].addAllDiscs();
    }

    public boolean move(Pole fromPole, Pole toPole) {
        
        boolean validMove = toPole.getStack().isEmpty() || 
                (fromPole.getStack().getTopDisc().getWidth() <
                toPole.getStack().getTopDisc().getWidth());
    
        if (validMove){
            toPole.getStack().addDisc(fromPole.getStack().getTopDisc());
        }
        
        return validMove;
    }
    
    
    
}
