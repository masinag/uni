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
public class CreditField extends UserField {
    
    private final static double START_CREDIT = 0.0;
    
    private double credit;
    private SlotMachine slotMachine;
    
    public CreditField(String label, SlotMachine slotMachine) {
        this.slotMachine = slotMachine;
        this.label.setText(label);
        setCredit(START_CREDIT);
    }
    
    public void setCredit(double credit){
        this.credit = credit;
        this.textField.setText("" +String.format("€%.2f", this.credit));
        
        slotMachine.getButtonsBox().enableButtons(credit != 0);
        
    }
    
    public double getCredit(){
        return this.credit;
    }
    
    public void incrCredit(double value){
        setCredit(getCredit()+value);
    }
    public void decrCredit(double value){
        incrCredit(-value);
    }
    
    public void resetCredit(){
        setCredit(START_CREDIT);
    }
    
}
