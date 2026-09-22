package co.edu.uniquindio.poo.Ejercicio5;

public class MainTelefono {
    public static void main(String[] args) {
        Telefono mio = new Telefono();

        mio.agregarContacto("Catica", "301 280");
        mio.agregarContacto("Alejo", "322 233");
        mio.agregarContacto("Nico", "322 331");


        mio.buscarContacto("Nico");
    }
}
