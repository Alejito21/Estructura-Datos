package co.edu.uniquindio.poo.EjercicioCollections17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AgendaEventos {
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Clave: fecha. Valor: eventos de ese día (puede haber varios)
    private final TreeMap<LocalDate, List<String>> eventos = new TreeMap<>();

    public void agregar(LocalDate fecha, String evento) {
        eventos.computeIfAbsent(fecha, f -> new ArrayList<>()).add(evento);
    }

    public boolean eliminar(LocalDate fecha, String evento) {
        List<String> delDia = eventos.get(fecha);
        if (delDia == null) return false;
        boolean eliminado = delDia.remove(evento);
        if (delDia.isEmpty()) {
            eventos.remove(fecha);   // no dejar fechas vacías
        }
        return eliminado;
    }

    // Evento más próximo a partir de una fecha (incluye ese mismo día)
    public Map.Entry<LocalDate, List<String>> proximoEvento(LocalDate desde) {
        return eventos.ceilingEntry(desde);
    }

    public Map.Entry<LocalDate, List<String>> proximoEvento() {
        return proximoEvento(LocalDate.now());
    }

    // Eventos dentro de un rango de fechas (ambos extremos incluidos)
    public NavigableMap<LocalDate, List<String>> entre(LocalDate inicio, LocalDate fin) {
        return Collections.unmodifiableNavigableMap(eventos.subMap(inicio, true, fin, true));
    }

    public Map.Entry<LocalDate, List<String>> primero() {
        return eventos.firstEntry();
    }

    public Map.Entry<LocalDate, List<String>> ultimo() {
        return eventos.lastEntry();
    }

    public static String formatear(Map.Entry<LocalDate, List<String>> e) {
        return (e == null) ? "Sin eventos" : e.getKey().format(FORMATO) + " -> " + e.getValue();
    }

    public void mostrar() {
        for (Map.Entry<LocalDate, List<String>> e : eventos.entrySet()) {
            System.out.println("  " + formatear(e));
        }
    }
}
