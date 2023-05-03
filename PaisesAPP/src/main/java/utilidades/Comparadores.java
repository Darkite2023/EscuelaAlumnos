/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author Polako
 */
public class Comparadores {
     public static Comparator<Pais> ordenarPaisAsc = new Comparator<Pais>() {
         @Override
         public int compare(Pais o1, Pais o2) {
             return o1.getPais().compareTo(o2.getPais());
         }
     };
    
}
