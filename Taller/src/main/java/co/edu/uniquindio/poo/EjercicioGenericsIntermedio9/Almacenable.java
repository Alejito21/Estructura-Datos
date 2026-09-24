package co.edu.uniquindio.poo.EjercicioGenericsIntermedio9;

public interface Almacenable <T extends Comparable<T>>{
    public void guardar(T item);
    public T maximo();

}
