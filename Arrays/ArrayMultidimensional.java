package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] bidemensional = new int[5][10];
        int[] unidimensional = new int [10];
        final int max = 100;

        for(int i = 0; i < bidemensional.length;i++){
            for(int j = 0; j < bidemensional[0].length; j++){
                bidemensional[i][j] = randomNumber(max); //asignacion de un numero random a la array bidimensional (la jota en todas las posiciones de i(su linea))
                System.out.print(bidemensional[i][j] + "\t"); //tabulacion entre los valores de las columnas
            }
            System.out.println(""); //salto de linea por cada fila
            System.out.println(bidemensional[1][2]); //comprobacion visual en consola
        }

        int[] copiaArray = Arrays.copyOf(unidimensional,20);//copyOf, metodo de la clase Arrays - se ha copiado de array unidimensional y ha ampliado su longitud. 

        for(int z : copiaArray){    //bucle for each para asignar valor random e imprimirlo en consola
            z = randomNumber(max);
            System.out.print(z + "\t");
        }

    }
    
    public static int randomNumber(int max){
        Random r = new Random();
        return r.nextInt(max - 1);
    }
}
