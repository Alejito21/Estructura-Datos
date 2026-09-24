package co.edu.uniquindio.poo.EjercicioCollections14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HistorialMensajes {
    private static final int CAPACIDAD = 10;
    private final ArrayDeque<String> mensajes = new ArrayDeque<>(CAPACIDAD);

    public void enviar(String mensaje) {
        mensajes.addLast(mensaje);
        if (mensajes.size() > CAPACIDAD) {
            mensajes.pollFirst();   // se descarta el más antiguo
        }
    }

    // Del más antiguo al más reciente
    public List<String> obtenerHistorial() {
        return new ArrayList<>(mensajes);
    }

    // Los n más recientes, empezando por el último enviado
    public List<String> ultimos(int n) {
        List<String> resultado = new ArrayList<>();
        Iterator<String> it = mensajes.descendingIterator();
        while (it.hasNext() && resultado.size() < n) {
            resultado.add(it.next());
        }
        return resultado;
    }

    public String ultimoEnviado() {
        return mensajes.peekLast();
    }

    public int cantidad() {
        return mensajes.size();
    }
}
