package co.edu.uniquindio.poo.EjercicioGenericsAvanzado12;

/**
 * Ejecuta un objeto que sea a la vez {@link Runnable} y {@link Comparable},
 * y lo compara con otro del mismo tipo (intersección de bounds genéricos).
 */
public class EjecucionComparador {
    /**
     * Ejecuta {@code generico1} con {@link Runnable#run()} y lo compara con {@code generico2}.
     *
     * @param <T>       tipo que implementa {@link Runnable} y {@link Comparable}
     * @param generico1 primer objeto (se ejecuta y se usa como base de comparación)
     * @param generico2 segundo objeto a comparar
     * @return resultado de {@code generico1.compareTo(generico2)}
     */
    public <T extends Runnable & Comparable<T>> int procesar(T generico1, T generico2) {
        generico1.run();
        return generico1.compareTo(generico2);
    }
}
