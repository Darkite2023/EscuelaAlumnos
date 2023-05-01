
package com.mycompany.arraylistguia9;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.PerroServ;

/**
 *
 * @author Andrey
 */
public class ArrayListGuia9 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServ sc = new PerroServ();
        ArrayList<Perro> prueba = new ArrayList<>();
        boolean bol1 = false;
        int num1;
        System.out.println(bol1);
        int x = 0;
//        do {
//            prueba.add(sc.crearPerro(5));
//            System.out.println("Desea continuar? 1 para salir");
//            
//            num1 = leer.nextInt();
//            if (num1==1) {
//                
//                bol1=true;
//
//            }
//
//        } while (bol1==false);

        sc.fabricarPerro(5);
        sc.mostrarPerro();
        System.out.println("--------------");
        sc.fabricarPerro(5);
        sc.mostrarPerro();
        System.out.println("--------------");
        sc.eliminarPerro(0);
        sc.mostrarPerro();
        System.out.println("--------------");
        Perro xxx = sc.crearPerro();
        sc.agregarPerro(0, xxx);
        sc.mostrarPerro();
         
         
        

        
//        for (Perro iter : prueba) {
//            sc.mostrarPerro(iter);
//            
//           System.out.println(iter);
//            
//        }
//        
        
        
    }
}
