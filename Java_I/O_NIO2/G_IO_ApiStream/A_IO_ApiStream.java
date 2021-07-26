package Java_I.O_NIO2.G_IO_ApiStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class A_IO_ApiStream {

	public static void main(String[] args) throws IOException{
		
		//La clase Files tiene muchos métodos que devuelve un Stream<T>
		//Se puede emplear de igual forma para filtrar, mapear, reducir, etc
		
		try(Stream<Path> stream =  Files.list(Paths.get(System.getProperty("user.home"),"Desktop", "Cursos"))) { //creo un Stream<Path> y aplico apiStream normalmente
			stream
				.map(String::valueOf) //(representacion en String del Path )
				.filter(path -> !path.startsWith("."))
				.sorted()
				.forEach(System.out::println);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
}
	