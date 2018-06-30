/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.prog2.masina.gabriele;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author gabriele
 */
public class Calculator extends VBox {
    final static int SPACING = 20;
    final static String EVALUATE = "eval", DELETE = "del";
    private Display display;
    private boolean reading;
    
    Calculator(){
        setPadding(new Insets(SPACING));
        setSpacing(SPACING);
        
        DisplayBox displayBox = new DisplayBox();
        display = new Display();
        DeleteButton delete = new DeleteButton();        
        displayBox.getChildren().addAll(display, delete);
        
        reading = false;
        ButtonsGrid btnGrid = new ButtonsGrid(this);
        
        addEventHandler(ActionEvent.ACTION, new CalcButtonEventHandler());
        addEventHandler(KeyEvent.KEY_PRESSED,new CalcKKeysEventHandler());
        this.getChildren().addAll(displayBox, btnGrid);
    }

    /**
     * @return the display
     */
    public String getDisplayText() {
        return display.getText();
    }
    public void setDisplayText(String s) {
        display.setText(s);
    }
    public Number evaluate() throws BadExpressionException{
        // stopReading();
        Number number, res = 0;
        
        if((number = readNumber()) != null){
            res = number;
        }
        char operator;
        while(display.getText().length()>0){
            operator = display.getText().charAt(0);
            display.setText(display.getText().substring(1));
            number = readNumber();
            if (res instanceof Double || number instanceof Double){
                res = evaluate(res.doubleValue(), number.doubleValue(), operator);
            } else {
                res = evaluate(res.intValue(), number.intValue(), operator);
            }
        }
        return res;
    }
    public boolean isReading(){
        return reading;
    }
    public void startReading(){
        reading = true;
    }
    public void stopReading(){
        reading = false;
    }
    private Number readNumber() throws BadExpressionException{
        char c;
        Number number = null;
        boolean readSomething = false;
        String n = "", expr = display.getText();
        while(expr.length()>0 && Character.isDigit(c = expr.charAt(0))){
            n +=c;
            expr = expr.substring(1);
            readSomething = true;
        }
        if(expr.length()>0 && expr.charAt(0)=='.'){
            n += ".";
            expr = expr.substring(1);
            while(expr.length()>0 && Character.isDigit(c = expr.charAt(0))){
                n += c;
                expr = expr.substring(1);
                readSomething = true;
            }
            if (readSomething)
                number = Double.parseDouble(n);
            else
                throw new BadExpressionException("Invalid number format: " + n);
        } else if (readSomething){
            number = Integer.parseInt(n);
        } else {
            throw new BadExpressionException("Missing operand");
        }
        display.setText(expr);
        return number;
    }

    private int evaluate(int op1, int op2, char operator) throws BadExpressionException {
        int res;
        switch(operator){
            case '+': res = op1 + op2; break;
            case '-': res = op1 - op2; break;
            case '*': res = op1 * op2; break;
            case '/': 
                if (op2!=0){ 
                    res = op1 / op2; break;
                }else 
                    throw new BadExpressionException("Cannot divide by zero");
            default: throw new BadExpressionException("Invalid opearator: " + operator);
        }
        return res;
    }
    
    private double evaluate(double op1, double op2, char operator) throws BadExpressionException {
        double res;
        switch(operator){
            case '+': res = op1 + op2; break;
            case '-': res = op1 - op2; break;
            case '*': res = op1 * op2; break;
            case '/':
                if (op2!=0) {
                    res = op1 / op2; break;
                } else 
                    throw new BadExpressionException("Cannot divide by zero");
            default: throw new BadExpressionException("Invalid opearator: " + operator);
        }
        return res;
    }
    
    void handleEvent(String action){
        String text = getDisplayText();
        if(action.equals(EVALUATE)){
            try{
                Number res = evaluate();
                setDisplayText(res.toString());
            } catch (BadExpressionException e){
                setDisplayText(e.getMessage());
                stopReading();
            }
        } else if(action.equals(DELETE)) {
            if(text.length()>1)
                setDisplayText(text.substring(0, text.length()-1));
            else {
                setDisplayText(Display.DEFAULT_TEXT);
                stopReading();
            }
        } else {
            if(!isReading()){
                text = action;
                startReading();
            } else {
                text += action;
            }
            setDisplayText(text);
        }
    }
    
    private boolean isOperand(char c) {
        return c== '+' || c=='-' || c=='*' || c=='/';
    }
    private class CalcButtonEventHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent t) {
            handleEvent(((Button)t.getTarget()).getId());            
        }    
    }
    private class CalcKKeysEventHandler implements EventHandler<KeyEvent>{
        @Override
        public void handle(KeyEvent t) {
            String action = "";
            if(t.getCode().toString().equals("BACK_SPACE"))
                action = DELETE;
            else if (t.getCode().toString().equals("ENTER"))
                action = EVALUATE;
            else {
                char c = t.getText().charAt(0);
                if(Character.isDigit(c) || isOperand(c) || c=='.'){
                    action = "" +c;
                }
            }
            handleEvent(action);                     
        }    

        
    }
}
