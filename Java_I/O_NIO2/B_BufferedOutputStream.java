package Java_I.O_NIO2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class B_BufferedOutputStream {
	
	public static void main(String[] args) {
		
		//BufferedOutput stream permite trabajar con flujos de información mas grande
		
		byte[] buffer = new byte[1024*32]; //un buffer es un conjunto de datos, un flujo
		
		Arrays.fill(buffer,Byte.parseByte("1"));  //rellenamos el buffer mediante la clase envoltorio Byte
		
		BufferedOutputStream bOut = null; 
		
		try {
			bOut = new BufferedOutputStream(new FileOutputStream("buffered.dat")); //se tiene que montar sobre una instancia de FileOutputStream (hereda de esta)
			bOut.write(buffer);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(bOut != null)
				try {
					bOut.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
