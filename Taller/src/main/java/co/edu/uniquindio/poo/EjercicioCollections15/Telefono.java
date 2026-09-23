package co.edu.uniquindio.poo.EjercicioCollections15;

import java.util.HashMap;
import java.util.Map;

public class Telefono {

    private Map<String, String> contactos;

    public Telefono() {
        this.contactos = new HashMap<>();
    }



    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, telefono);
        System.out.println("Se agrego el contacto " + nombre + "\n");
    }

    public void buscarContacto(String nombre) {
        contactos.get(nombre);
        System.out.println("El numero del contacto es: " + contactos.get(nombre) + "\n");
    }



    public Map<String, String> getContactos() {
        return contactos;
    }

    public void setContactos(Map<String, String> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "contactos=" + contactos +
                '}';
    }
}
