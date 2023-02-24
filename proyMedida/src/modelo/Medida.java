/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Medida {

    private int valor;

    public Medida() {
       this.valor=0;
    }

    public Medida(int valor) {
        this.valor = valor;
    }
    //principio de comunicacion

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public double convertirCM(){
        return valor*100;
    }
}
