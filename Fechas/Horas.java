package Fechas;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Horas {

    public static void main(String[] args) {

        //manejo de horas es similar al de fechas

        LocalTime hora = LocalTime.now();
        LocalTime minusHour = hora.minusHours(2);
        LocalTime plusHour = hora.plusHours(4);
        System.out.println("Hora actual: " + hora + " 2 horas menos: " + minusHour + " 4 horas mas: " + plusHour);

        //update de la hora mediante el metodo plus

        LocalTime siguienteHora = LocalTime.now().plus(1, ChronoUnit.HOURS); // añadimos 1 hora
        System.out.println("la hora actual es " + LocalTime.now());
        System.out.println("La siguiente hora es " + siguienteHora);
    }
}
