package co.edu.uniquindio.poo.EjercicioCollections6;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Supermercado {
    private ArrayList<Producto> inventario;

    public Supermercado() {
        this.inventario = new ArrayList<>();
    }


    public void agregarProducto(Producto producto) {
        if (!this.inventario.contains(producto)) {
            this.inventario.add(producto);
        }
        producto.setStock(producto.getStock() + 1);
    }

    public void eliminarProducto(Producto producto) {
        if(producto.getStock() !=0){
            System.out.println("No se puede eliminar todavia hay Stock disponible");
        }
        this.inventario.remove(producto);
    }

    public void buscarProducto(int id) {
        for (Producto producto : inventario) {
            if (producto.getCodigo().equals(id)){
                System.out.printf("Tu producto es: " +producto.getNombre());
            }
        }
        System.out.printf("No hay producto con el ID: " +id);
    }

    public void ordenarProducto() {
        inventario.sort(Comparator.comparing(Producto::getPrecio).reversed());
    }

    public void ordenarNombre(){
        Collections.sort(inventario, new ProductoComparator());
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "inventario=" + inventario +
                '}';
    }
}
