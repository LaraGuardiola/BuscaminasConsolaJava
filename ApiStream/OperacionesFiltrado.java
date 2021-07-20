package ApiStream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionesFiltrado {
	
	public static void main(String[] args) {
		
		List<String> ciudades = Arrays.asList("Barcelona", "Madrid","Valencia", "Caceres", "Santiago", "Bilbao", "Palma","Barcelona");
		
		//Obtener un stream con todas las capitales que comiencen por B
		
		Stream<String> ciudadesPorB =
				ciudades
				.stream()
				.filter(c -> c.startsWith("B"));
		
		ciudadesPorB.forEach(System.out::println); //Igual que con los mapeos, si se hace alguna modificacion no se puede imprimir inmediatamente
		System.out.println("");
		
		//Obtener un stream que retire ciudades repetidas
		
		Stream<String> streamSinCiudadesRepetidas =
				ciudades
				.stream()
				.distinct();
		
		streamSinCiudadesRepetidas.forEach(System.out::println);
		System.out.println("");
				
		//Obtener un stream cuyo tamaño no es mayor que un numero determinado
		
		Stream<String> streamLimitado =
				ciudades
				.stream()
				.limit(5);
		
		streamLimitado.forEach(System.out::println);
		System.out.println("");
		
		//Obtener un stream que descarta un numero determinado de elementos iniciales
		
		Stream<String> streamSkip =
				ciudades
				.stream()
				.skip(3);
		
		streamSkip.forEach(System.out::println);
		System.out.println("");
				
	}

}
