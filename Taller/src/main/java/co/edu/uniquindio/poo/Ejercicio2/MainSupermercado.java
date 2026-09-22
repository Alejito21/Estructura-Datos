package co.edu.uniquindio.poo.Ejercicio2;

public class MainSupermercado {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        Producto uno = new Producto("01", "Fab", 25000, 10);
        Producto dos = new Producto("02", "Axion", 10000, 18);
        Producto tres = new Producto("03", "Listerine", 4000, 30);
        Producto quatro = new Producto("04", "Quatro", 5000, 20);

        supermercado.agregarProducto(uno);
        supermercado.agregarProducto(dos);
        supermercado.agregarProducto(tres);
        supermercado.agregarProducto(quatro);

        supermercado.buscarProducto(05);
        supermercado.ordenarNombre();
        System.out.println(supermercado);
    }
}
