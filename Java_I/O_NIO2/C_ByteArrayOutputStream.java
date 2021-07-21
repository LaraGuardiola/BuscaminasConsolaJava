package Java_I.O_NIO2;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class C_ByteArrayOutputStream {
	
	public static void main(String[] args) {
		
		byte[] buffer = new byte[1024*32];
		
		Arrays.fill(buffer,Byte.parseByte("1"));
		
		ByteArrayOutputStream baos = null;
		
		try {
			baos = new ByteArrayOutputStream();
			baos.write(buffer);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(baos != null)
				try {
					baos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
