/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Producto;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Polako
 */
public class ProductoServ {
    
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashSet<Producto> listaProductos = new HashSet<>();
    HashMap<String,Integer> inventario = new HashMap<>();
   

   
    public void cargarProducto(){
         Iterator<Producto> it = listaProductos.iterator();
        while (it.hasNext()) {
            Producto next = it.next();
            inventario.put((next.getNombreProducto()),(next.getPrecioProd()));
            
        }
        
    }
    
    public Producto crearProducto() {
//        Producto gen2 = new Producto(("Producto " + ((int) (Math.random() * 10) + 1)), 10);
        Producto gen2 = new Producto(("Producto" + ((int) (Math.random() * 100) + 1)), ((int) (Math.random() * 1000) + 1));
        return gen2;
    }

    public void FabricarProductos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            listaProductos.add(crearProducto());
        }

    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Integer> aux : inventario.entrySet()) {
            String key = aux.getKey();
            Integer val = aux.getValue();
            System.out.println("Key "+key+" "+" Value "+val);
            
        }
    }
    
     public void mostrarProductos2(){
         for (Producto aux : listaProductos) {
             System.out.println(aux);
            
         }
}
     
     public void modificarProducto(String productoKey){
        for (Map.Entry<String, Integer> aux : inventario.entrySet()) {
            String key = aux.getKey();
           
            if (key.equalsIgnoreCase(productoKey)) {
                System.out.println("Ingrese el precio nuevo");
                int precio =leer.nextInt();
                Integer val = aux.setValue(precio);
               
            }
            
           
            
        }
    }
     
      public void eliminarProducto(String productoKey){
       for (Producto next : listaProductos) {
           if (next.getNombreProducto().equalsIgnoreCase(productoKey)) {
               inventario.remove(productoKey);
           }
       }
           
            
        }
    }


