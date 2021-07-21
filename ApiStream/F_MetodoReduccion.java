package ApiStream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Stream;

public class F_MetodoReduccion {
	
	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		
		int[] array = generarArrayAleatorio();
		
		System.out.println(Arrays.toString(array));
		
		//Sacar el máximo valor del array (o minimo con min())
		
		OptionalInt maximo = Arrays.stream(array).reduce(Integer::max); //lo reduce y toma el maximo valor del array
		
		int maximoMaxMethod = Arrays.stream(array).max().orElse(0); //lo mismo de arriba de otra forma (mejor en mi opinion)
		
		String mensajeMaximo = maximo.isPresent() //si hay o no hay valor -  true or false
				? "El valor maximo es " + maximo.getAsInt()
				: "No hay valor máximo";
		
		System.out.println(mensajeMaximo);
		System.out.println(maximoMaxMethod);
		
		//Reduccion sumando todos los elementos entre si
		
		int suma = Arrays.stream(array).reduce(0,(x,y) -> x+y); //.reduce(0(comienza a sumar desde 0),funcion asociativa))
		
		int sumaSumMethod = Arrays.stream(array).sum(); //same
		
		System.out.println(suma);
		System.out.println(sumaSumMethod);
		
		//Averiguar el numero de elementos en un array
		
		System.out.println(Arrays.stream(array).count()); //max, mix, count, son lo mismo que en MySQL
		
		//Ordenar elementos del array
		
		int[] arrayOrdenada = Arrays.stream(array).sorted().toArray();
		
		System.out.println(Arrays.toString(arrayOrdenada));
		
		//En el caso de las clases se puede aportar un comparator
		
		List<String> ciudades = Arrays.asList("Barcelona","Palma","Madrid","Valencia","Bilbao");
		
		ciudades
		.stream()
		.sorted((c1,c2) -> c1.compareTo(c2))
		.forEach(System.out::println);
	}

	private static int[] generarArrayAleatorio() {
		// TODO Auto-generated method stub
		return new Random().ints(100,0,1000).toArray(); //genera 100 ints que van del 0 al 1000, podria hacerse con doubles por ejemplo
	}

}
