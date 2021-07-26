package Java_I.O_NIO2.G_IO_ApiStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class B_FindApiStream {

	public static void main(String[] args) {
		
		//find() permite encontrar los nodos hijo de los directorios, especificando en un int la profundidad máxima a la que buscar
		
		Path start = Paths.get(System.getProperty("user.home"),"Desktop", "Cursos");
		int maxDepth = 5;
		try (Stream<Path> stream = Files.find(start, maxDepth, (path, attr) ->  String.valueOf(path).endsWith(".txt"))) {
			stream
		        .sorted()
		        .map(String::valueOf)
		        .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
