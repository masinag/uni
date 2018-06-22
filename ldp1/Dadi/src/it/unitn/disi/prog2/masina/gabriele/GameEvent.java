/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventType;

/**
 *
 * @author gabriele
 */
public class GameEvent extends Event {
    public static final EventType<GameEvent> RESET = new EventType<GameEvent>(Event.ANY, "RESET");

    public GameEvent(EventType<GameEvent> eventType) {
        super(eventType);
    }

    
    
}
