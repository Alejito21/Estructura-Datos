package co.edu.uniquindio.poo.EjercicioCollections3;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Contenedor de elementos basado en un {@link HashSet}.
 * Es iterable, lo que permite recorrerlo con for-each o con {@link Iterator}.
 */
public class Contenedor implements Iterable<Elemento> {
    private HashSet<Elemento> contenedor;

    /**
     * Crea un contenedor vacío.
     */
    public Contenedor() {
        this.contenedor = new HashSet<>();
    }

    /**
     * Agrega un elemento al contenedor. Los duplicados (según {@link Elemento#equals}) se ignoran.
     *
     * @param elemento elemento a agregar
     */
    public void agregar(Elemento elemento) {
        this.contenedor.add(elemento);
    }

    /**
     * Método reservado para recorrer el contenedor (sin implementación actual).
     */
    public void recorrerContenedor() {
    }

    /**
     * @return conjunto interno de elementos
     */
    public HashSet<Elemento> getContenedor() {
        return contenedor;
    }

    /**
     * @param contenedor nuevo conjunto de elementos
     */
    public void setContenedor(HashSet<Elemento> contenedor) {
        this.contenedor = contenedor;
    }

    /**
     * @return iterador sobre los elementos del contenedor
     */
    @Override
    public Iterator<Elemento> iterator() {
        return contenedor.iterator();
    }
}
