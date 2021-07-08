package Buscaminas;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    //Ajustes del juego
    private final static int size = 5;
    private final static int bombs = 1;

    //Mapa del usuario y del ordenador
    private static char[][] mapaUsuario = new char[size][size];
    private static char[][] mapaOrdenador = new char[size][size];

    //Posiciones
    private final static char unexplored = 'X';
    private final static char explored = 'O';
    private final static char bomb = 'B';

    //Scanner
    private static Scanner sc;
    public static void main(String[] args) {
        bombHasBeenPlanted();
        generateMap();
        seleccionPosicion();
    }

    private static void seleccionPosicion(){
        sc = new Scanner(System.in);
        System.out.println("Seleccione la fila:");
        int fila = sc.nextInt(); //selecciona el primer token que encuenta y selecciona el primer char
        System.out.println("Seleccione la columna:");
        int columna = sc.nextInt();
        checkCoordinates(fila, columna);
    }

    private static void checkCoordinates(int row, int column){
        if(mapaOrdenador[row][column] == unexplored){
            mapaUsuario[row][column] = explored;
            rerender(row, column);
            seleccionPosicion();
        }else if(mapaOrdenador[row][column] == bomb){
            mapaUsuario[row][column] = bomb;
            dyingRerender(row, column);
            System.out.println("HAS PERDIDO");
            System.exit(0);
        }   
    }

    private static void dyingRerender(int row, int column) {
        mapaUsuario[row][column] = bomb;
        for(int i = 0; i < mapaUsuario.length;i++){
            for(int j = 0; j < mapaUsuario[0].length; j++){
                System.out.print(mapaUsuario[i][j] + "\t");
            }
            System.out.println(""); //salto de linea por cada fila
        }
    }

    private static void rerender(int row, int column) {
        mapaUsuario[row][column] = explored;
        for(int i = 0; i < mapaUsuario.length;i++){
            for(int j = 0; j < mapaUsuario[0].length; j++){
                System.out.print(mapaUsuario[i][j] + "\t");
            }
            System.out.println(""); //salto de linea por cada fila
        }
    }

    private static void generateMap(){ //genera el mapa de usuario y lo imprime en consola

        for(int i = 0; i < mapaUsuario.length;i++){
            for(int j = 0; j < mapaUsuario[0].length; j++){
                mapaUsuario[i][j] = unexplored;
                System.out.print(mapaUsuario[i][j] + "\t");
            }
            System.out.println(""); 
        }
    }

    private static void bombHasBeenPlanted(){
        
        //Genera el mapa del ordenador en funcion de los ajustes globales

        for(int i = 0; i < mapaOrdenador.length;i++){
            for(int j = 0; j < mapaOrdenador[0].length; j++){
                mapaOrdenador[i][j] = unexplored;
            }
            for(int z = 0; z < bombs; z++){
                mapaOrdenador[randomNumber(size)][randomNumber(size)] = bomb;
            }
        }
    }

    private static int randomNumber(int max){
        Random r = new Random();
        return r.nextInt(max);
    } 
}
