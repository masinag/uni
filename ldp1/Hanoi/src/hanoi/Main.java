package hanoi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Lancia l'esecuzione del programma.
 * 
 * @author gabriele
 */
public class Main extends Application {
    /**
     * Metodo che inizializza le strutture necessare alla corretta esecuzione del
     * programma.
     * @param primaryStage rappresenta la finestra principale.
     */
    @Override
    public void start(Stage primaryStage) {
        PopupMessage popup = new PopupMessage(primaryStage);
        
        Hanoi hanoi = new Hanoi(popup);
        
        Scene scene = new Scene(hanoi);
        
        primaryStage.setTitle("Hanoi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Metodo principale che deve essere invocato per eseguire il programma.
     * @param args non è necessario alcun argomento da linea di comando.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
