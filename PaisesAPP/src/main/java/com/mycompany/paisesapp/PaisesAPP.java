

package com.mycompany.paisesapp;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import servicios.PaisServ;

/**
 *
 * @author Polako
 */
public class PaisesAPP {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServ sc = new PaisServ();
        List<Pais> mmm = new ArrayList<>();
        Pais xxx = new Pais();
        
        Pais var1 = sc.cargarPais();
        System.out.println(var1);
        sc.FabricarPaises();
        mmm = sc.getListaPaises();
        Iterator<Pais> it = mmm.iterator();
        
        for (Pais aux : mmm) {
            System.out.println(aux);
        }
        
        System.out.println("Buscar?");
        String var = leer.next();
        while (it.hasNext()) {
            Pais aux = it.next();
            if (var.equalsIgnoreCase(aux.getPais())) {
                it.remove();
            }
            
            
        }
        
         for (Pais aux : mmm) {
            System.out.println(aux);
        }
        
        
        
    }
}
