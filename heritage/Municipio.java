package heritage;

import java.util.Objects;

public class Municipio{

    private String nombre;
    private int numHabitantes;


    public Municipio() {
    }

    public Municipio(String nombre, int numHabitantes) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitantes() {
        return this.numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public Municipio nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Municipio numHabitantes(int numHabitantes) {
        setNumHabitantes(numHabitantes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Municipio)) {
            return false;
        }
        Municipio municipio = (Municipio) o;
        return Objects.equals(nombre, municipio.nombre) && numHabitantes == municipio.numHabitantes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numHabitantes);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numHabitantes='" + getNumHabitantes() + "'" +
            "}";
    }
}