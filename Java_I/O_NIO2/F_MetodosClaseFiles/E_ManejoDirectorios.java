package Java_I.O_NIO2.F_MetodosClaseFiles;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E_ManejoDirectorios {
	
	public static void main(String[] args) throws IOException {
		
		//en la api de java hay muchos mas métodos
		
		//CREAR DIRECTORIO
		
		//Files.createDirectory(Paths.get("directorio"));
		
		//CREAR STREAM DE DIRECTORIOS, CON POSIBILIDAD DE ITERAR SOBRE ELLOS
		
		DirectoryStream<Path> dsp =  Files.newDirectoryStream(Paths.get("")); //estoy sobre el base, de esta forma itero sobre todos los directorios (UN STREAM) del curso JAVA,
		
		for(Path p : dsp) {
			System.out.println(p);
		}
		
	}

}
