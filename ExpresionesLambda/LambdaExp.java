package ExpresionesLambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExp {
    
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(3,1,2,4,5,6,7,8,9,10);

        //ordenando mediante expresion lambda (funciones que se autoinvocan como los IIFE de js) 
		//Los tipos de datos ¡no son obligatorios! Se infieren del contexto		
        //lista.sort((Integer n1, Integer n2) -> -(n1.compareTo(n2))); 
		
        lista.sort((n1, n2) -> (n2.compareTo(n1)));     //el metodo compareTo es el unico metodo de la interfaz Comparable, esto hace que sea una interfaz funcional (solo con un metodo)
		
		lista.forEach((n) -> System.out.println(n)); //otra expresion lambda en buble forEach
        lista.forEach(System.out::println);  //expresion lambda aun mas abreviada
		lista.forEach((n) -> {               //expresion lambda con mas de una linea de codigo
            n +=1;
            System.out.println(n);
        }); //
    }
}
