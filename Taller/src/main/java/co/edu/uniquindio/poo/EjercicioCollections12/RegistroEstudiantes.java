package co.edu.uniquindio.poo.EjercicioCollections12;

import java.text.Collator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class RegistroEstudiantes {
    private final TreeSet<String> nombres;

    public RegistroEstudiantes() {
        // Collator ordena según las reglas del español (tildes, ñ)
        Collator collator = Collator.getInstance(Locale.forLanguageTag("es-CO"));
        nombres = new TreeSet<>(collator);
    }

    public boolean agregar(String nombre) {
        return nombres.add(nombre.trim());   // false si ya existía
    }

    public boolean existe(String nombre) {
        return nombres.contains(nombre);
    }

    public String primero() {
        if (nombres.isEmpty()) throw new NoSuchElementException("No hay estudiantes");
        return nombres.first();
    }

    public String ultimo() {
        if (nombres.isEmpty()) throw new NoSuchElementException("No hay estudiantes");
        return nombres.last();
    }

    public int cantidad() {
        return nombres.size();
    }

    @Override
    public String toString() {
        return nombres.toString();
    }
}
