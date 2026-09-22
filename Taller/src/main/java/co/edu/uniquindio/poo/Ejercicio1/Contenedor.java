package co.edu.uniquindio.poo.Ejercicio1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Contenedor implements Iterable<Elemento> {
    private HashSet<Elemento> contenedor;

    public Contenedor() {
        this.contenedor = new HashSet<>();
    }

    public void agregar(Elemento elemento) {
        this.contenedor.add(elemento);
    }

    public void recorrerContenedor() {
    }


    public HashSet<Elemento> getContenedor() {
        return contenedor;
    }

    public void setContenedor(HashSet<Elemento> contenedor) {
        this.contenedor = contenedor;
    }

    @Override
    public Iterator<Elemento> iterator() {
        return contenedor.iterator();
        //return new ContenedorIterador(contenedor);
    }
}
