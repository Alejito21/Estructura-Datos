package co.edu.uniquindio.poo.EjercicioGenericsBasico3;

import java.util.ArrayList;

/**
 * Implementación de {@link Contenedor} basada en un {@link ArrayList}.
 *
 * @param <T> tipo de los elementos almacenados
 */
public class ListaContenedor<T> implements Contenedor<T> {
    private ArrayList<T> lista = new ArrayList<>();

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param item elemento a agregar
     */
    @Override
    public void agregar(T item) {
        lista.add(item);
    }

    /**
     * Obtiene el elemento en el índice dado. Si el índice es inválido, imprime un aviso.
     *
     * @param indice posición del elemento
     * @return elemento en esa posición
     */
    @Override
    public T obtener(int indice) {
        if (indice > lista.size()) {
            System.out.println("No existe ese indice");
        }
        return lista.get(indice);
    }
}
