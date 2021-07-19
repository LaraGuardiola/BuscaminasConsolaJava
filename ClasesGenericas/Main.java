package ClasesGenericas;

import java.util.Arrays;
import java.util.List;

public class Main {
    
    //se trata de una clase parametrizada sobre uno o mas tipos - a partir de java 5

    // DECLARACION DE UN OBJETO GENÉRICO
    public static void main(String[] args) {

        ClaseGenerica<String,String> pareja = new ClaseGenerica<String,String>("Hola","Mundo"); //aqui le meto 2 string pero podria poner cualquier tipo
        System.out.println(pareja.getCad1() + " " + pareja.getCad2());

        ClaseGenericaExtendida<Float> numeroInstanciado = new ClaseGenericaExtendida<>(8.3f); //*SE PUEDE USAR EL OPERADOR DIAMOND PARA MARCAR QUE ES GENERICA
        System.out.println(numeroInstanciado.getNumero() + (numeroInstanciado.getNumero() * 3));

        //*Uso de wildcard(comodin), aplicable a métodos

        List<Integer> listaNumerosInt = Arrays.asList(1,2,3,4,5);
        System.out.printf("La suma total es %f", sumaDeLista(listaNumerosInt));

       

    }

    //*Uso de wildcard(comodin), recibe cualquier lista mientras herede de Number , en el caso de arriba se envia una lista de ints pero se castean a double y son recibidos sin problema

    public static double sumaDeLista(List<? extends Number> list) { //*
        double s = 0.0;
        for (Number n : list){
            s += n.doubleValue();
        }
        return s;
    }   
    

    

}
