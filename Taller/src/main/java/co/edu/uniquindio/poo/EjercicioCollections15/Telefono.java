package co.edu.uniquindio.poo.EjercicioCollections15;

import java.util.HashMap;
import java.util.Map;

/**
 * Agenda telefónica basada en un {@link HashMap} que asocia nombres con números.
 */
public class Telefono {

    private Map<String, String> contactos;

    /**
     * Crea una agenda vacía.
     */
    public Telefono() {
        this.contactos = new HashMap<>();
    }

    /**
     * Agrega o actualiza un contacto en la agenda.
     *
     * @param nombre   nombre del contacto (clave)
     * @param telefono número telefónico (valor)
     */
    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, telefono);
        System.out.println("Se agrego el contacto " + nombre + "\n");
    }

    /**
     * Busca e imprime el número asociado a un nombre.
     *
     * @param nombre nombre del contacto a buscar
     */
    public void buscarContacto(String nombre) {
        contactos.get(nombre);
        System.out.println("El numero del contacto es: " + contactos.get(nombre) + "\n");
    }

    /** @return mapa de contactos */
    public Map<String, String> getContactos() {
        return contactos;
    }

    /** @param contactos nuevo mapa de contactos */
    public void setContactos(Map<String, String> contactos) {
        this.contactos = contactos;
    }

    /**
     * @return representación en cadena de la agenda
     */
    @Override
    public String toString() {
        return "Telefono{" +
                "contactos=" + contactos +
                '}';
    }
}
