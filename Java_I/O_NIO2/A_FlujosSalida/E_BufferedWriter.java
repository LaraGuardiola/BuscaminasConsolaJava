package Java_I.O_NIO2.A_FlujosSalida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class E_BufferedWriter {
	
	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		List<String> listaCadenas = Arrays.asList(new String[] {			//escribe cadenas enteras (un flujo de datos)
				"Si yo fuera rico","compraría una fragoneta","llena de malacaton"
		});
		
		try {
			bw = new BufferedWriter(new FileWriter("otrotexto.txt"));
			for(String s: listaCadenas) {
				bw.write(s);
				bw.newLine();//salto de linea
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null)
				try {
					bw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
