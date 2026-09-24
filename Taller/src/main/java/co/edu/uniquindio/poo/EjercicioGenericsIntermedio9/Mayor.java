package co.edu.uniquindio.poo.EjercicioGenericsIntermedio9;
import java.util.ArrayList;

public class Mayor <T extends Comparable<T>> implements Almacenable<T> {
    private ArrayList<T> lista = new ArrayList<>();

    @Override
    public void guardar(T item) {
        if (item == null) {
            System.out.println("El elemento no puede ser nulo");
        }
        lista.add(item);
    }

    @Override
    public T maximo() {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia");
        }
        T maximo = lista.get(0);
        for (T t : lista) {
            if (t.compareTo(maximo) > 0) {
                maximo = t;
            }
        }
        return maximo;
    }
}
