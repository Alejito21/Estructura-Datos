package co.edu.uniquindio.poo.EjercicioCollections14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Historial circular de mensajes con capacidad fija de 10.
 * Usa un {@link ArrayDeque}: al superar la capacidad se descarta el mensaje más antiguo.
 */
public class HistorialMensajes {
    private static final int CAPACIDAD = 10;
    private final ArrayDeque<String> mensajes = new ArrayDeque<>(CAPACIDAD);

    /**
     * Envía (agrega) un mensaje al historial. Si se supera la capacidad,
     * elimina el más antiguo.
     *
     * @param mensaje texto del mensaje
     */
    public void enviar(String mensaje) {
        mensajes.addLast(mensaje);
        if (mensajes.size() > CAPACIDAD) {
            mensajes.pollFirst();
        }
    }

    /**
     * Obtiene el historial completo del más antiguo al más reciente.
     *
     * @return lista copia de los mensajes
     */
    public List<String> obtenerHistorial() {
        return new ArrayList<>(mensajes);
    }

    /**
     * Obtiene los {@code n} mensajes más recientes, empezando por el último enviado.
     *
     * @param n cantidad de mensajes a recuperar
     * @return lista con hasta {@code n} mensajes (del más reciente hacia atrás)
     */
    public List<String> ultimos(int n) {
        List<String> resultado = new ArrayList<>();
        Iterator<String> it = mensajes.descendingIterator();
        while (it.hasNext() && resultado.size() < n) {
            resultado.add(it.next());
        }
        return resultado;
    }

    /**
     * @return último mensaje enviado, o {@code null} si no hay ninguno
     */
    public String ultimoEnviado() {
        return mensajes.peekLast();
    }

    /**
     * @return cantidad actual de mensajes en el historial
     */
    public int cantidad() {
        return mensajes.size();
    }
}
