package Exceptions;

public class Excepcion {

    public static void main(String[] args) {
        
        //bloque try-catch para capturar excepciones (para comprobar excepciones ir a la api de java)
        //se pueden poner tantos catch como excepciones se quieran capturar
        //añadir finally es opcional

        try{
            int num1 = 2;
            int num2 = 0;
            System.out.println(num1/num2); 
        }catch(ArithmeticException e){
            e.printStackTrace(); // revela en consola la linea que lanza la excepcion
            System.err.println("El error es: " + e.getMessage()); //.err imprime igual en consola (como out) pero supuestamente con color en eclipse, en vscode esta igual
        }finally{
            System.out.println("Este saldra si o si");
        }

    }
    
}
