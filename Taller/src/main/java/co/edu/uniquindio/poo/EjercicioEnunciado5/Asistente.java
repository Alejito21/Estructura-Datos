package co.edu.uniquindio.poo.EjercicioEnunciado5;

import java.util.Objects;

public class Asistente implements Comparable<Asistente>{

    private final String documento;
    private final String nombre;

    public Asistente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public String getDocumento() { return documento; }
    public String getNombre()    { return nombre; }

    // Orden natural: por documento (como número, sin convertirlo)
    @Override
    public int compareTo(Asistente otro) {
        int porLongitud = Integer.compare(this.documento.length(), otro.documento.length());
        if (porLongitud != 0) {
            return porLongitud;
        }
        return this.documento.compareTo(otro.documento);
    }

    // Coherente con compareTo: dos asistentes son iguales si tienen el mismo documento
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asistente)) return false;
        return documento.equals(((Asistente) o).documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }

    @Override
    public String toString() {
        return documento + " - " + nombre;
    }
}
