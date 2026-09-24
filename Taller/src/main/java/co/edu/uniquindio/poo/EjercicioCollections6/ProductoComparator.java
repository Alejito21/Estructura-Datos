package co.edu.uniquindio.poo.EjercicioCollections6;

import java.util.Comparator;

/**
 * Comparador de productos por nombre (orden lexicográfico).
 */
public class ProductoComparator implements Comparator<Producto> {
    /**
     * Compara dos productos según su nombre.
     *
     * @param o1 primer producto
     * @param o2 segundo producto
     * @return resultado de {@link String#compareTo} entre los nombres
     */
    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
