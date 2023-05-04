

package com.mycompany.paisesapp;

import entidades.Pais;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import servicios.PaisServ;
import utilidades.Comparadores;

/**
 *
 * @author Polako
 */
public class PaisesAPP {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServ sc = new PaisServ();
        List<Pais> mmm = new ArrayList<Pais>();
//        HashSet<Pais> yyy = new HashSet<>(mmm);
        Pais xxx = new Pais();
        
//        Pais var1 = sc.cargarPais();
//        System.out.println(var1);
        sc.FabricarPaises2(100);
        mmm = sc.getListaPaises();
        HashSet<Pais> yyy = new HashSet<>(mmm);
        
        Iterator<Pais> it = yyy.iterator();
        
        for (Pais pais : yyy) {
            System.out.println(pais);
        }
        System.out.println("Buscar?");
        String var = leer.next();
        while (it.hasNext()) {
            Pais aux = it.next();
            if (var.equalsIgnoreCase(aux.getPais())) {
                it.remove();
                System.out.println("Se cago");
            }
            
            
        }
        
         for (Pais aux : yyy) {
            System.out.println(aux);
        }
         List<Pais> www = new ArrayList<>(yyy);
         Collections.sort(www, Comparadores.ordenarPaisAsc);
        System.out.println("---------------");
         
          for (Pais aux : www) {
            System.out.println(aux);
        }
        
        
    }
}
