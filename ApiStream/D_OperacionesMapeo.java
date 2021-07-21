package ApiStream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D_OperacionesMapeo {

	
	public static void main(String[] args) {
		
		List<String> capitales = Arrays.asList("Ja�n", "C�rdoba", "Sevilla", "Huelva", "C�diz", "M�laga", "Granada",
				"Almer�a");
		
		// Obtenemos todas las capitales en may�sculas
		Stream<String> capitalesEnMayus = 
				capitales
					.stream()
					.map(String::toUpperCase);
		
		capitalesEnMayus.forEach(System.out::println); //Si se modifica una lista como arriba, no es posible combinarlo con impresiones en consola
		
		// Obtenemos las longitudes en caracteres de todas las capitales
		IntStream longitudCapitales = 
				capitales
					.stream()
					.mapToInt(String::length);
		
		longitudCapitales.forEach(System.out::println);
	}
	

}
