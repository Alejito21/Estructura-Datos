package co.edu.uniquindio.poo.App;

import co.edu.uniquindio.poo.Model.EstudianteComparable;
import co.edu.uniquindio.poo.Model.EstudianteComparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparable {

    public static void main(String[] args) {
        ArrayList<EstudianteComparable> listaEstudiantes = new ArrayList<>();
        EstudianteComparable e1 = new EstudianteComparable("Ale", "1092", 4, "Ingenieria");
        EstudianteComparable e2 = new EstudianteComparable("Nico", "1094", 2, "Bellas Artes");
        EstudianteComparable e3 = new EstudianteComparable("Catica", "1096", 5, "Ingenieria");
        EstudianteComparable e4 = new EstudianteComparable("Manuel", "1098", 1, "Agro");
        EstudianteComparable e5 = new EstudianteComparable("Messi", "1099", 3, "Educacion");

        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        listaEstudiantes.add(e4);
        listaEstudiantes.add(e5);
        Collections.sort(listaEstudiantes);
        System.out.printf(listaEstudiantes.toString());
        System.out.println("\n");

        Collections.sort(listaEstudiantes, new EstudianteComparator());
        System.out.printf(listaEstudiantes.toString());


    }
}
