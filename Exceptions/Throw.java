package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Throw {

    private static List<Integer> integers = new ArrayList<Integer>(); // lista de numeros int

    public static void addInteger(Integer value) throws IllegalArgumentException {
	if (integers.contains(value)) {
		throw new IllegalArgumentException("Integer already added."); //lanza explicitamente la excepcion
	}
	integers.add(value);
}

    public static void main(String[] args) {
	try {
		addInteger(1);
        addInteger(1); //se vuelve a añadir uno y se captura la excepcion
	} catch (IllegalArgumentException iae) {
		iae.printStackTrace();
	}
}       
    
}
