/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Estudiante
 */
public class Nodo {
    private Lista objE;
    
    Nodo inicio;
    public int dato;
    public Nodo siguiente;
    
    public Nodo(Nodo inicio){
        this.inicio = null;
    }
    Nodo (int dato){
        this.dato = dato;
        siguiente = null;
    }
    Nodo(){
        
    }
    public boolean ListaVacia(){
        return (inicio == null) ? true : false;
    }
    public void adicionarppto(int dato){
        Nodo nuevo = new Nodo(dato);
        if (ListaVacia()){
            inicio = nuevo;
           
        }
        else 
        {
            
        }
    }
}
