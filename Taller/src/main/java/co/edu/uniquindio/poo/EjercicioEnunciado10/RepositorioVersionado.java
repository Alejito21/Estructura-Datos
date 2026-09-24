package co.edu.uniquindio.poo.EjercicioEnunciado10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RepositorioVersionado <T extends Comparable<T>> implements Iterable<T> {

    private final LinkedList<T> elementos = new LinkedList<>();

    public void agregar(T item) {
        if (item == null) {
            throw new IllegalArgumentException("No se permiten valores null");
        }
        elementos.add(item);
    }

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

    public int tamanio() {
        return elementos.size();
    }

    @Override
    public Iterator<T> iterator() {
        return elementos.iterator();
    }

    // Copia superficial recorriendo solo con Iterator
    public List<T> snapshot() {
        List<T> copia = new LinkedList<>();
        Iterator<T> it = elementos.iterator();
        while (it.hasNext()) {
            copia.add(it.next());
        }
        return copia;
    }

    // Elementos que estÃ¡n en este repositorio y no en 'otro'
    public List<T> diff(RepositorioVersionado<T> otro) {
        if (otro == null) {
            throw new IllegalArgumentException("El otro repositorio no puede ser null");
        }

        List<T> resultado = new LinkedList<>();
        Iterator<T> itActual = this.iterator();

        while (itActual.hasNext()) {
            T actual = itActual.next();
            boolean encontrado = false;

            Iterator<T> itOtro = otro.iterator();   // Se reinicia en cada vuelta
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

    @Override
    public String toString() {
        return elementos.toString();
    }
}
