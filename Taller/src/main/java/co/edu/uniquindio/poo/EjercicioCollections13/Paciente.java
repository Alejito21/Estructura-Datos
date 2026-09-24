package co.edu.uniquindio.poo.EjercicioCollections13;

/**
 * Paciente de una sala de urgencias con nivel de triage y orden de llegada.
 * El triage va de 1 (más urgente) a 5 (menos urgente).
 */
public class Paciente {
    private final String nombre;
    private final int nivelTriage;
    private final long ordenLlegada;

    /**
     * Crea un paciente con sus datos de atención.
     *
     * @param nombre        nombre del paciente
     * @param nivelTriage   prioridad clínica (1–5)
     * @param ordenLlegada  marca de llegada para desempatar el mismo triage
     */
    public Paciente(String nombre, int nivelTriage, long ordenLlegada) {
        this.nombre = nombre;
        this.nivelTriage = nivelTriage;
        this.ordenLlegada = ordenLlegada;
    }

    /** @return nombre del paciente */
    public String getNombre()      { return nombre; }

    /** @return nivel de triage (1 = más urgente) */
    public int getNivelTriage()    { return nivelTriage; }

    /** @return orden de llegada */
    public long getOrdenLlegada()  { return ordenLlegada; }

    /**
     * @return representación {@code "nombre (Triage n)"}
     */
    @Override
    public String toString() {
        return nombre + " (Triage " + nivelTriage + ")";
    }
}
