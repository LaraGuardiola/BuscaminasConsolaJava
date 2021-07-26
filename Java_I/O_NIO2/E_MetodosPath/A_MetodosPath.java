package Java_I.O_NIO2.E_MetodosPath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class A_MetodosPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path p1 = Paths.get(System.getProperty("user.home"),"documents","java","temario.txt");
		Path p2 = Paths.get(System.getProperty("user.home"),"documents","java","temario.txt");
			
		//método equals y normalize, revisar api de java
		
		System.out.println(p2.normalize().toString());
		
		if(p1.equals(p2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("que esta pasando?");
		}

		if(p1.normalize().equals(p2)) {
			System.out.println("Son iguales tras normalizar");
		}
		
	}

}
