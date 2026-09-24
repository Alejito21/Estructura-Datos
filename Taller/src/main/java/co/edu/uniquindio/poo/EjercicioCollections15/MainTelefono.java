package co.edu.uniquindio.poo.EjercicioCollections15;

/**
 * Clase de demostración de {@link Telefono}: agrega contactos y busca uno por nombre.
 */
public class MainTelefono {
    /**
     * Punto de entrada de la demostración.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Telefono mio = new Telefono();

        mio.agregarContacto("Catica", "301 280");
        mio.agregarContacto("Alejo", "322 233");
        mio.agregarContacto("Nico", "322 331");

        mio.buscarContacto("Nico");
    }
}
