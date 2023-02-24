/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Jose Luis Hernandez
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int[]arreglo= new int[4];
   arreglo[0]=21;
   arreglo[1]=53;
   arreglo[2]=45;
   arreglo[3]=98;
   for(int i:arreglo){
       System.out.println(i+" ");
   }
     int a=45;
        System.out.println(buscar(a,arreglo));
    }
    public static int buscar(int a, int arreglo[]){
        int b=0;
        for (int i=0;i<4;i++){
            if(a==arreglo[i]){
                b=i+1;
            }
        } 
        return b;
    }
}
