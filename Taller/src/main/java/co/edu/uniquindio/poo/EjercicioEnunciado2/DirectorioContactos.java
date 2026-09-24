package co.edu.uniquindio.poo.EjercicioEnunciado2;

import java.util.*;

public class DirectorioContactos {
    private final LinkedList<Contacto> contactos = new LinkedList<>();

    public void agregar(Contacto c) {
        contactos.add(c);
    }

    // Búsqueda por dominio usando solo Iterator
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

    // Ordenar por teléfono con un Comparator
    public void ordenarPorTelefono() {
        Comparator<Contacto> porTelefono = Comparator.comparing(Contacto::getTelefono);
        contactos.sort(porTelefono);
    }

    // Ordenar por el orden natural (nombre)
    public void ordenarPorNombre() {
        Collections.sort(contactos);
    }

    public void mostrar() {
        Iterator<Contacto> it = contactos.iterator();
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
