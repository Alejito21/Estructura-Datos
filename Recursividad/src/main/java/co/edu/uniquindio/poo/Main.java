package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(calcularFactorial(5));
        int [] numeros = {2, 30, 40, 3};
        int [] numeros2 = {2, 3, 7, 9, 23, 30, 40, 56, 74};
        int total = sumarArregloDivideVenceras(numeros, 0, numeros.length - 1);
        System.out.println(total);
        System.out.println(buscarMayorDivideVenceras(numeros, 0, numeros.length - 1));
        System.out.println(busquedaBinaria(numeros2, 0, numeros2.length-1, 23));
    }

    // Calcular el factorial de un numero
    public static int calcularFactorial(int num) {
        if(num <= 1)
            return 1;

        return num * calcularFactorial(num - 1);
    }

    // Sumar un Arreglo con el metodo Divide y Venceras
    public static int sumarArregloDivideVenceras(int [] arreglo, int inicio, int fin){
        if(inicio == fin) {
            return arreglo[inicio];
        }
        int mitad = inicio + (fin-inicio)/2;
        int SumaIzq = sumarArregloDivideVenceras(arreglo, inicio, mitad);
        int SumaDer = sumarArregloDivideVenceras(arreglo, mitad +1, fin);

        return SumaIzq + SumaDer;
    }

    // Hallar el mayor numero en un Arreglo con el metodo Divide y Venceras
    public static int buscarMayorDivideVenceras(int [] arreglo, int inicio, int fin){
        if(inicio == fin) {
            return arreglo[inicio];
        }
        int mitad = inicio + (fin-inicio)/2;
        int mayorIzq = buscarMayorDivideVenceras(arreglo, inicio, mitad);
        int mayorDer = buscarMayorDivideVenceras(arreglo, mitad +1, fin);

        return Math.max(mayorIzq, mayorDer);
    }

    // Busqueda Binaria (Arreglo debe estar ordenado)
    public static boolean busquedaBinaria(int [] arreglo, int inicio, int fin , int numBuscado){
        if(inicio > fin){
            return false;
        }
        int mitad = inicio + (fin-inicio)/2;

        if(numBuscado == arreglo[mitad])
            return true;

        if(numBuscado < arreglo[mitad]){
            return busquedaBinaria(arreglo, inicio, mitad -1, numBuscado);
        }
        return busquedaBinaria(arreglo, mitad +1, fin, numBuscado);
    }
}