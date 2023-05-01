/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escuelaalumnos;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import servicios.AlumnoServ;

/**
 *
 * @author Polako
 */
public class EscuelaAlumnos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        AlumnoServ sc = new AlumnoServ();
        Alumno alum = new Alumno();
        
        List<Alumno> curso = sc.getAlumnis();
        sc.cargarAlumnos();
        sc.mostrarAlumno();
        
        System.out.println("-------------------------");
        
        for (Alumno aux : curso) {
            System.out.println(sc.notaFinal(aux));
        }
        
        System.out.println("-------------------------");
        
        sc.buscarAlumne("A1");
        
        
        

    }
}
