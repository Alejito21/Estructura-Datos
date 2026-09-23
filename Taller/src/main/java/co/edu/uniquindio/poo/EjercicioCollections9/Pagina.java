package co.edu.uniquindio.poo.EjercicioCollections9;

public class Pagina {
    private String url;
    private String nombrePagina;

    public Pagina(String url, String nombrePagina) {
        this.url = url;
        this.nombrePagina = nombrePagina;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombrePagina() {
        return nombrePagina;
    }

    public void setNombrePagina(String nombrePagina) {
        this.nombrePagina = nombrePagina;
    }

    @Override
    public String toString() {
        return "Pestaña{" +
                "url='" + url + '\'' +
                ", nombrePagina='" + nombrePagina + '\'' +
                '}';
    }
}
