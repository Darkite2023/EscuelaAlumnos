/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Polako
 */
public class AlumnoServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Alumno> alumnis = new ArrayList<>();

    public AlumnoServ() {
    }

    public List<Alumno> getAlumnis() {
        return alumnis;
    }

    public void setAlumnis(List<Alumno> alumnis) {
        this.alumnis = alumnis;
    }
    

    public void cargarAlumnos() {
        boolean bol1 = false;

        do {
            
            String var1 = "";
            alumnis.add(crearAlumno());
            System.out.println("Crear otro si o no?");
            var1 = leer.next();
            if (var1.equalsIgnoreCase("no")) {
                bol1 = true;
            }
        } while (bol1 == false);

    }

    public Alumno crearAlumno() {
        Alumno x = new Alumno();
        System.out.println("Nombre");
        x.setNombre("A" + ((int) (Math.random() * 10)+1));

        ArrayList<Integer> ww = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ww.add((int) ((Math.random() * 10) + 1));
        }
        x.setNotas(ww);

        return x;
    }
    public double notaFinal(Alumno xxx){
        List<Integer> ww = new ArrayList<>();
        ww = xxx.getNotas();
        double num1=0;
        double ntFnl;
        
        for (int i = 0; i < ww.size(); i++) {
            num1=num1+ww.get(i);
        }
        
        ntFnl = num1/ww.size(); 
        System.out.println("Alumno "+xxx.getNombre());
        return ntFnl;
    }
   
    
    public void buscarAlumne(String nombreAlumno) {

        for (int i = 0; i < alumnis.size(); i++) {
            Alumno w = alumnis.get(i);
            String m = alumnis.get(i).getNombre();
            if (m.equalsIgnoreCase(nombreAlumno)) {
//                notaFinal(w);
                System.out.println("La nota final es "+notaFinal(w)+" Index "+(i+1));
            }

        }
    }
    
    

    public void mostrarAlumno() {
        for (Alumno aux : alumnis) {
            System.out.println(aux);

        }
    }
}
