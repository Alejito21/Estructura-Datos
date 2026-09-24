package co.edu.uniquindio.poo.EjercicioGenericsAvanzado12;

public class EjecucionComparador {
    public <T extends Runnable & Comparable<T>> int procesar(T generico1, T generico2){
        generico1.run();
        return generico1.compareTo(generico2);
    }
}
