package co.edu.uniquindio.poo.EjercicioGenericsIntermedio9;

import java.util.ArrayList;

/**
 * Implementación de {@link Almacenable} que guarda elementos en un {@link ArrayList}
 * y calcula el máximo con {@link Comparable#compareTo}.
 *
 * @param <T> tipo de los elementos; debe implementar {@link Comparable}
 */
public class Mayor<T extends Comparable<T>> implements Almacenable<T> {
    private ArrayList<T> lista = new ArrayList<>();

    /**
     * Guarda un elemento. Si es null, imprime un aviso (igual lo agrega).
     *
     * @param item elemento a guardar
     */
    @Override
    public void guardar(T item) {
        if (item == null) {
            System.out.println("El elemento no puede ser nulo");
        }
        lista.add(item);
    }

    /**
     * Recorre la lista y retorna el elemento máximo según el orden natural.
     * Si la lista está vacía, imprime un aviso.
     *
     * @return elemento máximo de la lista
     */
    @Override
    public T maximo() {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia");
        }
        T maximo = lista.get(0);
        for (T t : lista) {
            if (t.compareTo(maximo) > 0) {
                maximo = t;
            }
        }
        return maximo;
    }
}
