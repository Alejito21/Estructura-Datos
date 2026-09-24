package co.edu.uniquindio.poo.EjercicioGenericsIntermedio7;

/**
 * Utilidad con método genérico acotado a {@link Number} para sumar dos valores numéricos.
 */
public class Sumar {
    /**
     * Suma dos números genéricos convirtiéndolos a {@code double}.
     *
     * @param <T>    tipo numérico de ambos operandos
     * @param valor1 primer sumando
     * @param valor2 segundo sumando
     * @return resultado de la suma como {@code double}
     */
    public <T extends Number> double suma(T valor1, T valor2) {
        return valor1.doubleValue() + valor2.doubleValue();
    }
}
