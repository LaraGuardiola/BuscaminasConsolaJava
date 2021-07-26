package Fechas;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Fechas {

    public static void main(String[] args) {
        
        //crea el objeto LocalDate que equivale a la fecha de hoy año/mes/dia y finalmente asigno en ints el año, mes y dia por separado

        LocalDate hoy = LocalDate.now();
        int mes = hoy.getMonthValue();
        int anio = hoy.getYear();
        int dia = hoy.getDayOfMonth();

        System.out.printf("Dia: %d Mes: %d Año: %d \n",dia, mes, anio);
        System.out.println(hoy);

        //creación del objeto fechaDeterminada con una fecha definida por los argumentos que recibe el metodo of(year, month, day)

        LocalDate fechaDeterminada = LocalDate.of(1992, 12, 26);

        System.out.println("Naciste el: " + fechaDeterminada);

        //Comparación de fechas

        LocalDate firstDate = LocalDate.of(2019, 8, 10);
        LocalDate secondDate = LocalDate.of(2019, 7, 1);

        if(firstDate.equals(secondDate)){
            System.out.printf("Dia: %d Mes: %d Año: %d son iguales a tu nacimiento \n",dia, mes, anio);
        }else{
            System.out.println("Son iguales!");
        }

        //eventos recurrentes - equivalencia de fechas

        LocalDate nacimiento = LocalDate.of(2021,07,10);
        MonthDay diaNacimiento = MonthDay.of(nacimiento.getMonth(), nacimiento.getDayOfMonth());
        MonthDay diaMesHoy = MonthDay.from(LocalDate.now());
        if(diaMesHoy.equals(diaNacimiento)){
            System.out.println(("¡Felicidades, es tu cumpleaños!"));
        }else{
            System.out.println("No es tu cumpleaños");
        }

        //eventos recurrentes - isAfter() isBefore()

        if(firstDate.isAfter(secondDate)){
            System.out.println(("firstDate es posterior a secondDate"));
        }else{
            System.out.println("firstDate no es posterior");
        }

        //empleo del metodo plus en LocalDate (unidades a añadir, ChronoUnit.la constante que quieras)

        LocalDate siguienteSemana = LocalDate.now().plus(1, ChronoUnit.WEEKS); // añadimos 1 semana
        System.out.println("la fecha actual es " + LocalDate.now());
        System.out.println("La siguiente semana es " + siguienteSemana);

        //Averiguar si un año es bisiesto

        if(hoy.isLeapYear()){
            System.out.println("es año bisiesto");
        }else{
            System.out.println("es un año 'normal'");
        }

        //Averiguar que periodo ha pasado entre 2 fechas empleando la clase estatica Period

        LocalDate nacimientoS = LocalDate.of(1992,12,26);
        LocalDate mismisimoDiaDeHoy = LocalDate.now();
        Period miEdad = Period.between(nacimientoS, mismisimoDiaDeHoy);
        System.out.println(miEdad.toTotalMonths()); //metodo toTotalMonths() que devuelve los meses totales transcurridos
    } 
}
