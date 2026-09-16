package co.edu.uniquindio.poo.Model;

import java.util.Comparator;

public class EstudianteComparator implements Comparator<EstudianteComparable> {
    @Override
    public int compare(EstudianteComparable o1, EstudianteComparable o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
