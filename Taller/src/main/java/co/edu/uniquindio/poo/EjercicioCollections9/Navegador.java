package co.edu.uniquindio.poo.EjercicioCollections9;

import java.util.Stack;

/**
 * Simula el historial de un navegador con una {@link Stack} de {@link Pagina}.
 * Abrir una página hace push; cerrarla hace pop (LIFO).
 */
public class Navegador {
    private Stack<Pagina> paginas;

    /**
     * Crea un navegador con historial vacío.
     */
    public Navegador() {
        this.paginas = new Stack<>();
    }

    /**
     * Abre una página y la coloca en la cima del historial.
     *
     * @param p página a abrir
     */
    public void abrirPagina(Pagina p) {
        paginas.push(p);
        System.out.println("Se abrio la pagina: " + p + "\n");
    }

    /**
     * Cierra la página actual (la de la cima del historial).
     */
    public void cerrarPagina() {
        paginas.pop();
        System.out.println("Se cerro la pagina. \n");
    }

    /** @return pila de páginas abiertas */
    public Stack<Pagina> getPaginas() {
        return paginas;
    }

    /** @param paginas nueva pila de páginas */
    public void setPaginas(Stack<Pagina> paginas) {
        this.paginas = paginas;
    }

    /**
     * @return representación en cadena del navegador
     */
    @Override
    public String toString() {
        return "Navegador{" +
                "paginas=" + paginas +
                '}';
    }
}
