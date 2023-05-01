/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;

/**
 *
 * @author Andrey
 */
public class PerroServ {
    
    public Perro crearPerro(){
        Perro xx = new Perro("Dog"+((int)(Math.random()*10)));
        return xx;
    }
    
    public void mostrarPerro(Perro x){
        
        System.out.println(x.getRaza());
    }
    
  
    
    
}
