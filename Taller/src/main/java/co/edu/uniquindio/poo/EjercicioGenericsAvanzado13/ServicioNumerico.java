package co.edu.uniquindio.poo.EjercicioGenericsAvanzado13;

import java.util.List;

/**
 * Implementación de {@link Servicio} que calcula mínimo y máximo
 * recorriendo la lista y usando {@link Comparable#compareTo}.
 *
 * @param <T> tipo numérico que también implementa {@link Comparable}
 */
public class ServicioNumerico<T extends Number & Comparable<T>> implements Servicio<T> {
    /**
     * Recorre la lista y retorna el valor mínimo.
     *
     * @param lista lista de valores (no vacía)
     * @return valor mínimo
     */
    @Override
    public T minimo(List<T> lista) {
        T minimo = lista.get(0);
        for (T actual : lista) {
            if (actual.compareTo(minimo) < 0) {
                minimo = actual;
            }
        }
        return minimo;
    }

    /**
     * Recorre la lista y retorna el valor máximo.
     *
     * @param lista lista de valores (no vacía)
     * @return valor máximo
     */
    @Override
    public T maximo(List<T> lista) {
        T maximo = lista.get(0);
        for (T actual : lista) {
            if (actual.compareTo(maximo) > 0) {
                maximo = actual;
            }
        }
        return maximo;
    }
}
