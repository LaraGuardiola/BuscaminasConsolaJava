package Exceptions;

public class Throws {

    //el planteamiento es saber que tipo de excepcion puede lanzar nuestro codigo y luego 
    //tratar la instancia de la excepcion que ha sido lanzada a main dentro de un try-catch

    //pueden ser lanzadas mas de una instancia de Exception
    
    public static void divideEntreCero() throws ArithmeticException {
        int num1 = 2;
        int num2 = 0;
        System.out.println(num1/num2);
    }
    
    public static void main(String[] args) {
        try {
            divideEntreCero();
        }catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
    }
}
