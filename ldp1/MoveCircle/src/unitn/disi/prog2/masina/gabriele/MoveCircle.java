/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitn.disi.prog2.masina.gabriele;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author gabriele
 */
public class MoveCircle extends Application {
    final static double OFFSET = 10;
    final static double RADIUS = 50;
    final static double WIDTH = 300;
    final static double HEIGHT = 200;
    final static double BTNWIDTH = 100;
    private boolean horizontal = true;
    @Override
    public void start(Stage primaryStage) {
        Circle c = new Circle(100, 100, RADIUS, Paint.valueOf("BLACK"));
        c.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                if (horizontal){
                    double newCentre = (c.getCenterX()-OFFSET);
                    c.setCenterX((newCentre-RADIUS)>=0?newCentre:WIDTH-RADIUS);
                } else {
                    double newCentre = (c.getCenterY()-OFFSET);
                    c.setCenterY((newCentre-RADIUS)>=0?newCentre:HEIGHT-RADIUS);
                }
            }            
        });
        Button btnMv = new Button();
        btnMv.setText("Move Circle");
        btnMv.setMinWidth(BTNWIDTH);
        btnMv.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if (horizontal){
                    double newCentre = (c.getCenterX()+OFFSET);
                    c.setCenterX((newCentre+RADIUS)<=WIDTH?newCentre:RADIUS);
                } else {
                    double newCentre = (c.getCenterY()+OFFSET);
                    c.setCenterY((newCentre+RADIUS)<=HEIGHT?newCentre:RADIUS);
                }
            }
        });
        /* Button to switch horizontal/vertical movement */
        Button btnSwitch = new Button("Horizontal");
        btnSwitch.setMinWidth(BTNWIDTH);
        btnSwitch.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                horizontal = !horizontal;
                btnSwitch.setText((horizontal)? "Horizontal" : "Vertical");
            }
            
        });
        /* Button to close the application */
        Image icon = new Image(getClass().getResourceAsStream("close.png"), 50, 50, true, true);
        Button btnClose = new Button("", new ImageView(icon));
        btnClose.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
            
        });
        
        Group root = new Group();
        root.getChildren().add(c);
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        primaryStage.setTitle("Move circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        VBox btnbox = new VBox(OFFSET, btnMv, btnSwitch, btnClose);
        btnbox.setPadding(new Insets(OFFSET, OFFSET, OFFSET, OFFSET));
        
        HBox closebox = new HBox(btnClose);
        closebox.setAlignment(Pos.BOTTOM_RIGHT);
        Stage btnStage = new Stage();
        btnStage.setTitle("Buttons");
        Group btnGroup = new Group(btnbox, closebox);
        
        btnStage.setScene(new Scene(new VBox(btnbox, closebox), WIDTH, HEIGHT));
        btnStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
