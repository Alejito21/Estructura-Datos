package co.edu.uniquindio.poo.EjercicioCollections13;

public class Paciente {
    private final String nombre;
    private final int nivelTriage;     // 1 = más urgente, 5 = menos urgente
    private final long ordenLlegada;

    public Paciente(String nombre, int nivelTriage, long ordenLlegada) {
        this.nombre = nombre;
        this.nivelTriage = nivelTriage;
        this.ordenLlegada = ordenLlegada;
    }

    public String getNombre()      { return nombre; }
    public int getNivelTriage()    { return nivelTriage; }
    public long getOrdenLlegada()  { return ordenLlegada; }

    @Override
    public String toString() {
        return nombre + " (Triage " + nivelTriage + ")";
    }
}
