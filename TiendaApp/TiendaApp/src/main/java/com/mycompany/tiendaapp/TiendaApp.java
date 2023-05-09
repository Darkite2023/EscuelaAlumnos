/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaapp;

import java.util.Scanner;
import servicios.ProductoServ;

/**
 *
 * @author Polako
 */
public class TiendaApp {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ProductoServ sc = new ProductoServ();
        
           
      
        boolean bol1=false;
        
        do {
            System.out.println("1: Introducir un producto");
            System.out.println("2: Modificar precios de un producto");
            System.out.println("3: Eliminar un producto");
            System.out.println("4: Mostrar todos los productos");
            System.out.println("5: Salir");
            int var1 = leer.nextInt();
            
            switch (var1) {
                case 1:
                    
                    System.out.println("Cuantos productos desea ingresar?");
                    int var2 = leer.nextInt();
//                    int var2 = 5;
                    
                    sc.FabricarProductos(var2);
                    sc.cargarProducto();

                    break;
                case 2:
                    
                    System.out.println("Que producto desea modificar?");
                    leer.nextLine();
                    String precioPr = leer.nextLine();
                   
                    sc.modificarProducto(precioPr);
                    break;
                    
                case 3:
                    System.out.println("Que proiducto desea eleminar?");
                    sc.eliminarProducto(precioPr);

                    break;
                case 4:
//                    sc.mostrarProductos2();
//                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    sc.mostrarProductos();

                    break;
                case 5:
                    bol1 = true;

                    break;

                default:
                    throw new AssertionError();
            }
        } while (bol1==false);
        
    }
}
