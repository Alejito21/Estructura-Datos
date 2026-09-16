package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.Collections;

public class MainEjercicios {
    public static void main(String[] args) {

    }


    public static int getindice (ArrayList<Integer> lista){
        int i = Collections.binarySearch(lista, 1);
        return i;
    }

    public static void invertir (ArrayList<String> lista){
        Collections.reverse(lista);
    }

    public static void rellenar(ArrayList<String> lista){
        Collections.fill(lista, "Alejo was here");
    }

    public static void copiarLista(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        Collections.copy(lista1, lista2);
    }

    public static void maximo(ArrayList<Integer> lista){
        Collections.max(lista);
    }

    public static void minimo(ArrayList<Integer> lista){
        Collections.min(lista);
    }

    public static void añadir(ArrayList<Integer> lista, ArrayList<Integer> lista2){
        boolean disjoint = Collections.disjoint(lista, lista2);
    }

    public void segundoNumeroMaximo(ArrayList<Integer> lista){
        int max = Collections.max(lista);
        lista.remove(max);
        Collections.max(lista);

    }
}