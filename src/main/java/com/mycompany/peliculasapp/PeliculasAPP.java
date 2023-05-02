/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peliculasapp;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import servicios.PeliculaServ;
import utilidades.Comparadores;

/**
 *
 * @author Polako
 */
public class PeliculasAPP {

    public static void main(String[] args) {
        PeliculaServ sc = new PeliculaServ();
        List<Pelicula> listaPelic = sc.getListaPelis();
        
        
        
        
        sc.fabricarPelis(5);
        sc.mostrarPeli2();
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        sc.mostrarPeliHora(30);
        
        Collections.sort(listaPelic, Comparadores.ordenarPorHoraAsc);
        
        for (Pelicula aux : listaPelic) {
            System.out.println(aux.toString());
        }
        System.out.println("--------------acend-------------------");
        System.out.println("---------------------------------");
        sc.mostrarPeli2();
        
        Collections.sort(listaPelic, Comparadores.ordenarPorHoraDesc);
        
        for (Pelicula aux : listaPelic) {
            System.out.println(aux.toString());
        }
        System.out.println("---------------decend------------------");
        System.out.println("---------------------------------");
        sc.mostrarPeli2();
        Collections.sort(listaPelic, Comparadores.ordenarPorDirector);
        
        for (Pelicula aux : listaPelic) {
            System.out.println(aux.toString());
        }
        System.out.println("---------------Director------------------");
        System.out.println("---------------------------------");
        sc.mostrarPeli2();
        Collections.sort(listaPelic, Comparadores.ordenarPorNombre);
        
        for (Pelicula aux : listaPelic) {
            System.out.println(aux.toString());
        }
        System.out.println("---------------Pelicula------------------");
        System.out.println("---------------------------------");
        sc.mostrarPeli2();
    }
}
