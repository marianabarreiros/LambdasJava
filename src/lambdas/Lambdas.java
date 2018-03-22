/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        interface Edivisivel{
            boolean teste(int n, int y);
        }
        
    public static void main(String[] args) {
        ValorNumerico isPar = i -> 
                (i%2==0);
        System.out.println(isPar.teste(10));
        
        Edivisivel isDiv = (x, y) -> 
                (x%y==0);
        System.out.println(isDiv.teste(5, 2));
        
        List<String> str = new ArrayList<>();
        String str1 = new String("olá");
        String str2 = new String("Mariana");
        String str3 = new String("como vai?");
        
        str = Arrays.asList(str1, str2, str3);
        str.forEach(u -> System.out.println(u));
    }
    
    
}
