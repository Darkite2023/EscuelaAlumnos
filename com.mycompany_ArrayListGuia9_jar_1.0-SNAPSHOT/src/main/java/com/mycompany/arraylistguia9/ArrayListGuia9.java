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
        
        prueba.add(dog1);
        
        System.out.println(prueba.get(0));
    }
}
