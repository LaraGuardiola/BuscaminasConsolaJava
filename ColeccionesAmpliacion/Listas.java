package ColeccionesAmpliacion;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    //*TIPOS DE COLECCIONES

    //LIST (lineal, posibilidad de orden, se pueden repetir elementos)
    //SET (no soporta duplicados, posibilidad de orden)
    //MAP (Estructura clave -> valor, posibilidad de orden)


    public static void main(String[] args) {

        List<Integer> listaNums = new ArrayList<>();
        
        listaNums.add(1);
        listaNums.add(2);
        listaNums.add(3);
        listaNums.add(4);

        System.out.println(listaNums.get(0) + listaNums.get(1)); //* output 3

        listaNums.set(1, 10); //*cambiamos de la lista el elemento de indice 1

        System.out.println(listaNums.get(0) + listaNums.get(1)); //* output 11


        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Serj","Lara", 685258542));
        listaPersonas.add(new Persona("Serj","Lara", 685258541));

        System.out.println(listaPersonas.get(0).getEdad());  //*output objeto tipo Persona { nombre='Serj', apellidos='Lara', telefono='685258542'}


    }
    
}
