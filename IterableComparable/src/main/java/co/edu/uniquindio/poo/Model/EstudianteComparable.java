package co.edu.uniquindio.poo.Model;

public class EstudianteComparable implements Comparable<EstudianteComparable> {
    private String nombre;
    private String identificacion;
    private int notaFinal;
    private String facultad;

    public EstudianteComparable(String nombre, String identificacion, int notaFinal, String facultad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.notaFinal = notaFinal;
        this.facultad = facultad;
    }




    @Override
    public int compareTo(EstudianteComparable e2) {
        return Integer.compare(this.notaFinal, e2.notaFinal);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + " " +
                        "ID: " + identificacion + " " +
                        "Nota: " + notaFinal + " " +
                        "Facultad: " + facultad + " ";

    }
}
