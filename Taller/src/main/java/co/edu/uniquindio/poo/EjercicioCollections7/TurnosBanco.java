package co.edu.uniquindio.poo.EjercicioCollections7;

import java.util.LinkedList;

public class TurnosBanco {
    private LinkedList<String> clientes;

    public TurnosBanco() {
        this.clientes = new LinkedList<>();
    }

    public void agregarACola(String nombre) {
        clientes.addLast(nombre);
        System.out.println("Se agrego el cliente: " + nombre + "\n");
    }

    public void atenderCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes que atender.");
        }
        System.out.println("Cliente atendido: " + clientes.getFirst() + "\n");
        clientes.removeFirst();

    }

    public void agregarPioridad(String nombre) {
        clientes.addFirst(nombre);
        System.out.println("Se agrego el cliente con pioridad: " + nombre + "\n");
    }

    public void mostarCola () {
        System.out.println(clientes.size());
    }

}
