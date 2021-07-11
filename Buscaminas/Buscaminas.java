package Buscaminas;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    //Ajustes del juego
    private static int size;
    private static int bombs;

    //Mapa del usuario y del ordenador
    private static char[][] userMap;
    private static char[][] computerMap;

    //Posiciones
    private final static char UNEXPLORED = 'X';
    private final static char EXPLORED = 'O';
    private final static char BOMB = 'B';

    //Scanner
    private static Scanner sc;

    //Coordenadas y contador de bombas autogeneradas
    private static String fila, columna;
    private static int positionsExplored = 0;

    public static void main(String[] args) {
        intro();
        generateMap();
        checkPosition();
    }

    private static void intro(){
        sc = new Scanner(System.in);
        System.out.println("************ BUSCAMINAS ************\n");
        System.out.println("1. Escoge el tamaño de la parrilla de juego");
        size = sc.nextInt();
        System.out.println("2. Selecciona el número de bombas");
        bombs = sc.nextInt();
        bombHasBeenPlanted(size,bombs);
    }

    private static void bombHasBeenPlanted(int size, int bombs){
        computerMap = new char[size][size];
        //Genera el mapa del ordenador en funcion de los ajustes globales / primero declara todo como inexplorado y luego coloca bombas al azar
        System.out.println(size + bombs);
        for(int i = 0; i < computerMap.length;i++){
            for(int j = 0; j < computerMap[0].length; j++){
                computerMap[i][j] = UNEXPLORED;
            }
        }
        System.out.println(size + bombs);
        plantTheBomb();
    }

    private static void plantTheBomb(){
        System.out.println(size + bombs);
        for(int z = 0; z < bombs; z++){
            computerMap[randomNumber(size)][randomNumber(size)] = BOMB;
        }
    }

    private static void generateMap(){ //genera el mapa de usuario y lo imprime en consola
        userMap = new char[size][size];
        for(int i = 0; i < userMap.length;i++){
            for(int j = 0; j < userMap[0].length; j++){
                userMap[i][j] = UNEXPLORED;
                System.out.print(userMap[i][j] + "\t");
            }
            System.out.println("\n"); 
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
        int x = stringParser(row); //parseamos string a int
        int y = stringParser(column);
        if(computerMap[x][y] == UNEXPLORED){
            userMap[x][y] = EXPLORED;
            positionsExplored++;
            areYaWinningSon();
            rerender(x, y);
            checkPosition();
        }else if(computerMap[x][y] == BOMB){
            userMap[x][y] = BOMB;
            dyingRerender(x, y);
            System.out.printf("¡BOOM! HAS PERDIDO. Has explorado un total de %d posiciones. Suerte la próxima",positionsExplored);
            System.exit(0);
        }
    }

    //esta funcion stringParser es un overkill, ya que es posible parsear directamente en checkCoordinates(), pero me parece mas legible asi

    private static int stringParser(String str){
         int i = Integer.parseInt(str);
         return i;
    }

    private static void areYaWinningSon(){
        if(positionsExplored == Math.pow(size, 2) - bombs){
            System.out.println("Primera vez que ganas en tu vida al buscaminas");
            System.exit(0);
        }
    }

    private static void rerender(int row, int column) {
        userMap[row][column] = EXPLORED;
        for(int i = 0; i < userMap.length;i++){
            for(int j = 0; j < userMap[0].length; j++){
                System.out.print(userMap[i][j] + "\t");
            }
            System.out.println("\n"); //salto de linea por cada fila
        }
    }

    private static void dyingRerender(int row, int column) {
        userMap[row][column] = BOMB;
        for(int i = 0; i < userMap.length;i++){
            for(int j = 0; j < userMap[0].length; j++){
                System.out.print(userMap[i][j] + "\t");
            }
            System.out.println("\n"); //salto de linea por cada fila
        }
    }

    private static int randomNumber(int max){
        Random r = new Random();
        return r.nextInt(max);
    } 
}
