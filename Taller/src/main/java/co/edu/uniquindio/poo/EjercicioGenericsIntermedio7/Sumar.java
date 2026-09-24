package co.edu.uniquindio.poo.EjercicioGenericsIntermedio7;

public class Sumar {
    public <T extends Number> double suma(T valor1, T valor2){
        return valor1.doubleValue() + valor2.doubleValue();
    }
}
