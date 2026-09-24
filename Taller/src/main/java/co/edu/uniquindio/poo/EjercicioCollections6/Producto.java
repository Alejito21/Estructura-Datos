package co.edu.uniquindio.poo.EjercicioCollections6;

/**
 * Producto de un supermercado con código, nombre, precio y stock.
 * El orden natural se define por el precio (parte entera).
 */
public class Producto implements Comparable<Producto> {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Crea un producto con sus datos de inventario.
     *
     * @param codigo código identificador
     * @param nombre nombre del producto
     * @param precio precio unitario
     * @param stock  cantidad disponible
     */
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Compara productos por precio (convertido a entero).
     *
     * @param o2 producto con el que se compara
     * @return valor negativo, cero o positivo según el precio
     */
    @Override
    public int compareTo(Producto o2) {
        return Integer.compare((int) precio, (int) o2.getPrecio());
    }

    /** @return código del producto */
    public String getCodigo() {
        return codigo;
    }

    /** @param codigo nuevo código */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /** @return nombre del producto */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre nuevo nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return precio del producto */
    public double getPrecio() {
        return precio;
    }

    /** @param precio nuevo precio */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /** @return stock disponible */
    public int getStock() {
        return stock;
    }

    /** @param stock nuevo stock */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return representación en cadena del producto
     */
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
