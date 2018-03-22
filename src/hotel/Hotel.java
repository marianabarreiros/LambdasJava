/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author qt
 */
public class Hotel {
    private double valor;
    private char classi;

    public Hotel(double valor, char classi) {
        this.valor = valor;
        this.classi = classi;
    }

    public char getClassi() {
        return classi;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
      return "Classificação" + getClassi() + " Valor " + getValor();
    }
    
    
    
}
