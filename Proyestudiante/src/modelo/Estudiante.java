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
public class Estudiante {
    private String id,nom,cod;
    private double notas[];
    public Estudiante(String i,String n,String c,double []vn){
        id=i;
        nom=n;
        cod=c;
        notas=vn;
    } 
    public Estudiante(){
        id="";
        nom="";
        cod="";
        notas=null;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String n){
        nom=n; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public String getcadNotas(){
        String cadNotas= " ";
        for(int i=0; i<notas.length;i++)
            cadNotas+= notas[i]+"";
        return cadNotas;
    }
    public String toString(){
        return "\n identificacion: " + id +
                "\n nombre : " + nom + 
                "\n codigo: " + cod +  
                "\n notas: " + notas ;
                }
}
