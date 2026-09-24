package co.edu.uniquindio.poo.EjercicioGenericsAvanzado13;

import java.util.List;

/**
 * Servicio genérico acotado a tipos numéricos comparables.
 * Define operaciones para obtener el mínimo y el máximo de una lista.
 *
 * @param <T> tipo numérico que también implementa {@link Comparable}
 */
public interface Servicio<T extends Number & Comparable<T>> {
    /**
     * Obtiene el valor mínimo de la lista.
     *
     * @param lista lista de valores numéricos
     * @return valor mínimo
     */
    public T minimo(List<T> lista);

    /**
     * Obtiene el valor máximo de la lista.
     *
     * @param lista lista de valores numéricos
     * @return valor máximo
     */
    public T maximo(List<T> lista);
}
