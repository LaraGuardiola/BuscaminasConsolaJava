package Java_I.O_NIO2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class A_OutputStream {
	
	public static void main(String[] args) {
		
		//INTRO A PAQUETE JAVA I/O - FLUJOS DE SALIDA
		
		//OutputStream
		
		OutputStream fOut = null; // se tiene que declarar null porque OutputStream es una clase abstracta(no se puede instanciar)
		
		try {
			fOut = new FileOutputStream("primer.dat");
			for(int i=0; i < 100; i++) {
				fOut.write(i);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fOut !=null) {
				try {
					fOut.close();
					System.out.println("que ha pasado?");
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
