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
public class Treno {
    private String codice;
    private Data dataViaggio;
    private Stazione partenza, arrivo;
    private double prezzo;
    
    public Treno(){
        this("", new Data(), new Stazione(), new Stazione(), 0.00);
    }

    public Treno(String codice, Data dataViaggio, Stazione partenza, Stazione arrivo, double prezzo) {
        this.codice = codice;
        this.dataViaggio = dataViaggio;
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.prezzo = prezzo;
    }
    
    /**
     * @return the dataViaggio
     */
    public Data getDataViaggio() {
        return dataViaggio;
    }

    /**
     * @return the partenza
     */
    public Stazione getPartenza() {
        return partenza;
    }

    /**
     * @return the arrivo
     */
    public Stazione getArrivo() {
        return arrivo;
    }

    /**
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }
    
    public String getCodice(){return codice;}
    
    public String toString(){
        return "Codice Treno: " + getCodice() + "\n" +
               "Data: " + getDataViaggio() + "\n" +
               "Stazione di partenza: " + getPartenza() + "\n" +
               "Stazione di arrivo: " + getArrivo() + "\n" +
               "Prezzo: €" + getPrezzo();
    }
    
    public void stampaBiglietto(){
        System.out.println("Data: " + getDataViaggio() + "\n" + 
                "Codice treno: " + getCodice() + "\n" +
                "Stazione di partenza: " + getPartenza() + "\n" +
                "Stazione di arrivo: " + getArrivo());
    }
}
