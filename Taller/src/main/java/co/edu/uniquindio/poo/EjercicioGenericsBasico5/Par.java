package co.edu.uniquindio.poo.EjercicioGenericsBasico5;

public class Par <T>{
    private T valor1;
    private T valor2;

    public Par(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public boolean comparar(T valor1, T valor2){
        return valor1.hashCode()==valor2.hashCode();
    }

    public T getValor1() {
        return valor1;
    }

    public void setValor1(T valor1) {
        this.valor1 = valor1;
    }

    public T getValor2() {
        return valor2;
    }

    public void setValor2(T valor2) {
        this.valor2 = valor2;
    }
}
