package co.edu.uniquindio.poo.EjercicioCollections13;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/**
 * Sala de urgencias que atiende pacientes con una {@link PriorityQueue}.
 * Prioriza por nivel de triage y, en empate, por orden de llegada.
 */
public class SalaUrgencias {
    private final PriorityQueue<Paciente> cola = new PriorityQueue<>(
            Comparator.comparingInt(Paciente::getNivelTriage)
                    .thenComparingLong(Paciente::getOrdenLlegada)
    );
    private long contadorLlegadas = 0;

    /**
     * Ingresa un paciente a la cola de espera.
     *
     * @param nombre      nombre del paciente
     * @param nivelTriage triage entre 1 y 5
     * @throws IllegalArgumentException si el triage está fuera de rango
     */
    public void ingresar(String nombre, int nivelTriage) {
        if (nivelTriage < 1 || nivelTriage > 5) {
            throw new IllegalArgumentException("El triage debe estar entre 1 y 5");
        }
        cola.offer(new Paciente(nombre, nivelTriage, contadorLlegadas++));
    }

    /**
     * Atiende y retira al siguiente paciente de la cola.
     *
     * @return paciente atendido
     * @throws NoSuchElementException si no hay pacientes en espera
     */
    public Paciente atenderSiguiente() {
        Paciente p = cola.poll();
        if (p == null) throw new NoSuchElementException("No hay pacientes en espera");
        return p;
    }

    /**
     * Consulta el siguiente paciente sin retirarlo de la cola.
     *
     * @return paciente al frente, o {@code null} si la cola está vacía
     */
    public Paciente verSiguiente() {
        return cola.peek();
    }

    /**
     * @return {@code true} si hay pacientes esperando
     */
    public boolean hayPacientes() {
        return !cola.isEmpty();
    }
}
