package co.edu.uniquindio.poo.EjercicioGenericsBasico3;

public interface Contenedor <T>{
    public void agregar(T item);
    public T obtener(int indice);
}
