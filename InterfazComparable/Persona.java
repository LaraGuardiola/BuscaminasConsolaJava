package InterfazComparable;


import java.util.Comparator;



public class Persona implements Comparator<Persona>{ //? Por qué no se implementa Comparable. teoria: no tiene variables que sigan el orden natural como los numeros? 

    private String nombre;
    private String apellidos;
    private String edad;
    

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellidos='" + getApellidos() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }

  

    @Override
    public int compare(Persona o1, Persona o2) {
        // TODO Auto-generated method stub
        return 0;
    }
}