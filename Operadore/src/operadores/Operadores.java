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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Ejemplo : Residuo de 55 entre 10
        System.out.println(new Operadores().residuoEnDivision(55, 10));
      // Operadores operador1 = new Operadores();
      // System.out.println(operador1.residuoEnDivision(55,10));
     
      // Las cadenas (String) pueden producir sopresas
        int a = 5;
        int b = 4;
        System.out.println(a + b);
        
        int valor1 = 5;
        String valor2 = "4";
        System.out.println(valor1 + valor2);
        
        //Podemos ver operadores unarios
        System.out.println(a++); //Imprime 5?
        System.out.println(a); //Imprime 5? owo
        System.out.println(++a); //Imprime 6?
      
        parOImpar(55);
       
        System.out.println(13 - 4*(5-2) + 3*(2+8));
        System.out.println(16 +3*(6-4)-3*5);
        System.out.println(23- 8 + 6*2 - 3*4);
//        System.out.println(6(7*5-4*6)+81%9-6);
         if(!true){ //evaluaa que no es verdadero
             System.out.println("Hola!");
         }
    }
    /**
     * Este metodo nos ayuda a conocer el valor sobrante de una divison
     * @param dividendo Valor que se divide
     * @param divisor Valor que separa al dividendo
     * @return int con la cantidad de unidade sobrantes
     */
    
    public int residuoEnDivision(int dividendo, int divisor){
        return dividendo % divisor;
         }
  /**
   * Este metodo determina si un numero es par o impar
   * @param numeroAEvaluar 
   */
    public static void parOImpar(int numeroAEvaluar){
        if(numeroAEvaluar % 2 == 0){
            System.out.println("El numero " + numeroAEvaluar + " es par");
        } else{
            System.out.println("El numero " + numeroAEvaluar + " es impar");
        }
    }
}
