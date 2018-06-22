/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author gabriele
 */
class PopupMessage extends Stage {
    private Text message;
    private final static Insets PADDING = new Insets(30);
    public PopupMessage(Stage owner) {
        initOwner(owner);
        message = new Text();
        StackPane pane = new StackPane(message);
        pane.setPadding(PADDING);
        setScene(new Scene(pane));
        setTitle("Attenzione!");
//        addEventHandler(WindowEvent.WINDOW_HIDING, new EventHandler<WindowEvent>(){
//            @Override
//            public void handle(WindowEvent event) {
//                hanoi.disableClose();
//            }
//            
//        });
    }
    public void show(String text){
        message.setText(text);
        show();
    }

    
}
