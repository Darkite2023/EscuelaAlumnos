
package com.mycompany.arraylistguia9;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import servicios.PerroServ;

/**
 *
 * @author Andrey
 */
public class ArrayListGuia9 {

    public static void main(String[] args) {
  
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServ sc = new PerroServ();
//        String[] pruba2 = {"Pepa", "pipa", "pupa"};
//        String[] pruba4 = {"qepa", "qipa", "qupa"};
//        ArrayList<String> prueba = new ArrayList<>(Arrays.asList(pruba2));
//        ArrayList<String> prueba5 = new ArrayList<>();
//        Iterator<String> it = prueba5.iterator();
//
//        for (String aux : prueba) {
//            System.out.println(aux);
//        }
//        System.out.println("--------------");
//        System.out.println(prueba.get(1));
//        System.out.println("--------------");
//        prueba5.addAll(prueba);
//        prueba5.addAll(1, (Arrays.asList(pruba4)));
//        for (String aux : prueba5) {
//            System.out.println(aux);
//        }
//
//        System.out.println("--------------");
//
//        for (int i = 0; i < prueba5.size(); i++) {
//
//            String m = prueba5.get(i);
//            if (m.equalsIgnoreCase("pupa")) {
//
//                prueba5.remove(i);
//
//            }
//
//        }
//
//        for (int i = 0; i < prueba5.size(); i++) {
//
//            String m = prueba5.get(i);
//            System.out.println(m);
//
//        }

 


        
        sc.fabricarPerro(10);
        sc.mostrarPerro();
        System.out.println("--------------");
        sc.eliminarPerro(0);
        sc.mostrarPerro();
        System.out.println("--------------");
        
        sc.agregarPerro2(1);
        sc.mostrarPerro();
        System.out.println("--------------");
        System.out.println("Ingrese la raza que desea buscar y eliminar");
        sc.buscarElimanar2(leer.next());
          
         sc.mostrarPerro();
        
        System.out.println("--------------");
        sc.actualizarRaza("dog1", "Polako");
        sc.mostrarPerro();


        
    }
}
