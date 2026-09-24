package co.edu.uniquindio.poo.EjercicioEnunciado5;

import java.text.Collator;
import java.text.Normalizer;
import java.util.*;

public class RegistroAsistentes {
    private final LinkedList<Asistente> asistentes = new LinkedList<>();

    public void agregar(Asistente a) {
        asistentes.add(a);
    }

    // Filtra por la letra inicial del nombre usando solo Iterator
    public List<Asistente> filtrarPorInicial(char letra) {
        List<Asistente> resultado = new LinkedList<>();
        String inicial = normalizar(String.valueOf(letra));

        Iterator<Asistente> it = asistentes.iterator();
        while (it.hasNext()) {
            Asistente a = it.next();
            if (normalizar(a.getNombre()).startsWith(inicial)) {
                resultado.add(a);
            }
        }
        return resultado;
    }

    // Orden alternativo: por nombre, con un Comparator
    public void ordenarPorNombre() {
        Collator collator = Collator.getInstance(Locale.forLanguageTag("es-CO"));
        Comparator<Asistente> porNombre = Comparator
                .comparing(Asistente::getNombre, collator)
                .thenComparing(Comparator.naturalOrder());   // desempate por documento
        asistentes.sort(porNombre);
    }

    // Orden natural: por documento
    public void ordenarPorDocumento() {
        Collections.sort(asistentes);
    }

    // Quita tildes y pasa a minúsculas: "Álvaro" -> "alvaro"
    private static String normalizar(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\n*M}", "")
                .toLowerCase();
    }

    public void mostrar() {
        Iterator<Asistente> it = asistentes.iterator();
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
