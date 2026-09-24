package co.edu.uniquindio.poo.EjercicioEnunciado5;

import java.util.Objects;

/**
 * Representa un asistente identificado por documento y nombre.
 * El orden natural se establece por el documento (primero por longitud, luego lexicográfico).
 * Dos asistentes se consideran iguales si tienen el mismo documento.
 */
public class Asistente implements Comparable<Asistente> {

    private final String documento;
    private final String nombre;

    /**
     * Crea un asistente con documento y nombre.
     *
     * @param documento número de documento de identidad
     * @param nombre    nombre completo del asistente
     */
    public Asistente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    /**
     * @return documento del asistente
     */
    public String getDocumento() { return documento; }

    /**
     * @return nombre del asistente
     */
    public String getNombre()    { return nombre; }

    /**
     * Compara por documento: primero por longitud y, en empate, lexicográficamente.
     *
     * @param otro asistente con el que se compara
     * @return valor negativo, cero o positivo según el orden de documentos
     */
    @Override
    public int compareTo(Asistente otro) {
        int porLongitud = Integer.compare(this.documento.length(), otro.documento.length());
        if (porLongitud != 0) {
            return porLongitud;
        }
        return this.documento.compareTo(otro.documento);
    }

    /**
     * Dos asistentes son iguales si tienen el mismo documento.
     *
     * @param o objeto a comparar
     * @return {@code true} si ambos tienen el mismo documento
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asistente)) return false;
        return documento.equals(((Asistente) o).documento);
    }

    /**
     * @return código hash basado en el documento
     */
    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }

    /**
     * @return representación {@code "documento - nombre"}
     */
    @Override
    public String toString() {
        return documento + " - " + nombre;
    }
}
