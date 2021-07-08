package DataTypes;

public class TiposDeDatos {
    public static void main(String[] args) {

        /*
		 * LITERALES
		 */

        boolean resultado = true;
        //los caracteres se declaran con comillas simples ''
        char letraMayus = 'S';  

        byte by = 100;

        short sh = 1000;

        int in = 1000000;
        //valor 26 en decimal
        int decVal = 26;
        //valor 26 en hexadecimal
        int hexVal = 0x1a;
        //valor 26 en binario
        int binVal = 0b11010;

        String s = "Esto es una string";

        System.out.println(Integer.toString(hexVal)); //output: 26 ya que traduce el hexadecimal por decimal

        /*
		 * TIPOS DE DATOS NUMÉRICOS
		 */
		
		//TIPOS DE DATOS ENTEROS
		//[-128,127]
		byte b = 28;
		//[-32768,32767]
		short sho = 3458;
		//[-2^31,(2^31)-1]
		int i = 33456;
		//[-2^63,(2^63)-1]
		long l = 3_000_000_000L;
		
		
		//TIPOS DE DATOS REALES
		//Precisión simple
		float f = 0.25f;
		//Precisión doble
		double Pi = Math.PI;
		
		
		
		//OPERADORES NUMÉRICOS
		int x = 7;
		int y = 5;
		
		//Suma
		int z = x + y;
		System.out.print("Suma ");
		System.out.println(z);
		
		//Resta
		z = x - y;
		System.out.print("Resta ");
		System.out.println(z);
		
		//Multiplicación
		z = x * y;
		System.out.print("Multipliación ");		
		System.out.println(z);
		
		
		//División (entera)
		z = x / y;
		System.out.print("División entera ");		
		System.out.println(z);
		
		//División (no entera)
		double j = Pi/f;
		System.out.println("División con decimales ");
		System.out.println(j);
				
		//Resto
		z = x % y;
		System.out.print("Módulo o resto ");		
		System.out.println(z);
		
		//Incremento
		z = x++;
		System.out.print("Incremento ");		
		System.out.println(z);
		System.out.println(x);

        /*OPERADORES LOGICOS CONDICIONALES
        ! realiza la negacion del operando
        && operacion lógica condicional AND
        || operacion lógica condicional OR
        ?: Ternario, si el primer operador es verdadero, se devuelve el segundo valor, en otro caso, se devuelve el tercero */

        /*OPERADORES RELACIONALES
        == Devuelve verdadero si ambos valores son verdaderos
        != Valor inverso a == (gira la expresion, un boolean true pasa a false
        > Mayor que
        >= Mayor o igual que
        < Menor que
        <= Menor o igual que*/

        // CASTING permite hacer un cambio explicito de dato, siempre que sea compatible
        System.out.println(5/9); // 0
        System.out.println((double)5/9); //0.55
    }
}
