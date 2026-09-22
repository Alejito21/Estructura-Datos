package co.edu.uniquindio.poo.Ejercicio2;

import java.util.Comparator;

public class ProductoComparator implements Comparator<Producto> {
    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
