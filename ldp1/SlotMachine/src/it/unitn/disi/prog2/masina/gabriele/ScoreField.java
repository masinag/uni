/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

/**
 *
 * @author gabriele
 */
public class ScoreField extends UserField {
    private final static int START_SCORE = 0,
            DEFAULT_SCORE = 128;

    private int score;
    
    public ScoreField(String label) {
        this.label.setText(label);
        setScore(START_SCORE);
    }

    private void setScore(int score) {
        this.score = score;
        this.textField.setText("" + score);
    }
    public void resetScore(){
        setScore(0);
    }
    public int getScore(){
        return score;
    }
    
    public void setDefaultScore(){
        setScore(DEFAULT_SCORE);
    }
    
    public void divideScore(){
        setScore(score/2);
    }
    
    
}
