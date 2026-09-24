package co.edu.uniquindio.poo.EjercicioCollections17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Agenda de eventos indexada por fecha con un {@link TreeMap}.
 * Permite agregar, eliminar, consultar el próximo evento y filtrar por rangos de fechas.
 */
public class AgendaEventos {
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final TreeMap<LocalDate, List<String>> eventos = new TreeMap<>();

    /**
     * Agrega un evento en la fecha indicada. Varios eventos pueden compartir la misma fecha.
     *
     * @param fecha  fecha del evento
     * @param evento descripción del evento
     */
    public void agregar(LocalDate fecha, String evento) {
        eventos.computeIfAbsent(fecha, f -> new ArrayList<>()).add(evento);
    }

    /**
     * Elimina un evento concreto de una fecha. Si la fecha queda sin eventos, se elimina la clave.
     *
     * @param fecha  fecha del evento
     * @param evento descripción a eliminar
     * @return {@code true} si se eliminó; {@code false} si no existía
     */
    public boolean eliminar(LocalDate fecha, String evento) {
        List<String> delDia = eventos.get(fecha);
        if (delDia == null) return false;
        boolean eliminado = delDia.remove(evento);
        if (delDia.isEmpty()) {
            eventos.remove(fecha);
        }
        return eliminado;
    }

    /**
     * Obtiene el evento más próximo a partir de una fecha (incluye ese mismo día).
     *
     * @param desde fecha de referencia
     * @return entrada fecha → lista de eventos, o {@code null} si no hay ninguno
     */
    public Map.Entry<LocalDate, List<String>> proximoEvento(LocalDate desde) {
        return eventos.ceilingEntry(desde);
    }

    /**
     * Obtiene el próximo evento a partir de la fecha actual.
     *
     * @return entrada fecha → lista de eventos, o {@code null} si no hay ninguno
     */
    public Map.Entry<LocalDate, List<String>> proximoEvento() {
        return proximoEvento(LocalDate.now());
    }

    /**
     * Devuelve los eventos dentro de un rango de fechas (ambos extremos inclusive).
     *
     * @param inicio fecha inicial
     * @param fin    fecha final
     * @return vista no modificable del submapa de eventos
     */
    public NavigableMap<LocalDate, List<String>> entre(LocalDate inicio, LocalDate fin) {
        return Collections.unmodifiableNavigableMap(eventos.subMap(inicio, true, fin, true));
    }

    /**
     * @return primera entrada de la agenda (fecha más antigua), o {@code null} si está vacía
     */
    public Map.Entry<LocalDate, List<String>> primero() {
        return eventos.firstEntry();
    }

    /**
     * @return última entrada de la agenda (fecha más reciente), o {@code null} si está vacía
     */
    public Map.Entry<LocalDate, List<String>> ultimo() {
        return eventos.lastEntry();
    }

    /**
     * Formatea una entrada de la agenda como {@code "dd/MM/yyyy -> [eventos]"}.
     *
     * @param e entrada a formatear
     * @return texto formateado, o {@code "Sin eventos"} si {@code e} es null
     */
    public static String formatear(Map.Entry<LocalDate, List<String>> e) {
        return (e == null) ? "Sin eventos" : e.getKey().format(FORMATO) + " -> " + e.getValue();
    }

    /**
     * Imprime todos los eventos de la agenda en consola.
     */
    public void mostrar() {
        for (Map.Entry<LocalDate, List<String>> e : eventos.entrySet()) {
            System.out.println("  " + formatear(e));
        }
    }
}
