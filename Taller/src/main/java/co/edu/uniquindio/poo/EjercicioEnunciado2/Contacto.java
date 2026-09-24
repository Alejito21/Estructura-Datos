package co.edu.uniquindio.poo.EjercicioEnunciado2;

/**
 * Representa un contacto del directorio con nombre, teléfono y correo electrónico.
 * El orden natural se define por el nombre, sin distinguir mayúsculas/minúsculas.
 */
public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String telefono;
    private String email;

    /**
     * Crea un contacto con sus datos básicos.
     *
     * @param nombre   nombre del contacto
     * @param telefono número telefónico
     * @param email    correo electrónico
     */
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Compara este contacto con otro según el nombre (ignora mayúsculas).
     *
     * @param o contacto con el que se compara
     * @return valor negativo, cero o positivo según el orden lexicográfico del nombre
     */
    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareToIgnoreCase(o.getNombre());
    }

    /**
     * @return nombre del contacto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre del contacto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return teléfono del contacto
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono nuevo teléfono del contacto
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return correo electrónico del contacto
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email nuevo correo electrónico
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
