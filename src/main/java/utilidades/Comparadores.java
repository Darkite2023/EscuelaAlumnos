/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Polako
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorHoraDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o2.getDuracionPelicula().compareTo(o1.getDuracionPelicula());
        }
    };
    
     public static Comparator<Pelicula> ordenarPorHoraAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o1.getDuracionPelicula().compareTo(o2.getDuracionPelicula());
        }
    };
     public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o1.getDirectorPelicula().compareTo(o2.getDirectorPelicula());
        }
    };
     
     public static Comparator<Pelicula> ordenarPorNombre = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o1.getNombrePelicula().compareTo(o2.getNombrePelicula());
        }
    };
}
