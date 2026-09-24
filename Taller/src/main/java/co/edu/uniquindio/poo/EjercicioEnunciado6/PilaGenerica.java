package co.edu.uniquindio.poo.EjercicioEnunciado6;

import java.util.*;
import java.util.function.Predicate;

/**
 * Pila genérica implementada sobre una {@link LinkedList}.
 * El primer elemento de la lista representa la cima de la pila.
 *
 * @param <T> tipo de los elementos almacenados
 */
public class PilaGenerica<T> {
    private final LinkedList<T> elementos = new LinkedList<>();

    /**
     * Apila un elemento en la cima.
     *
     * @param item elemento a apilar
     */
    public void apilar(T item) {
        elementos.addFirst(item);
    }

    /**
     * Desapila y retorna el elemento de la cima.
     *
     * @return elemento desapilado
     * @throws NoSuchElementException si la pila está vacía
     */
    public T desapilar() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos.removeFirst();
    }

    /**
     * Consulta el elemento de la cima sin desapilarlo.
     *
     * @return elemento en la cima
     * @throws NoSuchElementException si la pila está vacía
     */
    public T cima() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos.getFirst();
    }

    /**
     * @return {@code true} si la pila no tiene elementos
     */
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    /**
     * @return cantidad de elementos en la pila
     */
    public int tamanio() {
        return elementos.size();
    }

    /**
     * Recorre la pila de la cima al fondo y copia hasta {@code max} elementos
     * que cumplan el predicado {@code p}. No modifica la pila.
     *
     * @param p   condición que deben cumplir los elementos
     * @param max cantidad máxima de elementos a extraer
     * @return lista con los elementos que cumplen la condición (máximo {@code max})
     * @throws IllegalArgumentException si {@code p} es null o {@code max} es negativo
     */
    public List<T> extraerSi(Predicate<T> p, int max) {
        if (p == null) {
            throw new IllegalArgumentException("El predicado no puede ser null");
        }
        if (max < 0) {
            throw new IllegalArgumentException("max no puede ser negativo");
        }

        List<T> resultado = new ArrayList<>();
        Iterator<T> it = elementos.iterator();

        while (it.hasNext() && resultado.size() < max) {
            T actual = it.next();
            if (p.test(actual)) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    /**
     * @return representación de la pila indicando la cima
     */
    @Override
    public String toString() {
        return "Cima -> " + elementos;
    }
}
