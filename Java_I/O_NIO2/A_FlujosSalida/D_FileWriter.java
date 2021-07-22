package Java_I.O_NIO2.A_FlujosSalida;

import java.io.FileWriter;
import java.io.IOException;

public class D_FileWriter {
	
	public static void main(String[] args) {
		
		FileWriter fw = null;	//FileWriter es una clase que hereda de la clase abstracta Writer, escribe char a char
		String txt = "Un texto salvaje apareció"; 
		
		try {
			fw = new FileWriter("untextosalvaje.txt");
			for(char c: txt.toCharArray()) {
				fw.write(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null)
				try {
					fw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
