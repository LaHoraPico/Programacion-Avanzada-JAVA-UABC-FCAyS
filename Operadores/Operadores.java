/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author clases
 */
public class Operadores {
    /**
     * El siguiente es un metodo que suma valores utiliando argumentos variables
     * @param argumentos, arreglos de datos de suma 
     * @return double indicando el resultado
     */
    
    public double sumar(double... argumentos){
        double resultado = 0.0D;
        for (int i = 0; i < argumentos.length; i++) {
            resultado = resultado + argumentos[i];
        }
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(new Operadores().sumar(2,3,5));
    }
    
}
