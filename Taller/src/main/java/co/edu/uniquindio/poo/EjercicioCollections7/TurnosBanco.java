package co.edu.uniquindio.poo.EjercicioCollections7;

import java.util.LinkedList;

/**
 * Sistema de turnos de un banco basado en una {@link LinkedList}.
 * Los clientes se atienden en orden FIFO; se pueden insertar clientes con prioridad al frente.
 */
public class TurnosBanco {
    private LinkedList<String> clientes;

    /**
     * Crea una cola de turnos vacía.
     */
    public TurnosBanco() {
        this.clientes = new LinkedList<>();
    }

    /**
     * Agrega un cliente al final de la cola.
     *
     * @param nombre nombre del cliente
     */
    public void agregarACola(String nombre) {
        clientes.addLast(nombre);
        System.out.println("Se agrego el cliente: " + nombre + "\n");
    }

    /**
     * Atiende (elimina) al cliente que está al frente de la cola.
     * Si la cola está vacía, muestra un mensaje.
     */
    public void atenderCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes que atender.");
        }
        System.out.println("Cliente atendido: " + clientes.getFirst() + "\n");
        clientes.removeFirst();
    }

    /**
     * Agrega un cliente con prioridad al frente de la cola.
     *
     * @param nombre nombre del cliente prioritario
     */
    public void agregarPioridad(String nombre) {
        clientes.addFirst(nombre);
        System.out.println("Se agrego el cliente con pioridad: " + nombre + "\n");
    }

    /**
     * Muestra en consola la cantidad de clientes en la cola.
     */
    public void mostarCola() {
        System.out.println(clientes.size());
    }
}
