package co.edu.uniquindio.poo.EjercicioCollections7;

/**
 * Clase de demostración de {@link TurnosBanco}: agrega clientes, atiende turnos
 * e inserta un cliente con prioridad.
 */
public class MainBanco {
    /**
     * Punto de entrada de la demostración.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        TurnosBanco tb = new TurnosBanco();

        tb.agregarACola("Catica");
        tb.agregarACola("Nico");
        tb.agregarACola("Alejo");
        tb.agregarACola("Cristiano");
        tb.agregarACola("Messi");
        tb.atenderCliente();
        tb.atenderCliente();
        tb.mostarCola();
        tb.agregarPioridad("Raphina");
        tb.mostarCola();
        tb.atenderCliente();
    }
}
