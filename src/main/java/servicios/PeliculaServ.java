/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Polako
 */
public class PeliculaServ {
    
    private List<Pelicula> listaPelis = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PeliculaServ() {
    }

    public List<Pelicula> getListaPelis() {
        return listaPelis;
    }

    public void setListaPelis(List<Pelicula> listaPelis) {
        this.listaPelis = listaPelis;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
    
     public Pelicula crearPeli() {
        Pelicula x = new Pelicula();
        x.setNombrePelicula("Peli-" + ((int) (Math.random() * 100)+1));
        x.setDirectorPelicula("Director-" + ((int) (Math.random() * 100)+1));
        x.setDuracionPelicula(((int) (Math.random() * 100)+1));
        return x;
    }
     
     public void fabricarPelis(int cantidad){
         for (int i = 0; i < cantidad; i++) {
             
             listaPelis.add(crearPeli());
         }
     }
     
     public void mostrarPeli(){
         for (Pelicula aux : listaPelis) {
             System.out.println(aux.toString());
         }
     }
     
      public void mostrarPeli2(){
         for (Pelicula aux : listaPelis) {
             System.out.println("El nombre de la pelicula es: "+aux.getNombrePelicula());
             System.out.println("El director de la pelicula es: "+aux.getDirectorPelicula());
             System.out.println("La duracion de la pelicula es: "+aux.getDuracionPelicula());
             System.out.println("------------------------------------------------------------");
         }
     }
    
      public void mostrarPeliHora(int duracionMayor){
         for (Pelicula aux : listaPelis) {
             
             if (duracionMayor<aux.getDuracionPelicula()) {
             System.out.println("El nombre de la pelicula es: "+aux.getNombrePelicula()+" v1");
             
             System.out.println("La duracion de la pelicula es: "+aux.getDuracionPelicula()+" v1");
             System.out.println("------------------------------------------------------------"); 
             }
             
         }
     }
    
    
}
