package co.edu.uniquindio.poo.EjercicioEnunciado10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Repositorio genérico versionable que almacena elementos comparables en una {@link LinkedList}.
 * Es iterable y permite obtener capturas (snapshots) y diferencias respecto a otro repositorio.
 *
 * @param <T> tipo de los elementos; debe implementar {@link Comparable}
 */
public class RepositorioVersionado<T extends Comparable<T>> implements Iterable<T> {

    private final LinkedList<T> elementos = new LinkedList<>();

    /**
     * Agrega un elemento al repositorio.
     *
     * @param item elemento a agregar
     * @throws IllegalArgumentException si {@code item} es null
     */
    public void agregar(T item) {
        if (item == null) {
            throw new IllegalArgumentException("No se permiten valores null");
        }
        elementos.add(item);
    }

    /**
     * Elimina la primera ocurrencia del elemento, comparándolo con {@link Comparable#compareTo}.
     * Usa únicamente {@link Iterator} para el recorrido y la eliminación.
     *
     * @param item elemento a eliminar
     * @return {@code true} si se eliminó; {@code false} si no se encontró
     */
    public boolean eliminar(T item) {
        Iterator<T> it = elementos.iterator();
        while (it.hasNext()) {
            if (it.next().compareTo(item) == 0) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * @return cantidad de elementos en el repositorio
     */
    public int tamanio() {
        return elementos.size();
    }

    /**
     * @return iterador sobre los elementos del repositorio
     */
    @Override
    public Iterator<T> iterator() {
        return elementos.iterator();
    }

    /**
     * Genera una copia superficial de los elementos, recorriendo solo con {@link Iterator}.
     *
     * @return nueva lista con los mismos elementos en el mismo orden
     */
    public List<T> snapshot() {
        List<T> copia = new LinkedList<>();
        Iterator<T> it = elementos.iterator();
        while (it.hasNext()) {
            copia.add(it.next());
        }
        return copia;
    }

    /**
     * Calcula los elementos que están en este repositorio y no en {@code otro},
     * usando comparación por {@link Comparable#compareTo}.
     *
     * @param otro repositorio de referencia
     * @return lista de elementos presentes aquí y ausentes en {@code otro}
     * @throws IllegalArgumentException si {@code otro} es null
     */
    public List<T> diff(RepositorioVersionado<T> otro) {
        if (otro == null) {
            throw new IllegalArgumentException("El otro repositorio no puede ser null");
        }

        List<T> resultado = new LinkedList<>();
        Iterator<T> itActual = this.iterator();

        while (itActual.hasNext()) {
            T actual = itActual.next();
            boolean encontrado = false;

            Iterator<T> itOtro = otro.iterator();
            while (itOtro.hasNext() && !encontrado) {
                if (actual.compareTo(itOtro.next()) == 0) {
                    encontrado = true;
                }
            }

            if (!encontrado) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    /**
     * @return representación en cadena de los elementos
     */
    @Override
    public String toString() {
        return elementos.toString();
    }
}
