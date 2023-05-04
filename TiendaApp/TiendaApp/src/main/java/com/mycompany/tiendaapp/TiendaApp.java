/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaapp;

import servicios.ProductoServ;

/**
 *
 * @author Polako
 */
public class TiendaApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ProductoServ sc = new ProductoServ();
        
        sc.FabricarProductos(25);
        sc.cargarProducto();
        System.out.println("-----------");
        sc.mostrarProductos();
        System.out.println("------------");
        sc.mostrarProductos2();
        System.out.println("------------");
        
    }
}
