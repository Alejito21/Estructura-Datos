package co.edu.uniquindio.poo.EjercicioCollections12;

import java.text.Collator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TreeSet;

/**
 * Registro de nombres de estudiantes en un {@link TreeSet} ordenado
 * según las reglas del español colombiano (tildes, ñ).
 */
public class RegistroEstudiantes {
    private final TreeSet<String> nombres;

    /**
     * Crea un registro vacío con ordenamiento por {@link Collator} de {@code es-CO}.
     */
    public RegistroEstudiantes() {
        Collator collator = Collator.getInstance(Locale.forLanguageTag("es-CO"));
        nombres = new TreeSet<>(collator);
    }

    /**
     * Agrega un nombre al registro (sin espacios extremos). No admite duplicados.
     *
     * @param nombre nombre del estudiante
     * @return {@code true} si se agregó; {@code false} si ya existía
     */
    public boolean agregar(String nombre) {
        return nombres.add(nombre.trim());
    }

    /**
     * Indica si el nombre ya está registrado.
     *
     * @param nombre nombre a consultar
     * @return {@code true} si existe en el registro
     */
    public boolean existe(String nombre) {
        return nombres.contains(nombre);
    }

    /**
     * @return primer nombre en orden alfabético
     * @throws NoSuchElementException si el registro está vacío
     */
    public String primero() {
        if (nombres.isEmpty()) throw new NoSuchElementException("No hay estudiantes");
        return nombres.first();
    }

    /**
     * @return último nombre en orden alfabético
     * @throws NoSuchElementException si el registro está vacío
     */
    public String ultimo() {
        if (nombres.isEmpty()) throw new NoSuchElementException("No hay estudiantes");
        return nombres.last();
    }

    /**
     * @return cantidad de estudiantes registrados
     */
    public int cantidad() {
        return nombres.size();
    }

    /**
     * @return representación en cadena del conjunto de nombres
     */
    @Override
    public String toString() {
        return nombres.toString();
    }
}
