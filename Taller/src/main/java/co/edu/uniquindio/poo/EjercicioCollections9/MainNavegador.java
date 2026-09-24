package co.edu.uniquindio.poo.EjercicioCollections9;

/**
 * Clase de demostración del {@link Navegador}: abre y cierra páginas mostrando el historial.
 */
public class MainNavegador {

    /**
     * Punto de entrada de la demostración.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        Pagina chrome = new Pagina("chorme.com.co", "CHROME");
        Pagina firefox = new Pagina("firefox.com", "FIREFOX");
        Pagina operaGX = new Pagina("gx.latam", "GX");
        Pagina yahoo = new Pagina("Yahoo.com", "Yahoo");

        navegador.abrirPagina(chrome);
        navegador.abrirPagina(firefox);
        System.out.println(navegador);

        navegador.cerrarPagina();
        System.out.println(navegador);

        navegador.abrirPagina(operaGX);
        navegador.abrirPagina(yahoo);
        System.out.println(navegador);

        navegador.cerrarPagina();
        System.out.println(navegador);
    }
}
