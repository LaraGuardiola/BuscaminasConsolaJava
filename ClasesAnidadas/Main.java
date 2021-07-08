package ClasesAnidadas;

import ClasesAnidadas.ClaseExterna.Anidada;

public class Main {
    public static void main(String[] args) {
        Anidada x = new ClaseExterna(2).new Anidada(); //TODO forma de instanciar una clase anidada TODO
       
        System.out.println(x.getN());

    }
}
