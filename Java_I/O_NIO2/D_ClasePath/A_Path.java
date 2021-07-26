package Java_I.O_NIO2.D_ClasePath;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A_Path {
	
	public static void main(String[] args) {
		
		//Formas de obtener Paths
		
		Path p1 = Paths.get("Cursos_JAVA","Varargs.java");
		Path p2 = FileSystems.getDefault().getPath("Java","Varags.java");
		Path p3 = Paths.get(System.getProperty("user.home"),"Desktop","Cursos", "Cursos_java");
		
		
		System.out.println(p1.toAbsolutePath().toString()); //C:\Users\slara\Desktop\Cursos\JAVA\Cursos_JAVA\Varargs.java
		System.out.println(p2.toAbsolutePath().toString()); //C:\Users\slara\Desktop\Cursos\JAVA\Cursos_JAVA\Varargs.java
		System.out.println(p3.toAbsolutePath().toString()); //C:\Users\slara\Desktop\Cursos\Cursos_java
		
		//Métodos de path
		
		System.out.format("To string: %s%n",p1.toString()); //To string: Cursos_JAVA\Varargs.java
		System.out.format("Get FileName: %s%n",p1.getFileName()); //Get FileName: Varargs.java
		System.out.format("Get Name: %s%n",p1.getName(0));		//Get Name: Cursos_JAVA
		System.out.format("Get NameCount: %d%n",p1.getNameCount()); //Get NameCount: 2
		System.out.format("Subpath(0.3): %s%n",p1.subpath(0,2)); //Subpath(0.3): Cursos_JAVA\Varargs.java
		System.out.format("Get parent: %s%n",p1.getParent()); //Get parent: Cursos_JAVA
		System.out.format("getRoot: %s%n",p1.getRoot()); //getRoot: null
		
		//Normalizar una ruta
		
		
		Path p4 = Paths.get(System.getProperty("user.home"),"documents","java","..","..","temario.txt");
		System.out.println(p4.toString());
		
		Path normalized = p4.normalize(); //C:\Users\slara\documents\java\..\..\temario.txt
		System.out.println(normalized.toString()); //C:\Users\slara\temario.txt
		
		//Unir 2 paths
		
		Path basePath = Paths.get(System.getProperty("user.home"),"documents","java");
		Path archivo = Paths.get("ejemplo.txt");
		
		Path pathCompleto = basePath.resolve(archivo);
		System.out.println(pathCompleto.toString()); //C:\Users\slara\documents\java\ejemplo.txt
		
		//Comparar Paths
		
		Path p5 = Paths.get("Cursos_JAVA","Varargs.java");
		Path p6 = Paths.get("Cursos_JAVA","Varargs.java");
		
		if(p5.equals(p6)) {
			System.out.println("son iguales");
		}else {
			System.out.println("no lo son");
		}
		
	}
	
}
