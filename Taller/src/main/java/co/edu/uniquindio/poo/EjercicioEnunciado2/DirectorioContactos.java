package co.edu.uniquindio.poo.EjercicioEnunciado2;

import java.util.*;

/**
 * Directorio de contactos almacenados en una {@link LinkedList}.
 * Permite agregar, buscar por dominio de email y ordenar por teléfono o nombre.
 */
public class DirectorioContactos {
    private final LinkedList<Contacto> contactos = new LinkedList<>();

    /**
     * Agrega un contacto al final del directorio.
     *
     * @param c contacto a agregar
     */
    public void agregar(Contacto c) {
        contactos.add(c);
    }

    /**
     * Busca contactos cuyo email termine con el dominio indicado.
     * Recorre la lista únicamente con {@link Iterator}.
     *
     * @param dominio sufijo del email a buscar (por ejemplo {@code "@gmail.com"})
     * @return lista de contactos cuyo email termina en el dominio
     */
    public List<Contacto> buscarPorDominio(String dominio) {
        List<Contacto> resultado = new LinkedList<>();
        String sufijo = dominio.toLowerCase();

        Iterator<Contacto> it = contactos.iterator();
        while (it.hasNext()) {
            Contacto c = it.next();
            if (c.getEmail().toLowerCase().endsWith(sufijo)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    /**
     * Ordena los contactos por número de teléfono usando un {@link Comparator}.
     */
    public void ordenarPorTelefono() {
        Comparator<Contacto> porTelefono = Comparator.comparing(Contacto::getTelefono);
        contactos.sort(porTelefono);
    }

    /**
     * Ordena los contactos según su orden natural (por nombre).
     */
    public void ordenarPorNombre() {
        Collections.sort(contactos);
    }

    /**
     * Imprime todos los contactos del directorio en consola.
     */
    public void mostrar() {
        Iterator<Contacto> it = contactos.iterator();
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
