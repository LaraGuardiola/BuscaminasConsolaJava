package Comparacion;

public class Equivale {
    
    public static void main(String[] args) {

        Coche mercedes = new Coche(1998,300,"Mercedes");
        Coche ferrari = new Coche(2012,330,"Ferrari");
        mercedes = ferrari;
        System.out.println(mercedes.equals(ferrari) ? "hola" : "adios"); //ESTRUCTURA (BOOLEANO PON HOLA SI ES TRUE Y ADIOS SI ES FALSO)
    
        // ESTRUCTURA IF ELSE, ES EXACTAMENTE LO MISMO QUE LA ESTRUCTURA DE LA LINEA 10 TAMBIEN COMENTADA
        if(mercedes.equals(ferrari)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }

        // Pequeña prueba con la estructura de boolean ? true:false asignandolo a una variable, existencia en base a un bool llamado existo

        Boolean existo = false;
        String existencia = existo ? "Existes" : "No existes";
        System.out.println(existencia);


        System.out.println(mercedes.hashCode());

        //hashcode revela el codigo int que apunta a la memoria
        if(mercedes.hashCode()==ferrari.hashCode()){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }


        //toString() va implicito si se ponen en consola
        System.out.println(ferrari);
    }
}
