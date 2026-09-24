package co.edu.uniquindio.poo.EjercicioCollections13;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class SalaUrgencias {
    private final PriorityQueue<Paciente> cola = new PriorityQueue<>(
            Comparator.comparingInt(Paciente::getNivelTriage)
                    .thenComparingLong(Paciente::getOrdenLlegada)
    );
    private long contadorLlegadas = 0;

    public void ingresar(String nombre, int nivelTriage) {
        if (nivelTriage < 1 || nivelTriage > 5) {
            throw new IllegalArgumentException("El triage debe estar entre 1 y 5");
        }
        cola.offer(new Paciente(nombre, nivelTriage, contadorLlegadas++));
    }

    public Paciente atenderSiguiente() {
        Paciente p = cola.poll();
        if (p == null) throw new NoSuchElementException("No hay pacientes en espera");
        return p;
    }

    public Paciente verSiguiente() {
        return cola.peek();
    }

    public boolean hayPacientes() {
        return !cola.isEmpty();
    }
}
