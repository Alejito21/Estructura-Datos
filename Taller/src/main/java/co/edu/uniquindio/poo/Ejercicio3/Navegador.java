package co.edu.uniquindio.poo.Ejercicio3;

import java.util.Stack;

public class Navegador {
    private Stack<Pagina> paginas;

    public Navegador() {
        this.paginas = new Stack<>();
    }


    public void abrirPagina(Pagina p) {
        paginas.push(p);
        System.out.println("Se abrio la pagina: "+ p + "\n");
    }

    public void cerrarPagina() {
        paginas.pop();
        System.out.println("Se cerro la pagina. \n");

    }

    public Stack<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(Stack<Pagina> paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Navegador{" +
                "paginas=" + paginas +
                '}';
    }
}
