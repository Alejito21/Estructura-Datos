package co.edu.uniquindio.poo.EjercicioEnunciado6;

import java.util.*;
import java.util.function.Predicate;

public class PilaGenerica <T> {
    // El primer elemento de la LinkedList es la cima de la pila
    private final LinkedList<T> elementos = new LinkedList<>();

    public void apilar(T item) {
        elementos.addFirst(item);
    }

    public T desapilar() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos.removeFirst();
    }

    public T cima() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos.getFirst();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public int tamanio() {
        return elementos.size();
    }

    // Recorre de la cima al fondo y copia hasta 'max' elementos que cumplan 'p'
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

    @Override
    public String toString() {
        return "Cima -> " + elementos;
    }
}
