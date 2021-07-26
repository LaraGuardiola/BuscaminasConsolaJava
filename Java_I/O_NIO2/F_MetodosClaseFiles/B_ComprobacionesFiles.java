package Java_I.O_NIO2.F_MetodosClaseFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B_ComprobacionesFiles {

	public static void main(String[] args) {

		Path p = Paths.get("file.txt");
		
		//método notExists, exists, isRegularFile (un archivo normal sin ninguna info especial)

		if (Files.notExists(p)) {  //al principio no existe, despues se crea el fichero y empieza a evaluar el resto de ifs
			System.out.println("La ruta no existe");
			try {
				Files.createFile(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (Files.exists(p))
			System.out.println("La ruta sí existe");

		if (Files.notExists(p))
			System.out.println("La ruta no existe");

		if (Files.isRegularFile(p))
			System.out.println("El fichero " + p.toString() + " es regular");

		Path p2 = Paths.get("file.txt");

		//método isSameFile()
		
		try {
			if (Files.isSameFile(p, p2))
				System.out.println("Son el mismo fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
