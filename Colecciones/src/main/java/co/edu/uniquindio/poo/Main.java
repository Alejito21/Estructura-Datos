package co.edu.uniquindio.poo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testCollections();
        testArrays();
        ejercicios();

    }

    public static void testCollections(){
        // Definimos arreglo
        int [] numeros = {1,2,3,4,6,7};

        // Creamos una lista de numeros
        ArrayList listaNumeros = new ArrayList<>(Arrays.asList(1,30,2,190,3,510,4,40,5,300,12));
        System.out.println(listaNumeros);

        System.out.println(Collections.max(listaNumeros));
        System.out.println(Collections.min(listaNumeros));

        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

        Collections.shuffle(listaNumeros);
        System.out.println(listaNumeros);
    }

    public static void testArrays(){
        String [] nombres = {"Alejito",  "Nico", "Lau" , "Luni" , "Lore" , "Carlos"};

        System.out.println(Arrays.toString(nombres));

        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));

        int index = Arrays.binarySearch(nombres, "Luni");
        System.out.println(index);

        Arrays.fill(nombres, "Lau");
        System.out.println(Arrays.toString(nombres));
        System.out.println("\t");
    }

    public static void ejercicios(){
        //Ejercicio1
        System.out.println("1.Mostrar lista de nombres: \t");
        String [] nombres = {"Alejito",  "Nico", "Lau" , "Luni" , "Lore" , "Carlos"};
        String impreso = Arrays.toString(nombres);
        System.out.println(impreso);

        //Ejercicio2
        int [] numeros = {20,1,56,7,67,300,100};
        System.out.println("2.Mostrar array ordenado y posicion del valor buscado: \t");
        System.out.println("Array sin ordenar: " + Arrays.toString(numeros) + "\t");
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros) + "\t");

        int index = Arrays.binarySearch(numeros, 20);
        System.out.println("El indice el valor 20: " + index + "\t" );


        //Ejercicio3
        String [] equipos = {"Barca", "Milan", "Roma" , "Bayern"};
        System.out.println("3.Llenar un arreglo con un valor X: \t");
        System.out.println("El equipos de futbol: " + Arrays.toString(equipos) + "\t");
        Arrays.fill(equipos, "Barca");
        System.out.println("El equipo de futbol rellenados con Barca: " + Arrays.toString(equipos) + "\t");

        //Ejercicio4
        int [] num1 = {4,6,8,10};
        int [] num2 = {4,6,8,10};
        System.out.println("4.Comparar dos arreglos: \t");

        System.out.println("Son iguales los arreglos: " + Arrays.equals(num1, num2) + "\t");
        int [] num3 = {2,6,8,10};
        System.out.println("Son iguales los arreglos: " + Arrays.equals(num1, num3) + "\t");

        //Ejercicio5
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("5.Imprimir ciertos elemetnos de la lista por indice" + "\t");

        int[] primerosCinco = Arrays.copyOfRange(numeros, 0, 5);

        int[] delTresAlSiete = Arrays.copyOfRange(numeros, 3, 7);

        System.out.println("Array original: " + Arrays.toString(numeros) + "\t");
        System.out.println("Primeros 5 elementos: " + Arrays.toString(primerosCinco) + "\t");
        System.out.println("Elementos del índice 3 al 7: " + Arrays.toString(delTresAlSiete) + "\t");
    }


}