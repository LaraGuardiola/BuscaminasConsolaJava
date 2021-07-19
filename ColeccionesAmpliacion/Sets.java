package ColeccionesAmpliacion;

import java.util.HashSet;

import java.util.Set;




public class Sets {

    public static void main(String[] args) {
        Set<Persona> setPersonas = new HashSet<>();
        //Set<Integer> setNums2 = new TreeSet<>(); //para ordenar se tiene que implementar clase Comparable en Persona
        //Set<Integer> setNums3 = new LinkedHashSet<>();

        setPersonas.add(new Persona("Serj","Lara", 28));
        setPersonas.add(new Persona("Manolo","El del bombo", 67));
        setPersonas.add(new Persona("Don","Ramon", 55));
        setPersonas.add(new Persona("Freddy","mercury", 90));
        setPersonas.add(new Persona("Serj","Lara", 28)); //! lo acabo de duplicar? l17-l21
      
        for(Persona p : setPersonas){
            System.out.println(p);
        }

    }
    
}

