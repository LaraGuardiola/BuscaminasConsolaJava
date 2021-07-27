package ClasesAnidadas;

import ClasesAnidadas.ClaseExterna.Anidada;

public class Main {
    public static void main(String[] args) {
        Anidada x = new ClaseExterna(2).new Anidada(); //TODO forma de instanciar una clase anidada TODO
        ClaseExterna e = new ClaseExterna(3);
        ClaseExterna.Anidada i = e.new Anidada();
        ClaseExterna.Anidada i2 = new ClaseExterna(4).new Anidada();
        i2.setN(15);
        x.setN(10);
        System.out.println(x.getN());

    }
}
