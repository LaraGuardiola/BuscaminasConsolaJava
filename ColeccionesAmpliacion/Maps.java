package ColeccionesAmpliacion;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Persona> mapPersonas = new HashMap<>(); //*actua como un diccionario, el primer parametro de map es la palabra clave que servira de indice y Persona el valor al que sera asociado
       
        //?al igual que Set, tiene los mismos tipos de map, HashMap, TreeMap, LinkedTreeMap

        mapPersonas.put("Noob webdev",new Persona("Serj","Lara", 28));
        mapPersonas.put("Futbolero",new Persona("Manolo","El del bombo", 67));
        mapPersonas.put("Doraemon",new Persona("Don","Ramon", 55));
        mapPersonas.put("Queen",new Persona("Freddy","mercury", 90));
        mapPersonas.put("Noob webdev",new Persona("Serj","Lara", 28)); //! con map si que se elimina el duplicado

        for(String clave: mapPersonas.keySet()){
            System.out.printf("%s: %s %s, %d\n",clave, mapPersonas.get(clave).getNombre(), mapPersonas.get(clave).getApellidos(), mapPersonas.get(clave).getEdad());
        }

    }
}
