package String;

public class Cadenas {
    public static void main(String[] args) {
        String nombre = "Sergio";
        String apellido = "Lara";
        int edad = 28;
        //metodo format de String crea una estructura de la siguiente forma:plantilla poniendo %s para incrustar una cadena, y finalmente colocar esas mismas cadena
        // tambien se puede concatenar con .concat() ademas del operador +
       
        System.out.println(String.format("Hola, soy %s %s y tengo %s",nombre,apellido, Integer.toString(edad)) + " Viejo...".concat("loco"));
        System.out.printf("Hola, soy %s %s y tengo %s",nombre,apellido, Integer.toString(edad) + " Viejo...".concat("loco")); // es lo mismo que la linea anterior printf (format)

        //MÉTODOS DE COMPARACION DE CADENAS

        String nen = "En un lugar de Castefa";

        System.out.println(nen.endsWith("Castefaa")); //devuelve false
        System.out.println(nen.startsWith("En un")); //devuelve true
        System.out.println(nen.contains("lugar de")); //devuelve true
    }
}
