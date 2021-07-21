package ApiStream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.*;

@SuppressWarnings("unused")

public class A_DeclaracionStream {

	public static void main(String[] args) {

		// Algunas formas de obtener un STREAM

		// A partir de una serie de elementos

		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// A partir de los elementos de una array

		IntStream stream2 = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 });

		// Un stream vacio

		Stream<String> stream3 = Stream.empty();

		// Un stream infinito

		Stream<Integer> stream4 = Stream.iterate(1, x -> x + 2);

		// Un stream "infinito" pero limitado

		Stream<Integer> stream5 = Stream.iterate(1, x -> x + 2).limit(100);

		// Un stream a partir de una colección

		Stream<String> stream6 = Arrays.asList("en", "un", "lugar", "de", "la", "mancha").parallelStream();

		// Un stream a través de un supplier<T>

		Stream<Integer> stream7 = Stream.generate(new Random()::nextInt);

	}

}
