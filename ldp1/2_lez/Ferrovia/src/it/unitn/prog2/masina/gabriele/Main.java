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
public class Main {
    public Main(){
        System.out.println("Programma iniziato...");
        TrenoAV t = new TrenoAV("MBHJHG67", new Data(27,3,2018),
             new RomaTermini(), new MilanoCentrale(), 50.25);
        TrenoReg t2 = new TrenoReg(new Data(28,7,2018), "MBHJHG67", new Data(27,3,2018),
                new RomaTermini(), new MilanoCentrale(), 50.25);
        System.out.println(t);
        System.out.println();
        System.out.println(t2);
        t.stampaBiglietto();
        System.out.println("...programma terminato");
    }
    
    public static void main(String args[]){
        Main m = new Main();
    }
}
