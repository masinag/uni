/*
 * To doClicked this license header, choose License Headers in Project Properties.
 * To doClicked this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.util.Duration;

/**
 *
 * @author gabriele
 */
public class RoadGrid extends TilePane {
    private final static int GRID_SIZE = 8;
    private final static double SPACING = 2;
    
    private ArrayList<Ground> grid;
    private RoadGridHandler handler;
    private boolean addingCar;
    private GameField gameField;
    private Timeline animation;
    
    public RoadGrid(GameField gameField) {
        this.gameField = gameField;
        handler = new RoadGridHandler(this);
        grid = new ArrayList<>();
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++){
                Ground g = new GroundGrass();
                g.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
                grid.add(i*GRID_SIZE + j, g);
                getChildren().add(g);
            }
        }
        addingCar = false;
        setAlignment(Pos.CENTER);
        
        setMinWidth(GRID_SIZE*Ground.GROUND_SIZE + SPACING*GRID_SIZE);
        setMaxWidth(GRID_SIZE*Ground.GROUND_SIZE + SPACING*GRID_SIZE);
        setPrefColumns(GRID_SIZE);
        setPrefRows(GRID_SIZE);
        setHgap(SPACING);
        setVgap(SPACING);
        //setGridLinesVisible(true);
        
        animation = new Timeline(new KeyFrame(Duration.seconds(1), 
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        moveCars(RoadButton.RANDOM);
                    }
                }));
        animation.setCycleCount(Animation.INDEFINITE);
            
    }
    
    public Ground get(int i, int j){
        return grid.get(i*GRID_SIZE+j);
    }
    private void change(Ground elem, Ground newElem){
        newElem.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
        grid.set(grid.indexOf(elem), newElem);
        getChildren().set(getChildren().indexOf(elem), newElem);
    }
    
    public void doClicked (Ground elem){
        Ground newElem;
        if(addingCar && (elem instanceof GroundRoad) && ((GroundRoad)elem).getNCars()==0){
            ((GroundRoad)elem).putCar(true);
            gameField.getTopBar().decrementNCars();
            setAddingCar(false);
        }
        else if (!addingCar && elem instanceof GroundGrass){
            newElem = new GroundRoad();
            change(elem, newElem);
           
        } else if (elem instanceof GroundRoad && ((GroundRoad)elem).getNCars()==0){
            newElem = new GroundGrass();
            change(elem, newElem);   
        }
    }
    
    public void setAddingCar(boolean add){
        addingCar = add;
    }
    
    public void moveCars(String direction){
        int index = 0;
        ArrayList<Ground> moved = new ArrayList<>();
        for (Ground elem : grid) {
            if(elem instanceof GroundRoad && 
                    (((GroundRoad)elem).getNCars() == 1 && !moved.contains(elem) ||
                    ((GroundRoad)elem).getNCars()>1)){
                
                int i = index/GRID_SIZE, j = index - i*GRID_SIZE, ii = i, jj = j;
                switch(direction){
                    case RoadButton.UP:
                        ii--; break;
                    case RoadButton.DOWN:
                        ii++; break;
                    case RoadButton.LEFT:
                        jj--; break;
                    case RoadButton.RIGHT:
                        jj++; break;
                    case RoadButton.RANDOM:
                        int inc = ((int)(Math.random()*2)==0)?-1:1;
                        if((int)(Math.random()*2)==0)
                            ii+=inc;
                        else
                            jj+=inc;
                }
                
                move(i, j, ii, jj, moved);
                    
            }
            index++;
        }
        checkCrash();
    }
    
    private void move(int i, int j, int ii, int jj, ArrayList<Ground> moved){

        if(ii >= 0 && ii <GRID_SIZE && jj >= 0 && jj <GRID_SIZE ){    
            int from = i*GRID_SIZE + j, to = ii*GRID_SIZE + jj;
            if(grid.get(to) instanceof GroundRoad){
                GroundRoad fromE = (GroundRoad)grid.get(from);
                GroundRoad toE = (GroundRoad)grid.get(to);
                fromE.putCar(false);
                toE.putCar(true);
                if(toE.getNCars() == 1)
                    moved.add(toE);
            }
        }
    }


    private void checkCrash() {
        boolean crash = false;
        for (Iterator<Ground> iterator = grid.iterator(); iterator.hasNext() && !crash;) {
            Ground next = iterator.next();
            if(next instanceof GroundRoad)
                crash = ((GroundRoad)next).getNCars()>1;
        }
        if(crash){
            CrashWindow window = new CrashWindow();
            window.show();
            animation.stop();
        }
            
    }
    
    public void playAnimation(boolean play){
        if(play)
            animation.play();
        else
            animation.stop();
    }
    
}
