package co.edu.uniquindio.poo.EjercicioCollections3;

import java.util.Iterator;

public class MainContenedor {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Elemento e = new Elemento("A", 01);
        Elemento e2 = new Elemento("B", 02);
        Elemento e3 = new Elemento("C", 03);

        contenedor.agregar(e);
        contenedor.agregar(e2);
        contenedor.agregar(e3);

        Iterator<Elemento> iterator = new Contenedor().iterator();
        while (iterator.hasNext()) {
            Elemento elemento = iterator.next();
            System.out.println(elemento);
        }

        System.out.println("\n");
        for(Elemento elemento : contenedor) {
            System.out.println(elemento);
        }



    }
}
