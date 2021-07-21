package ApiStream;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ColeccionesAmpliacion.Persona;

@SuppressWarnings("unused")

public class H_ClaseCollector {
	
	public static void main(String[] args) {
		
		//Hasta este punto todos los streams han sido trabajados por consola (YA QUE SON INMUTABLES)
		//Si queremos que sean objetos mutables hay que guardar su resultado en una coleccion
		
		int[] arrayNumeros = generarArrayAleatorio();
		
		//La clase random incluye métodos que trabajan con streams y nos permiten crear uno de numeros aleatorios (ints)
		//A continuacion limitamos a 30 el numero de elementos que queremos (.limit(num))
		//Posteriormente indicamos que en lugar de un intStream(primitivo), y queremos un Stream<Integer> (boxed)
		//finalmente usamos la operacion .collect con el metodo estatico de la clase Collectors .toList() 
		//para que finalmente devuelva un List<Stream>
		
		
		Random r = new Random();
		
		List<Integer> numeros = r.ints(0,100).limit(30).boxed().collect(Collectors.toList());
		
		//COLLECTORS BÁSICOS
		
		//counting() - cuenta el total de elementos del stream
		
		long total = numeros
		.stream()
		.collect(Collectors.counting());
		
		System.out.println(total); //OUTPUT: 30
		
		
		//MaxBy
		
		Optional<Integer> maximo = numeros
				.stream()
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
		
		System.out.println(maximo);
		
		
		// SummingInt
		
		int suma = numeros
				.stream()
				.collect(Collectors.summingInt(v -> v.intValue()));
		
		System.out.println("La suma de todos los elementos de la colección es: " + suma);
		

		// AveragingInt
		
		double media = numeros
				.stream()
				.collect(Collectors.averagingInt(Integer::intValue));
		
		System.out.printf("La media de todos los elementos de la colección es %.2f %n ", media);
		

		// SummarazingInt
		
		IntSummaryStatistics res = numeros
				.stream()
				.collect(Collectors.summarizingInt(Integer::intValue)); //obtiene un resument Int al que luego se le pueden aplicar métodos como getMin (obtiene el minimo de todos los elementos)
		
		System.out.println("El mínimo de todos los elementos de la colección es: " + res.getMin());
		

		// Join de cadenas de caracteres
		
		String strNumeros = numeros
				.stream()
				.sorted()
				.map(Object::toString).collect(Collectors.joining(", "));
		
		System.out.println("Los números de la colección son " + strNumeros);
		
		
	}
	
	private static int[] generarArrayAleatorio() {
		// TODO Auto-generated method stub
		return new Random().ints(100,0,1000).toArray(); //genera 100 ints que van del 0 al 1000, podria hacerse con doubles por ejemplo
	}

}
