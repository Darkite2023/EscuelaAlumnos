/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peliculasapp;

import java.util.ArrayList;
import java.util.List;
import servicios.PeliculaServ;

/**
 *
 * @author Polako
 */
public class PeliculasAPP {

    public static void main(String[] args) {
        PeliculaServ sc = new PeliculaServ();
        List<PeliculaServ> listaPelic = new ArrayList();
        
        sc.fabricarPelis(5);
        sc.mostrarPeli2();
        
        
        
    }
}
