package co.edu.uniquindio.poo.EjercicioCollections9;

/**
 * Representa una página web con URL y nombre, usada por el navegador basado en pila.
 */
public class Pagina {
    private String url;
    private String nombrePagina;

    /**
     * Crea una página con su URL y nombre.
     *
     * @param url          dirección de la página
     * @param nombrePagina nombre descriptivo
     */
    public Pagina(String url, String nombrePagina) {
        this.url = url;
        this.nombrePagina = nombrePagina;
    }

    /** @return URL de la página */
    public String getUrl() {
        return url;
    }

    /** @param url nueva URL */
    public void setUrl(String url) {
        this.url = url;
    }

    /** @return nombre de la página */
    public String getNombrePagina() {
        return nombrePagina;
    }

    /** @param nombrePagina nuevo nombre */
    public void setNombrePagina(String nombrePagina) {
        this.nombrePagina = nombrePagina;
    }

    /**
     * @return representación en cadena de la página
     */
    @Override
    public String toString() {
        return "Pestaña{" +
                "url='" + url + '\'' +
                ", nombrePagina='" + nombrePagina + '\'' +
                '}';
    }
}
