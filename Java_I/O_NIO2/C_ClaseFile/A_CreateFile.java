package Java_I.O_NIO2.C_ClaseFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;



public class A_CreateFile {
	
	public static void main(String[] args) {
		
		try {
			File f = new File("./","nuevo.txt");
			
			//MANEJANDO LA LISTA COMO String[]
			
			//File f = new File("./") //hace referencia al directorio unicamente
			//List<String> lista = Arrays.asList(f.list()); //toma todos los elementos del directorio e imprime
			//lista.forEach(System.out::println);
			
			
			//MANEJANDO LA LISTA COMO File[]
			
			/*List<File> listaFiles = Arrays.asList(f.listFiles());
			listaFiles.forEach((file) -> {
				System.out.println(file.getName());
			});
			
			*listaFiles
			*.stream()
			*.map(File::getName)
			*.forEach(System.out::println);
			*/
			f.createNewFile();
			
			File temp = File.createTempFile("temporal", ".tmp");
			System.out.println(temp);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
