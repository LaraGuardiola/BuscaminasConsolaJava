package Super;

public class ClaseDerivada extends ClaseBase{

    private String otroMensaje;
	
	public ClaseDerivada() {                //super requiere un constructor vacio en la clase padre.
		super("Desde la clase derivada");
	}
	
	public ClaseDerivada(String mensaje, String otro) {
		super(mensaje);
		this.otroMensaje = otro;
	}
	
	
	public void imprimir() {
		super.imprimir();
		//System.out.println("Saludo desde la clase derivada");
		System.out.println(otroMensaje);
	}
    
}
