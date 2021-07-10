package Stringbuilder;

public class Stringbuilder {

    public static void main(String[] args) {
        
        //el objetivo es invertir el palindromo(se leera igual) mediante el uso de la clase StringBuilder
        //si meramente se empleara una string se tendria que crear que crear una array de chars para posteriormente invertirlo en un for

        String palindromo = "anula la luna";

        StringBuilder sb = new StringBuilder(palindromo);

        sb.reverse();

        System.out.println(palindromo);

    }
    
}
