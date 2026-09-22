package co.edu.uniquindio.poo.Ejercicio4;

public class MainBanco {
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
