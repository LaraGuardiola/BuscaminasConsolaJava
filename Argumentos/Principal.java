package Argumentos;

import java.util.Arrays;

public class Principal {

    private Punto[] puntos;

    public Principal(Punto p1, Punto p2, Punto p3, Punto p4){  //instanciando cuatro Puntos, puedo hacer una instancia de Principal que me devuelva
        puntos = new Punto[]{p1,p2,p3,p4};                      //Una array de Puntos
    }


    public Principal(Punto[] puntos) {
        this.puntos = puntos;
    }

    public static void main(String[] args) {
        Punto miArray = new Punto(1,2);
        Punto miArray2 = new Punto(1,3);
        Punto miArray3 = new Punto(1,4);
        Punto miArray4 = new Punto(1,5);
        Principal arrayPuntos = new Principal(miArray, miArray2, miArray3, miArray4);
        System.out.println(arrayPuntos.toString());
    }

    @Override
	public String toString() {
		return "Rectangulo [puntos=" + Arrays.toString(puntos) + "]";
	}
    
}
