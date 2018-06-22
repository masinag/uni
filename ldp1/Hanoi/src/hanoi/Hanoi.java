/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.WindowEvent;

/**
 * Gestisce la logica del gioco in corrispondenza degli eventi generati dall'utente.
 * 
 * @author gabriele
 */
public class Hanoi extends BorderPane {
    /**
     * Numero di dischi utilizzati nel gioco.
     */
    public final static int N_DISCS = 4;
    private TopBar topBar;
    private HanoiButton close, reset, move;
    private GameField gameField;
    private Pole fromPole = null, toPole = null;
    private PopupMessage popup;
    private final static Insets PADDING = new Insets(30);
    /**
     * Costruttore vuoto. Inizializza l'interfaccia grafica con i valori di default
     * e i gestori di eventi.
     */
    public Hanoi(PopupMessage popup) {
        this.popup = popup;
        addHider(popup);
        setPadding(PADDING);
        setStyle("-fx-background-color: white");
        // creazione elementi di grafica
        topBar = new TopBar();        
        close = new HanoiButton("Close", HanoiButton.CLOSE);
        move = new HanoiButton("Move", HanoiButton.MOVE);
        reset = new HanoiButton("Reset", HanoiButton.RESET);
        gameField = new GameField();
        
        // aggiunta degli elementi nella posizione corretta
        setTop(topBar);
        setAlignment(close, Pos.CENTER_LEFT);
        setLeft(close);
        setAlignment(move, Pos.BOTTOM_CENTER);
        setBottom(move);
        setAlignment(reset, Pos.CENTER_RIGHT);
        setRight(reset);
        setCenter(gameField);
        addButtonsListener();
        addClickListener();
    }
    
    /**
     * Aggiunge un ascoltatore per gli eventi di click su un palo.
     */
    private void addClickListener(){
        addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                if(event.getTarget() instanceof Pole){
                   if(fromPole==null && toPole==null){
                       if (!((Pole)event.getTarget()).getStack().isEmpty()){
                           fromPole = (Pole)event.getTarget();
                            topBar.setFrom(fromPole);
                        } else {
                           showMessage("Il palo di partenza non può essere vuoto!");
                       }    
                    } else if (toPole == null) {
                       if(!fromPole.equals((Pole)event.getTarget())){
                           toPole = (Pole)event.getTarget();
                           topBar.setTo(toPole);
                       } else {
                           showMessage("Il palo di partenza e di destinazione "
                                   + "non possono coincidere!");
                       }
                    } else {
                        showMessage("Il palo di partenza e quello di destinazione sono già definiti!");
                    }
                }
            }
        });
    }
    /**
     * Aggiunge un ascoltatore per gli eventi generati dai pulsanti.
     */
    private void addButtonsListener(){
        addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            
            public void handle(ActionEvent event) {
                HanoiButton btn = (HanoiButton)event.getTarget();
                if(btn.getId().equals(HanoiButton.CLEAR)){
                    topBar.resetFields();
                    toPole = fromPole = null;
                } else if (btn.getId().equals(HanoiButton.MOVE)){
                    if(fromPole==null || toPole == null)
                        showMessage("Pali di partenza e di arrivo non definiti!");
                    if(!gameField.move(fromPole, toPole))
                        showMessage("Impossibile appoggiare un disco su uno più piccolo!");
                }  else if (btn.getId().equals(HanoiButton.RESET)){
                    gameField.reset();
                    topBar.resetFields();
                    fromPole = toPole = null;
                } else if(btn.getId().equals(HanoiButton.CLOSE)){
                    hideMessage();
                }
            }
            
        });
    }
    public void showMessage(String message){
        popup.show(message);
        close.setDisable(false);
    }
    public void hideMessage(){
        popup.hide();
        close.setDisable(true);
    }

    private void addHider(PopupMessage popup) {
        popup.addEventHandler(WindowEvent.WINDOW_HIDING, new EventHandler<WindowEvent>(){
            @Override
            public void handle(WindowEvent event) {
                hideMessage(); 
            }
        });
    }
}
