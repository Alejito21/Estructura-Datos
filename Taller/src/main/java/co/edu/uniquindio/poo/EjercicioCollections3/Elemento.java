package co.edu.uniquindio.poo.EjercicioCollections3;

import java.util.Objects;

/**
 * Elemento almacenado en un contenedor, identificado por nombre y número.
 * La igualdad se basa en el nombre.
 */
public class Elemento {
    private String nombre;
    private int numero;

    /**
     * Crea un elemento con nombre y número.
     *
     * @param nombre nombre del elemento
     * @param numero número asociado
     */
    public Elemento(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    /**
     * @return nombre del elemento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return número del elemento
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero nuevo número
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Compara igualdad basándose en el nombre.
     *
     * @param obj objeto a comparar
     * @return {@code true} si ambos tienen el mismo nombre
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elemento otro = (Elemento) obj;
        return nombre == otro.nombre && Objects.equals(nombre, otro.nombre);
    }

    /**
     * @return código hash basado en nombre y número
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero);
    }

    /**
     * @return representación en cadena del elemento
     */
    @Override
    public String toString() {
        return "Elemento{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                '}';
    }
}
