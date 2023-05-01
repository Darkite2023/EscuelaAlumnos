/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escuelaalumnos;

import entidades.Alumno;
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
        sc.cargarAlumnos();
        sc.mostrarAlumno();

    }
}
