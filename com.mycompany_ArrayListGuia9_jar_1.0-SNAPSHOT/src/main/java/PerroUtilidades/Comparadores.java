/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PerroUtilidades;

import entidades.Perro;
import java.util.Comparator;

/**
 *
 * @author Polako
 */
public class Comparadores {
    
    
    public static Comparator<Perro> ordenarRazaDesc = new Comparator<Perro> () {
        @Override
        public int compare(Perro o1, Perro o2) {
            
            return o2.getRaza().compareTo(o1.getRaza());
        }
    } ;
    
    public static Comparator<Perro> ordenarRazaAsc = new Comparator<Perro> () {
        @Override
        public int compare(Perro o1, Perro o2) {
            
            return o1.getRaza().compareTo(o2.getRaza());
        }
    } ;
            

    
    
    
    
}
