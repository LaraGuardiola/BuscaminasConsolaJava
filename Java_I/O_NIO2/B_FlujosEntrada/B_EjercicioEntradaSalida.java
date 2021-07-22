package Java_I.O_NIO2.B_FlujosEntrada;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class B_EjercicioEntradaSalida {

	public static void main(String[] args) {
		
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		
		final int TAM = 1024 * 16; //16 kilobytes
		
		try {
			bin = new BufferedInputStream(new FileInputStream("minion.jpg"));
			bout = new BufferedOutputStream(new FileOutputStream("foto_copia.jpg"));
			//bin = new BufferedInputStream(new FileInputStream(args[0]));   de esta forma podriamos pasarle un argumento en vez de una cadena literal con el archivo
			//bout = new BufferedOutputStream(new FileOutputStream(args[1]));
			
			int cantidadBytes = 0;
			byte[] buffer = new byte[TAM];
			
			
			while((cantidadBytes = bin.read(buffer,0,TAM)) != -1) { //(buffer es la cantidad de informacion a leer, 0 la posicion, TAM el tamaño maximo, 16kb * iteracion
				bout.write(buffer,0,cantidadBytes); //se pone cantidadBytes y no TAM porque es la cantidad de informacion real leida en bytes, no la expectativa (TAM)
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {						//Cerramos ambos input y output streams
			if(bin != null)
				try {
					bin.close();
				}catch(IOException e) {    
					e.printStackTrace();
				}
			if(bout != null)
				try {
					bout.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}	
		
	}
	
}
