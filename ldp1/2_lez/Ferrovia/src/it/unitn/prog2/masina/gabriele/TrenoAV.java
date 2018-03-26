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
public class TrenoAV extends Treno {

    public TrenoAV(String codice, Data dataViaggio, Stazione partenza, Stazione arrivo, double prezzo) {
        super(codice, dataViaggio, partenza, arrivo, prezzo);
    }
    
    @Override
    public double getPrezzo(){return super.getPrezzo()*1.30;}
}
