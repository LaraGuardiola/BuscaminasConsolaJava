package Java_I.O_NIO2.F_MetodosClaseFiles;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class C_CopiarBorrarMover {
	
	public static void main(String[] args) throws IOException{  //como en anteriores ejercicos de NIO, al trabajar con flujos de entrada y salida habra que capturar IOException
		
		
		//Creamos un path para el archivo que se va a crear (directamente en Cursos_JAVA al no especificar mas	
		
		Path p1 = Paths.get("fichero.txt");
		
		System.out.println(p1.toString());		
		
		//Creamos el archivo y pasamos a hacer la escritura
		
		BufferedWriter bw = Files.newBufferedWriter(p1); //creo un buffer de escritura con el metodo estatico de la clase Files
		bw.write("Probando la entrada de un flujo de bytes");
		bw.close();
			
		//Copiamos archivo .copy()
		
		Path pCopiado = Paths.get("fichero_copiado.txt");
		Files.copy(p1, pCopiado, StandardCopyOption.REPLACE_EXISTING); //.copy recibe 3 parametros, 1 path source,1 path a copiar, empleo del metodo de StandadCopyOption. REPLACE_EXISTING (COPIA TODAS LAS CARACTERISTICAS)
		
		//Mover archivos .move()
		
		Files.move(p1, Paths.get("Varargs", "fichero.txt")); //lo mueve a la carpeta Varargs (fichero.txt)
		
		//Eliminar archivos deleteIfExists()
		
		Files.deleteIfExists(Paths.get("fichero.txt")); //borra fichero.txt de Cursos_JAVA
		
		
	}

}
