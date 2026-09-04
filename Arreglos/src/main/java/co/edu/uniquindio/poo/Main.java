package co.edu.uniquindio.poo;


import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{12, 56, 200, 76};
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(777);
        listaNumeros.add(1);
        listaNumeros.add(23);
        listaNumeros.add(40);
        cabezaCola(listaNumeros);
        recorrerArreglo(num, 0);
    }

    public static void cabezaCola(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            int cabeza = (Integer)lista.getFirst();
            System.out.println(cabeza);
            List<Integer> cola = lista.subList(1, lista.size());
            cabezaCola(cola);
        }
    }

    public static void recorrerArreglo(int[] arreglo, int i) {
        if (i != arreglo.length) {
            int valor = arreglo[i];
            System.out.println(valor);
            recorrerArreglo(arreglo, i + 1);
        } else {
            System.out.println("Arreglo no encontrado");
        }
    }

}