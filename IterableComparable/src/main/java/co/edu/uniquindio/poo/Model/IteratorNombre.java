package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorNombre implements Iterator<String> {
    private ArrayList<String> lista;
    private int contador = 0;

    public IteratorNombre(ArrayList<String> lista) {
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return contador < lista.size();
    }

    @Override
    public String next() {
        if(!hasNext()){
            throw new NoSuchElementException("No hay elementos en la lista");
        }
        return lista.get(contador++);
    }
}
