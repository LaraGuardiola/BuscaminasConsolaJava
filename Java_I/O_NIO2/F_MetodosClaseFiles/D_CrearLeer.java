package Java_I.O_NIO2.F_MetodosClaseFiles;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class D_CrearLeer {

	public static void main(String[] args) {
		
		try {
			
			Path p1 = Paths.get("loremipsum.txt");
			Path p2 = Paths.get("loremipsum2.txt");
			
			if(Files.exists(p1)) {
				
				BufferedWriter bw = Files.newBufferedWriter(p2,Charset.forName("UTF-8"));
				
				List<String> lineasFichero = Files.readAllLines(p1); //readAllLines() recoge las lineas de Strings en una lista
				
				lineasFichero.forEach((s) -> {
					try {
						bw.write(s); //escribimos sobre el segundo fichero, en base al contenido del primero
						bw.newLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(s);
				});
				
				bw.close();	
				
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
}
