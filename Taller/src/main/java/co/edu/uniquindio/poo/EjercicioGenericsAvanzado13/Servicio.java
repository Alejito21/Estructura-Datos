package co.edu.uniquindio.poo.EjercicioGenericsAvanzado13;

import java.util.List;

public interface Servicio<T extends Number & Comparable<T>>{
    public T minimo(List<T> lista);
    public T maximo(List<T> lista);
}
