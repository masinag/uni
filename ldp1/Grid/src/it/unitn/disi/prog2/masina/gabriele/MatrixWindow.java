/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class MatrixWindow extends Stage {
    private final static Insets PADDING = new Insets(30);
    private final static Font FONT = new Font(20);
    private Text table;
    public MatrixWindow() {
       
        table = new Text();
        table.setFont(FONT);
        StackPane pane = new StackPane(table);
        pane.setPadding(PADDING);
        
        setScene(new Scene(pane));
    }
    public void showMatrix(Grid grid){
        String text = new String();
        for(int i=0; i<grid.getDim(); i++) {
            for(int j=0; j<grid.getDim(); j++){
                GridElement elem = grid.getElement(i, j);
                text += (elem.getVisible()?1:0);                
            }
            text += "\n";
        }
        table.setText(text);
        show();
    }
    
}
