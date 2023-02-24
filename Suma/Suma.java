/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author Jose Luis Hernandez
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Sum = new Scanner(System.in);
        int num1;
        int num2;
        int i;
        int producto = 0;
        
        System.out.println("ingrese el primer numero");
        
        num1 = Sum.nextInt();
        
        System.out.println("ingrese el segundo numero");
        
        num2 = Sum.nextInt();
        
        for(i=1;i<=num2;i++){
            
           producto = producto + num1;
           
          System.out.println("el resultado de las sumas sucesivas es "+producto);
          
        }
     
    }
    
}
