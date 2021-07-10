package Buscaminas;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    //Ajustes del juego
    private final static int size = 5;
    private final static int bombs = 3;

    //Mapa del usuario y del ordenador
    private static char[][] userMap = new char[size][size];
    private static char[][] computerMap = new char[size][size];

    //Posiciones
    private final static char unexplored = 'X';
    private final static char explored = 'O';
    private final static char bomb = 'B';

    //Scanner
    private static Scanner sc;

    //Coordenadas y contador de bombas autogeneradas
    private static String fila, columna;
    private static int bombCounter = 0;
    private static int positionsExplored = 0;

    public static void main(String[] args) {
        intro();
        bombHasBeenPlanted();
        generateMap();
        checkPosition();
    }

    private static void intro(){
        System.out.println("************ BUSCAMINAS ************\n");
    }

    private static void bombHasBeenPlanted(){
        
        //Genera el mapa del ordenador en funcion de los ajustes globales / primero declara todo como inexplorado y luego coloca bombas al azar

        for(int i = 0; i < computerMap.length;i++){
            for(int j = 0; j < computerMap[0].length; j++){
                computerMap[i][j] = unexplored;
            }
        }
        plantTheBomb();
    }

    private static void plantTheBomb(){
        for(int z = 0; z < bombs; z++){
            computerMap[randomNumber(size)][randomNumber(size)] = bomb;
            bombCounter++;
        }
    }

    private static void generateMap(){ //genera el mapa de usuario y lo imprime en consola

        for(int i = 0; i < userMap.length;i++){
            for(int j = 0; j < userMap[0].length; j++){
                userMap[i][j] = unexplored;
                System.out.print(userMap[i][j] + "\t");
            }
            System.out.println(""); 
        }
    }

    private static void checkPosition(){
        doPertinentQuestions();
        checkCoordinates(fila, columna);
    }

    private static void doPertinentQuestions(){
        for(;;) {
            sc = new Scanner(System.in);
            System.out.println("\nSeleccione la fila:");
            fila = sc.next();
            System.out.println("\nSeleccione la columna:");
            columna = sc.next();
            if (Integer.parseInt(fila) >= 0 && Integer.parseInt(fila) < size && Integer.parseInt(columna) >= 0 && Integer.parseInt(columna) < size) {
                System.out.print("\nCoordenadas correctamente introducidas\n");
            }else{
                System.out.println("Selecciona un número entre el 0 y el " + size);
                continue;   //se salta la iteracion y vuelve a comenzar el bucle for vacio
            }
            break; //fuerzo a que se rompa el bucle, si todo ha ido correcto se ejecutara una unica vez
        }
    }

    private static void checkCoordinates(String row, String column){
        int x = stringParser(row);
        int y = stringParser(column);
        if(computerMap[x][y] == unexplored){
            userMap[x][y] = explored;
            positionsExplored++;
            areYaWinningSon();
            rerender(x, y);
            checkPosition();
        }else if(computerMap[x][y] == bomb){
            userMap[x][y] = bomb;
            dyingRerender(x, y);
            System.out.println("HAS PERDIDO");
            System.exit(0);
        }
    }

    //esta funcion stringParser es un overkill, ya que es posible parsear directamente en checkCoordinates(), pero me parece mas legible asi

    private static int stringParser(String str){
         int i = Integer.parseInt(str);
         return i;
    }

    private static void areYaWinningSon(){
        if(positionsExplored == Math.pow(size, 2) - bombCounter){
            System.out.println("Primera vez que ganas en tu vida al buscaminas");
            System.exit(0);
        }
    }

    private static void rerender(int row, int column) {
        userMap[row][column] = explored;
        for(int i = 0; i < userMap.length;i++){
            for(int j = 0; j < userMap[0].length; j++){
                System.out.print(userMap[i][j] + "\t");
            }
            System.out.println(""); //salto de linea por cada fila
        }
    }

    private static void dyingRerender(int row, int column) {
        userMap[row][column] = bomb;
        for(int i = 0; i < userMap.length;i++){
            for(int j = 0; j < userMap[0].length; j++){
                System.out.print(userMap[i][j] + "\t");
            }
            System.out.println(""); //salto de linea por cada fila
        }
    }

    private static int randomNumber(int max){
        Random r = new Random();
        return r.nextInt(max);
    } 
}
