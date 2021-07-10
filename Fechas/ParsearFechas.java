package Fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParsearFechas {

    public static void main(String[] args) {

        //pasar cadenas a fechas parseando

        String diaDespuesDeHoy = "20171112";
		LocalDate formateada = LocalDate.parse(diaDespuesDeHoy, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.printf("La fecha generada de un String %s es %s %n", diaDespuesDeHoy, formateada);

		String viernes = "18/04/2014";
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");        //ofPattern() permite seleccionar la forma en la que mostrar la fecha
			LocalDate holiday = LocalDate.parse(viernes, formatter); //parseo seleccionando cadena y formateador
			System.out.printf("Cadena formateada correctamente %s, la fecha es %s%n", viernes, holiday);
		} catch (DateTimeParseException ex) {
			System.out.printf("%s no es parseable!%n", viernes);
			ex.printStackTrace();
		}

        //pasar fechas a cadenas

        LocalDateTime fechaLlegada = LocalDateTime.now();
		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm"); //para mirar patters buscar en documentación
			String landing = fechaLlegada.format(format);  //equivale a fecha llegada que es objeto tipo LocalDateTime afectada por el formateador de la linea anterior
			System.out.printf("Llegada a : %s ", landing);
		} catch (DateTimeException ex) {
			System.out.printf("%s no puede ser formateada!%n", fechaLlegada);
			ex.printStackTrace();
		}

    }
    
}
