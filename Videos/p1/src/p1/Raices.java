/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author Jose Luis Hernandez
 */
public class Raices {

    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void obtenerRaices() {
        double X1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a),
                X2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        System.out.println("solucion X1");
        System.out.println(X1);
        System.out.println("solucion X2");
        System.out.println(X2);
    }

    private void obtenerRaiz() {
        double X = (-b) / (2 * a);
        System.out.println("unica solucion");
        System.out.println(X);
    }

    private double getDiscriminante() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private boolean tieneraices() {
        return getDiscriminante() >0;
    }

    private boolean tieneraiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
     if(tieneraices()){
     obtenerRaices();
     }else if(tieneraiz()){
   obtenerRaiz();
     }else{
         System.out.println("no tiene soluciones");
     }
    }

}
