/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import modelo.Medida;

/**
 *
 * @author Estudiante
 */
public class progMedida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Medida objM= new Medida();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite medida");
        objM.setValor(entrada.nextInt());
        System.out.println("la medida en centimetros es"+objM.convertirCM());
    }
    
}
