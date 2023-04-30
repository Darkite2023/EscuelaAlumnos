/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistguia9;

import entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class ArrayListGuia9 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        ArrayList<Perro> prueba = new ArrayList<>();
        
        Perro dog1 = new Perro("corky");
        Perro dog2 = new Perro("corky2");
        Perro dog3 = new Perro("corky3");
        Perro dog4 = new Perro("corky4");
        
        
        prueba.add(dog1);
        prueba.add(dog2);
        prueba.add(dog3);
        prueba.add(dog4);
        
        System.out.println(prueba.get(0));
        System.out.println(prueba.get(1));
        System.out.println(prueba.get(2));
        System.out.println(prueba.get(3));
       
    }
}
