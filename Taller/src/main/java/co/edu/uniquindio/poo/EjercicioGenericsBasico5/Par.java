package co.edu.uniquindio.poo.EjercicioGenericsBasico5;

/**
 * Par genérico que almacena dos valores del mismo tipo y permite compararlos por hash.
 *
 * @param <T> tipo de ambos valores
 */
public class Par<T> {
    private T valor1;
    private T valor2;

    /**
     * Crea un par con dos valores.
     *
     * @param valor1 primer valor
     * @param valor2 segundo valor
     */
    public Par(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * Compara dos valores por igualdad de su {@code hashCode}.
     *
     * @param valor1 primer valor a comparar
     * @param valor2 segundo valor a comparar
     * @return {@code true} si ambos tienen el mismo hash
     */
    public boolean comparar(T valor1, T valor2) {
        return valor1.hashCode() == valor2.hashCode();
    }

    /** @return primer valor del par */
    public T getValor1() {
        return valor1;
    }

    /** @param valor1 nuevo primer valor */
    public void setValor1(T valor1) {
        this.valor1 = valor1;
    }

    /** @return segundo valor del par */
    public T getValor2() {
        return valor2;
    }

    /** @param valor2 nuevo segundo valor */
    public void setValor2(T valor2) {
        this.valor2 = valor2;
    }
}
