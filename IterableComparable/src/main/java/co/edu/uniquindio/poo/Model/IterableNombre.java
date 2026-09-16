package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableNombre implements Iterable<String> {
    private ArrayList<String> listaNombres;

    public IterableNombre() {
        this.listaNombres = new ArrayList<>();
    }

    public void agregarNombre(String nombre) {
        this.listaNombres.add(nombre);
    }


    @Override
    public Iterator<String> iterator() {
        return new IteratorNombre(listaNombres);
    }


    public ArrayList<String> getListaNombres() {
        return listaNombres;
    }

    public void setListaNombres(ArrayList<String> listaNombres) {
        this.listaNombres = listaNombres;
    }
}


