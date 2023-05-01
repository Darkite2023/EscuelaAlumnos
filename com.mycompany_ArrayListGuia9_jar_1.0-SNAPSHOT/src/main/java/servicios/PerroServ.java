/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class PerroServ {
    private List<Perro> razasPerros;

    public PerroServ() {
        this.razasPerros = new ArrayList();
    }

    @Override
    public String toString() {
        return "PerroServ{" + "razasPerros=" + razasPerros + '}';
    }
    
    public Perro crearPerro() {
      
            Perro xx = new Perro("Dog" + ((int) (Math.random() * 100)));
           
        return  xx;
        
    }
    
    public void fabricarPerro(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            razasPerros.add(crearPerro() );
        }
        
    }
    
    public void mostrarPerro(){
        
        for (Perro aux : razasPerros) {
            System.out.println(aux);
        }
    }
    
    public void eliminarPerro(int index){
        
       razasPerros.remove(index);
    }
    
      public void agregarPerro(int index,Perro element){
        
       razasPerros.add(index, element);
    }
  
    
    
}
