/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import hotel.Hotel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;

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
        str.stream();
        
        List<Hotel> hoteis = new ArrayList<>();
        Hotel h1 = new Hotel(100.65, '2');
        Hotel h2 = new Hotel(100.65, '3');
        Hotel h4 = new Hotel(100.65, '4');
        Hotel h3 = new Hotel(200.65, '1');
        
        hoteis = Arrays.asList(h1, h2, h3);
        
        Optional<Hotel> hotel = hoteis.stream()
            .min(Comparator.comparingDouble(Hotel::getValor));  
        System.out.println(hotel.toString());
    }
    
    
}
