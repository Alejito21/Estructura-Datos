package co.edu.uniquindio.poo.EjercicioGenericsAvanzado13;

import java.util.List;

public class ServicioNumerico <T extends Number & Comparable<T>> implements Servicio<T>{
    @Override
    public T minimo(List<T> lista) {
        T minimo = lista.get(0);
        for (T actual : lista) {
            if (actual.compareTo(minimo) < 0) {
                minimo = actual;
            }
        }
        return minimo;
    }

    @Override
    public T maximo(List<T> lista) {
        T maximo = lista.get(0);
        for (T actual : lista) {
            if (actual.compareTo(maximo) > 0) {
                maximo = actual;
            }
        }
        return maximo;
    }
}
