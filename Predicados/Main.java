package Predicados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
        
	     
        List<Persona> lista= new ArrayList<Persona>();
         
        Persona p1= new Persona ("pepe","perez",20);
        Persona p2= new Persona ("ana","perez",30);
        Persona p3= new Persona ("gema","sanchez",40);
        Persona p4= new Persona ("pedro","gomez",70);
         
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        //crea una condicion para filtrar dentro de un stream, son combinables entre si
        
        Predicate<Persona> predicado1= p->p.getEdad()>18;
        Predicate<Persona> predicado2= p->p.getEdad()<30;
        Predicate<Persona> predicado3= predicado1.and(predicado2);
        Predicate<Persona> predicado4= p->p.getEdad()>65;
        Predicate<Persona> predicado5=predicado4.or(predicado3).negate();
        
        lista
        	.stream()
        	.filter(predicado2)
        	.forEach((n) -> System.out.println(n.getApellidos()));
    }

}