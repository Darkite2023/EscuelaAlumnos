/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Polako
 */
public class PaisServ {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Pais> listaPaises = new ArrayList<>();

    public PaisServ() {
    }

    public List<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }
    
    public Pais cargarPais(){
        Pais x =new Pais("Pais Bananero" + ((int) (Math.random() * 100)+1));
        
        return x;
    }
    
    public void FabricarPaises() {
        String var1;

        do {
            listaPaises.add(cargarPais());
            System.out.println("Sigo? Si o No");
             var1 = leer.next();
        } while (var1.equalsIgnoreCase("Si"));
    }
    
    
    
}
