/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

/**
 *
 * @author Win-7
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
        interface ValorNumerico{
        boolean teste(int n);
        }
    public static void main(String[] args) {
        ValorNumerico isPar = (int i) -> 
                (i%2==0);
        System.out.println(isPar.teste(10));
    }
    
    
}
