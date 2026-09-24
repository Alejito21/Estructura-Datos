package co.edu.uniquindio.poo.EjercicioGenericsBasico3;

/**
 * Contrato genérico de un contenedor que permite agregar elementos y obtenerlos por índice.
 *
 * @param <T> tipo de los elementos almacenados
 */
public interface Contenedor<T> {
    /**
     * Agrega un elemento al contenedor.
     *
     * @param item elemento a agregar
     */
    public void agregar(T item);

    /**
     * Obtiene el elemento en la posición indicada.
     *
     * @param indice posición del elemento
     * @return elemento en ese índice
     */
    public T obtener(int indice);
}
