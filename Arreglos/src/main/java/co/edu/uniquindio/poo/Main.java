package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] num = {12, 56, 200, 76};
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(777);
        listaNumeros.add(1);
        listaNumeros.add(23);
        listaNumeros.add(40);
        cabezaCola(listaNumeros);
        recorrerArreglo(num, 0);
    }

    public static void cabezaCola(List<Integer> lista) {

        //Caso base: Que la lista este vacia
        if(lista.isEmpty()){
            System.out.println("Lista vacia");
            return;
        }

        //Caso recursivo: Metodo Cabeza-Cola
        int cabeza = lista.getFirst();
        System.out.println(cabeza);

        List <Integer> cola = lista.subList(1, lista.size());
        cabezaCola(cola);

    }

    public static void recorrerArreglo(int [] arreglo, int i){
        if(i == arreglo.length){
            return;
        }

        int valor = arreglo[i];
        System.out.println(valor);

        recorrerArreglo(arreglo,i+1);
    }
}