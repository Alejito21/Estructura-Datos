package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Model.ListaEnlazada;


public class Main {
    public static void main(String[] args) {
        ListaEnlazada<String> lista = new ListaEnlazada<>();

        lista.agregarPrimero("Ale");
        lista.agregarPrimero("Nico");
        lista.agregarUltimo("Gyro");
        lista.agregarPosicion("Jhonny",2);
        System.out.println(lista);
        lista.agregarPrimero("Messi");
        lista.agregarUltimo("De Jong");
        System.out.println(lista);


        lista.removerPrimero();
        lista.removerUltimo();
        System.out.println(lista);

        lista.removerPosicion(1);
        System.out.println(lista);


    }
}