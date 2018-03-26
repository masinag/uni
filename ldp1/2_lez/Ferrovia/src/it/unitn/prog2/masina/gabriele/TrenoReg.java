/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.prog2.masina.gabriele;

/**
 *
 * @author gabriele.masina
 */
public class TrenoReg extends Treno{
    private Data dataScadenza;

    public Data getDataScadenza() {
        return dataScadenza;
    }

    public TrenoReg(Data dataScadenza, String codice, Data dataViaggio, 
            Stazione partenza, Stazione arrivo, double prezzo) {
        super(codice, dataViaggio, partenza, arrivo, prezzo);
        this.dataScadenza = dataScadenza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScadenza " + getDataScadenza(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
