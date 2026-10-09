package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;

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


    //Combinar elementos de dos listas enlazadas
    public ListaEnlazada<T> combinarListasIntercalar(ListaEnlazada<T> lista1, ListaEnlazada<T> lista2){
        ListaEnlazada <T> nueva = new ListaEnlazada<>();
        Nodo <T> a = lista1.inicio;
        Nodo <T> b = lista2.inicio;
        while (a != null || b != null) {
            if (a != null) {
                nueva.agregarPrimero(a.getData());
                a = a.getNext();
            }
            if (b != null) {
                nueva.agregarPrimero(b.getData());
                b = b.getNext();
            }
        }
        return nueva;
    }

    //Invertir las posiciones de la lista
    public void invertir(){
        Nodo <T> anterior = null;
        Nodo <T> actual = inicio;
        while (actual != null) {
            Nodo <T> siguiente = actual.getNext();
            actual.setNext(anterior);
            anterior = actual;
            actual = siguiente;

        }
        inicio = anterior;
    }

    //Eliminar datos duplicados
    public void eliminarDuplicados(){
        Nodo <T> actual = inicio;
        while (actual != null) {
            Nodo <T> referencia = actual;
                while (referencia.getNext() != null) {
                    if (referencia.getNext().getData() == actual.getData()) {
                        referencia.setNext(referencia.getNext().getNext());
                    } else {
                        referencia = referencia.getNext();
                    }
                }
                actual = actual.getNext();
        }
    }

    //Dividir una lista en una de pares y otra de impares
    public void dividirLista(){
        ListaEnlazada <T> pares = new ListaEnlazada<>();
        ListaEnlazada <T> impares = new ListaEnlazada<>();
        int posicion = 1;
        Nodo <T> actual = inicio;
        while (actual != null) {
            if (posicion %2 == 0) {
                pares.agregarPrimero(actual.getData());
            }else {
                impares.agregarPrimero(actual.getData());
            }
            actual = actual.getNext();
            posicion++;
        }
        System.out.println(impares);
        System.out.println(pares);

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
