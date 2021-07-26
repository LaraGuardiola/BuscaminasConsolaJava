package Concurrencia;

public class PrimoThread extends Thread {

	private long minimo;
	
	public static void main(String[] args) {
		
		PrimoThread numPrimo = new PrimoThread(12345678);
		System.out.println(numPrimo);
		
	}
	
	
	public PrimoThread(long minimo) {
		this.minimo = minimo;
	}
	
	@Override //la clase Thread implementa la interfaz Runnable con su m�todo run(), debido a eso es obligatorio hacer override
	public void run() {
		long n = minimo;
		while(!testPrimalidad(n)) {
			System.out.printf("(M�nimo: %d) %d no es primo %n", minimo, n);
			++n;
		}
		
		System.out.printf("El n�mero primo es %d %n", n);
	}
	
	/*
	 * M�todo que nos permite verificar si un n�mero es
	 * primo revisando si tiene divisores hasta n/2
	 * OJO es f�cil de implementar, pero ineficiente para 
	 * n�meros grandes
	 */
	
	public static boolean testPrimalidad(long n) { //metodo para averiguar los numeros primos (aquellos que solo son divisibles por si mismo y por 1)
		
		boolean continuar = true;
		boolean esPrimo = true;
		long divisor = 2;
		do {
			if (n % divisor == 0) {
				continuar = false;
				esPrimo = false;
			} else
				++divisor;			
				
		} while (continuar && divisor <= (n/2));
		
		return esPrimo;
	}

}