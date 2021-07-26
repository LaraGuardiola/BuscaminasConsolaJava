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
	
	@Override //la clase Thread implementa la interfaz Runnable con su método run(), debido a eso es obligatorio hacer override
	public void run() {
		long n = minimo;
		while(!testPrimalidad(n)) {
			System.out.printf("(Mínimo: %d) %d no es primo %n", minimo, n);
			++n;
		}
		
		System.out.printf("El número primo es %d %n", n);
	}
	
	/*
	 * Método que nos permite verificar si un número es
	 * primo revisando si tiene divisores hasta n/2
	 * OJO es fácil de implementar, pero ineficiente para 
	 * números grandes
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