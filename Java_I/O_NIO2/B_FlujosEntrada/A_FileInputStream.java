package Java_I.O_NIO2.B_FlujosEntrada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A_FileInputStream {
	
	public static void main(String[] args) {
		
		FileInputStream fiw = null;
		
		try {
			fiw = new FileInputStream("primer.dat");
			int c;
			while((c = fiw.read()) != -1) { //-1 quiere decir que saldra del bucle cuando no queden cadenas que leer
				System.out.println(c); //imprime de 0 a 99 (pasa los byte a cadenas ;D)
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fiw != null)
				try {
					fiw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
