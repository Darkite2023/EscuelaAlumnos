/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Andrey
 */
public class PerroServ {
    private List<Perro> razasPerros;

    public List<Perro> getRazasPerros() {
        return razasPerros;
    }

    public void setRazasPerros(List<Perro> razasPerros) {
        this.razasPerros = razasPerros;
    }

    public PerroServ() {
        this.razasPerros = new ArrayList();
    }

    @Override
    public String toString() {
        return "PerroServ{" + "razasPerros=" + razasPerros + '}';
    }
    
    public Perro crearPerro() {
      
            Perro xx = new Perro("Dog" + ((int) (Math.random() * 10)));
           
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
    
      public void agregarPerro(int index,Perro xx){
        
       razasPerros.add(index, xx);
    }
       public void agregarPerro2(int index){
        Perro xx = crearPerro();
       razasPerros.add(index, xx);
    }
       
       public void buscarElimanar(String var) {

        for (int i = 0; i < razasPerros.size(); i++) {
            Perro aux = razasPerros.get(i);
            String aux1 = aux.getRaza();
            if (aux1.equalsIgnoreCase(var)) {
                razasPerros.remove(i);

            }
        }

    }
       
       public void buscarElimanar2(String var) {
           Iterator<Perro> it = razasPerros.iterator();
          
           while (it.hasNext()) {
//               Perro next = it.next();
               String var2 = it.next().getRaza();
               if (var2.equalsIgnoreCase(var)) {
                   it.remove();
                   System.out.println("Se elimino el Perro: " + var);

               }

           }

//        for (int i = 0; i < razasPerros.size(); i++) {
//            String aux = razasPerros.get(i).getRaza();
//            
//            if (aux.equalsIgnoreCase(var)) {
//                razasPerros.remove(i);
//                System.out.println("Se elimino el Perro: "+var);
//
//            }
//        }

    }
       
       public void actualizarRaza(String var, String var3) {
           
           for (int i = 0; i < razasPerros.size(); i++) {
               Perro mm = razasPerros.get(i);
               if (mm.getRaza().equalsIgnoreCase(var)) {
                   mm.setRaza(var3);
               }
               
           }
          
       }

    
       
        

  
    
    
}
