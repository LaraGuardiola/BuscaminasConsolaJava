package heritage;
public class MiClase {
    public static void main(String[] args) {

        /*Segundo ejercicio - Asociacion entre clases sin requerir herencia */

        Provincia barcelona = new Provincia("Barcelona");
        barcelona.getMunicipios().add(new Municipio("Castefa", 80000));  /* Asociacion entre clases */
        System.out.println(barcelona);

        /*Primer ejercicio sobre encapsulacion, variables en private y metodos públicos para getters y setters*/

        /*SegundaClase s2 = new SegundaClase();
        s2.setEdad(18);
        s2.setNombre("Serj");
        System.out.println(s2.getEdad() + " " + s2.getNombre());*/
    }
}