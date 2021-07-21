package ApiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class G_Map_FlapMap {
	
	
	public static void main(String[] args) {
		List<Persona> listaPersonas = Arrays.asList(
				new Persona("Serj","Lara",28),
				new Persona("Samuel","Lara",25),
				new Persona("Johnny","Silverhand",65),
				new Persona("Saburo","Arasaka",158));
		
		//MAP
		
		//mapeo 2 veces, 1 para mapear por nombre, y otra para transformar a mayusculas los nombres mapeados previamente, finalmente imprimo
		
		listaPersonas
		.stream() //Persona
		.map(p -> p.getNombre()) //String
		.map(s -> s.toUpperCase()) //String
		.forEach(System.out::println);
		
		//mapeo para multipicar la edad de las personas de la lista, despues imprimo
		
		listaPersonas
		.stream() //Persona
		.map(p -> p.getEdad() * 2) //Integer
		.forEach(System.out::println);
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//FLATMAP - sirve para operar sobre elementos bidimensionales, ya sean o no primitivos
		
		int[][] arrayBidimensional = {
				{1,2,3,4,5,6},
				{2,4,6,8,10,12}};
		
		Arrays
		.stream(arrayBidimensional)
		.flatMapToInt(x -> Arrays.stream(x))
		.map(IntUnaryOperator.identity()) //devuelve los mismos elementos
		.distinct()
		.forEach(System.out::println); //OUTPUT 1,2,3,4,5,6,8,12 (ha operado como si fuera una array normal, mapeo para obtener los valores, retiro los duplicados e imprimo
		
		
		List<Persona> listaPersonas2 = crearPersonasConViajes();
		
		
		listaPersonas2
		.stream() 							 //Persona
		.map(persona -> persona.getViajes()) //mapeo para obtener los viajes de las personas - retorna objetos tipo Viaje
		.flatMap(viajes -> viajes.stream())  //flatmap ya que se actua en una lista bidimensional y retorna en un stream los viajes
		.map(viaje -> viaje.getPais())		 //mapeo para obtener los paises a donde se ha viajado
		.distinct()							 //retiro duplicados, en este caso estonia
		.forEach(System.out::println);		 //imprimo
		
	}
	
	public static List<Persona> crearPersonasConViajes() {
		Persona p1 = new Persona("Serj","Lara",28);
		p1.getViajes().add(new Viaje("ESPAÑA"));
		p1.getViajes().add(new Viaje("FRANCIA"));
		p1.getViajes().add(new Viaje("ALEMANIA"));
		p1.getViajes().add(new Viaje("ITALIA"));
		
		Persona p2 = new Persona("Saburo","Arasaka",180);
		p2.getViajes().add(new Viaje("JAPON"));
		p2.getViajes().add(new Viaje("BRASIL"));
		p2.getViajes().add(new Viaje("ARGENTINA"));
		p2.getViajes().add(new Viaje("TURQUIA"));
		
		Persona p3 = new Persona("Edgar","Cortes",50);
		p3.getViajes().add(new Viaje("UK"));
		p3.getViajes().add(new Viaje("FINLANDIA"));
		p3.getViajes().add(new Viaje("ESTONIA"));
		p3.getViajes().add(new Viaje("ESTONIA"));
		
		return Arrays.asList(p1,p2,p3);
		
	}
	
	
	public static class Persona {

	    private String nombre;
	    private String apellidos;
	    private int edad;
	    private List<Viaje> viajes = new ArrayList<>();
	    

	    public Persona() {
	    }

	    public Persona(String nombre, String apellidos, int edad) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.edad = edad;
	    }


	    public String getNombre() {
	        return this.nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellidos() {
	        return this.apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public int getEdad() {
	        return this.edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    
	    public List<Viaje> getViajes(){
	    	return this.viajes;
	    }

	    public void setViaje(List<Viaje> viaje) {
	    	this.viajes = viaje;
	    }

	    @Override
	    public String toString() {
	        return "{" +
	            " nombre='" + getNombre() + "'" +
	            ", apellidos='" + getApellidos() + "'" +
	            ", edad='" + getEdad() + "'" +
	            "}";
	    }
	}
	
	
	public static class Viaje {
		
		private String pais;

		public Viaje(String pais) {
			this.pais = pais;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		@Override
		public String toString() {
			return "Viaje [pais=" + pais + "]";
		}
		
	}

}

