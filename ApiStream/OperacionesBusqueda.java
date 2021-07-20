package ApiStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OperacionesBusqueda {
	
	public static void main(String[] args) {
		
		List<String> ciudades = Arrays.asList("Barcelona", "Madrid","Valencia", "Caceres", "Santiago", "Bilbao", "Palma","Barcelona");
		
		
		//Buscar aquellos elementos que cumplan la condición que su cadena de caracteres sea mayor a 5
		
		boolean longitud = 
				ciudades
				.stream()
				.allMatch(c -> c.length() > 5); //reciben un predicado, puede ser declarado antes o a traves de una expresion lambda como ahora
		
		System.out.println(longitud); //false porque no todos los elementos tiene una length de mas de 5 chars
		
		//Buscar si alguno de los elementos cumple la condición 
		
		boolean hasLetter =
				ciudades
				.stream()
				.anyMatch(c -> c.endsWith("a")); //Si acaba en "a"
		
		System.out.println(hasLetter); //true
		
		//Buscar si ninguno de los elementos cumple la condicion
		
		boolean longitud2 = 
				ciudades
				.stream()
				.noneMatch(c -> c.length() > 15); //true, ninguna cadena de la lista es de 15 o mas caracteres
		
		System.out.println(longitud2);
		
		//Buscar un elemento cualquiera del stream. Recomendado para streams paralelos
		
		Optional<String> unaCiudad =
				ciudades
				.parallelStream()
				.findAny();
		
		System.out.println(unaCiudad.orElse("Ya no hay mas ciudades"));
		
		
		//Es posible añadir estos boolean a ternarios. EJEMPLO:
		
		String mensajeLongitud = (longitud)
				? "Todas las ciudades tienen 5 o mas caracteres"
				: "Hay alguna ciudad con menos de 5 caracteres";
		
		System.out.println(mensajeLongitud);
		
		//
		
	}
	
}
