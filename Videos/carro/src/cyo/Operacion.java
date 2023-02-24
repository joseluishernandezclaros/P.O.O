/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyo;

import javax.swing.JOptionPane;

public class Operacion {


    //metodos
    public int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public int restar(int n1, int n2) {
        int resta = n1 - n2;
        return resta;
    }

    public int multiplicar(int n1, int n2) {
        int multiplicacion = n1 * n2;
        return multiplicacion;
    }

    public int dividir(int n1, int n2) {
        int division = n1 / n2;
        return division;
    }
}
