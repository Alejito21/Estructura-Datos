package co.edu.uniquindio.poo.EjercicioCollections6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Inventario de un supermercado basado en un {@link ArrayList} de {@link Producto}.
 * Permite agregar, eliminar, buscar y ordenar productos por precio o nombre.
 */
public class Supermercado {
    private ArrayList<Producto> inventario;

    /**
     * Crea un supermercado con inventario vacío.
     */
    public Supermercado() {
        this.inventario = new ArrayList<>();
    }

    /**
     * Agrega el producto al inventario si no existe y aumenta su stock en 1.
     *
     * @param producto producto a agregar o actualizar
     */
    public void agregarProducto(Producto producto) {
        if (!this.inventario.contains(producto)) {
            this.inventario.add(producto);
        }
        producto.setStock(producto.getStock() + 1);
    }

    /**
     * Elimina el producto del inventario. Advierte si aún tiene stock disponible.
     *
     * @param producto producto a eliminar
     */
    public void eliminarProducto(Producto producto) {
        if (producto.getStock() != 0) {
            System.out.println("No se puede eliminar todavia hay Stock disponible");
        }
        this.inventario.remove(producto);
    }

    /**
     * Busca e imprime el producto cuyo código coincide con el id dado.
     *
     * @param id código numérico a buscar
     */
    public void buscarProducto(int id) {
        for (Producto producto : inventario) {
            if (producto.getCodigo().equals(id)) {
                System.out.printf("Tu producto es: " + producto.getNombre());
            }
        }
        System.out.printf("No hay producto con el ID: " + id);
    }

    /**
     * Ordena el inventario por precio de mayor a menor.
     */
    public void ordenarProducto() {
        inventario.sort(Comparator.comparing(Producto::getPrecio).reversed());
    }

    /**
     * Ordena el inventario por nombre usando {@link ProductoComparator}.
     */
    public void ordenarNombre() {
        Collections.sort(inventario, new ProductoComparator());
    }

    /** @return lista de productos del inventario */
    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    /** @param inventario nuevo inventario */
    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    /**
     * @return representación en cadena del supermercado
     */
    @Override
    public String toString() {
        return "Supermercado{" +
                "inventario=" + inventario +
                '}';
    }
}
