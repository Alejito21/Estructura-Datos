package co.edu.uniquindio.poo.App;

import co.edu.uniquindio.poo.Model.IterableNombre;

public class Main {
    public static void main(String[] args) {
        IterableNombre listaNombres = new IterableNombre();
        listaNombres.agregarNombre("Alejo");
        listaNombres.agregarNombre("Laura");
        listaNombres.agregarNombre("Catica");
        listaNombres.agregarNombre("Nico");
        listaNombres.agregarNombre("Michelle");
        listaNombres.agregarNombre("David");
        listaNombres.agregarNombre("Juan");
        listaNombres.agregarNombre("Ale");
        listaNombres.agregarNombre("Lore");

        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
        System.out.println("\n");

        for (String nombre : listaNombres) {
            if (nombre.length() > 4) {
                System.out.println("Muy largo");
            }

            System.out.println(nombre);
        }
        System.out.println("\n");


    }



}