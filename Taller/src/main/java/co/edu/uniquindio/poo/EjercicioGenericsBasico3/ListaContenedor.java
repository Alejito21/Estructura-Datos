package co.edu.uniquindio.poo.EjercicioGenericsBasico3;

import java.util.ArrayList;

public class ListaContenedor <T> implements Contenedor <T>{
    private ArrayList<T> lista = new ArrayList<>();

    @Override
    public void agregar(T item) {
        lista.add(item);
    }

    @Override
    public T obtener(int indice) {
        if (indice > lista.size()) {
            System.out.println("No existe ese indice");
        }
        return lista.get(indice);
    }
}

