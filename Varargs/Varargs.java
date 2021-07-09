package Varargs;

public class Varargs {

    private static int num = 2;
    public static void main(String[] args) {
        imprimeMensajes(num,"mensaje1");
        imprimeMensajes(num,"mensaje1","mensaje2");
        imprimeMensajes(num,"mensaje1","mensaje2", "mensaje3");
    }
    
    //los varargs se representan con Tipo... y representan una array, y por tanto pueden recibir uno o mas valores
    //si recibe mas de un parametro, los varargs siempre van al final

    private static void imprimeMensajes(int numero,String...mensajes){
        for(String mensaje: mensajes){
            System.out.println(numero + " " + mensaje);
        }
    }
}
