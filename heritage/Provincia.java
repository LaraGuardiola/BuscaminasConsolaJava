
package heritage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Provincia {
    private String nombre;
    private List<Municipio> municipios;


    public Provincia() {
    }

    public Provincia(String nombre){
        this.nombre = nombre;
        this.municipios = new ArrayList<>();
    }

    public Provincia(String nombre, List<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Municipio> getMunicipios() {
        return this.municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public Provincia nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Provincia municipios(List<Municipio> municipios) {
        setMunicipios(municipios);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Provincia)) {
            return false;
        }
        Provincia provincia = (Provincia) o;
        return Objects.equals(nombre, provincia.nombre) && Objects.equals(municipios, provincia.municipios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, municipios);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", municipios='" + getMunicipios() + "'" +
            "}";
    }


}
