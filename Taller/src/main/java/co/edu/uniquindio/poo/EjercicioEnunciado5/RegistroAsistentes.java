package co.edu.uniquindio.poo.EjercicioEnunciado5;

import java.text.Collator;
import java.text.Normalizer;
import java.util.*;

/**
 * Registro de asistentes almacenados en una LinkedList.
 * Permite filtrar por inicial del nombre, ordenar por nombre o documento, y mostrar el listado.
 */
public class RegistroAsistentes {
    private final LinkedList<Asistente> asistentes = new LinkedList<>();

    /**
     * Agrega un asistente al registro.
     *
     * @param a asistente a agregar
     */
    public void agregar(Asistente a) {
        asistentes.add(a);
    }

    /**
     * Filtra asistentes cuya inicial de nombre coincida con la letra dada.
     * Recorre la lista únicamente con {@link Iterator}. Normaliza tildes y mayúsculas.
     *
     * @param letra letra inicial a buscar
     * @return lista de asistentes cuyo nombre empieza por esa letra
     */
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

    /**
     * Ordena los asistentes por nombre según las reglas del español colombiano.
     * En caso de empate, usa el orden natural (documento).
     */
    public void ordenarPorNombre() {
        Collator collator = Collator.getInstance(Locale.forLanguageTag("es-CO"));
        Comparator<Asistente> porNombre = Comparator
                .comparing(Asistente::getNombre, collator)
                .thenComparing(Comparator.naturalOrder());
        asistentes.sort(porNombre);
    }

    /**
     * Ordena los asistentes por su orden natural (documento).
     */
    public void ordenarPorDocumento() {
        Collections.sort(asistentes);
    }

    /**
     * Quita tildes y pasa el texto a minúsculas (por ejemplo, {@code "Álvaro"} → {@code "alvaro"}).
     *
     * @param texto texto a normalizar
     * @return texto sin marcas diacríticas y en minúsculas
     */
    private static String normalizar(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\n*M}", "")
                .toLowerCase();
    }

    /**
     * Imprime todos los asistentes del registro en consola.
     */
    public void mostrar() {
        Iterator<Asistente> it = asistentes.iterator();
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
