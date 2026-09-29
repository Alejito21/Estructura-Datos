package co.edu.uniquindio.poo.Model;

public class ListaEnlazada <T>{
    private Nodo<T> inicio;
    private int tam;

    public ListaEnlazada() {
        this.inicio = null;
        this.tam = 0;
    }

    public void agregarPrimero(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        nuevo.setNext(inicio);
        inicio = nuevo;
        tam++;
    }

    public void agregarUltimo(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (isEmpty()){
            inicio = nuevo;
        } else {
            Nodo<T> actual = inicio;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
        }
        tam++;
    }

    public void agregarPosicion(T elemento, int posicion) {
        if (posicion < 0 || posicion > tam) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        }
        if (posicion == 0) {
            agregarPrimero(elemento);
            return;
        }

        Nodo<T> anterior = inicio;
        for (int i =0; i < posicion - 1; i++){
            anterior = anterior.getNext();
        }
        Nodo<T> nuevo = new Nodo<>(elemento);
        nuevo.setNext(anterior.getNext());
        anterior.setNext(nuevo);
        tam++;
    }


    public T removerPrimero() {
        if (isEmpty()){
            throw new IllegalStateException("Lista esta vacia");
        }
        T removido = inicio.getData();
        inicio = inicio.getNext();
        tam--;
        return removido;
    }

    public T removerUltimo() {
        if (isEmpty()){
            throw new IllegalStateException("Lista esta vacia");
        }
        if (tam == 1){
            return removerPrimero();
        }
        Nodo<T> actual = inicio;
        while (actual.getNext().getNext() != null){
            actual = actual.getNext();
        }
        T removido = actual.getNext().getData();
        actual.setNext(null);
        tam--;
        return removido;
    }

    public T removerPosicion(int posicion) {
        if (posicion < 0 || posicion > tam) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        }
        if (posicion == 0) {
            return removerPrimero();
        }
        Nodo<T> anterior = inicio;
        for (int i =0; i < posicion - 1; i++){
            anterior = anterior.getNext();
        }
        Nodo<T> removido = anterior.getNext();
        anterior.setNext(removido.getNext());
        tam--;
        return removido.getData();

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = inicio;
        while (actual != null) {
            sb.append(actual.getData());
            if (actual.getNext() != null) sb.append(" -> ");
            actual = actual.getNext();
        }
        return sb.append("]").toString();
    }


    public boolean isEmpty() {
        return tam == 0;
    }


    public int getTam() {
        return tam;
    }
}
