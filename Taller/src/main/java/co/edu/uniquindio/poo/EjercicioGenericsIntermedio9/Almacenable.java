package co.edu.uniquindio.poo.EjercicioGenericsIntermedio9;

/**
 * Contrato genérico para almacenar elementos comparables y obtener el máximo.
 *
 * @param <T> tipo de los elementos; debe implementar {@link Comparable}
 */
public interface Almacenable<T extends Comparable<T>> {
    /**
     * Guarda un elemento en el almacén.
     *
     * @param item elemento a guardar
     */
    public void guardar(T item);

    /**
     * Obtiene el elemento máximo según el orden natural de {@code T}.
     *
     * @return elemento máximo almacenado
     */
    public T maximo();
}
