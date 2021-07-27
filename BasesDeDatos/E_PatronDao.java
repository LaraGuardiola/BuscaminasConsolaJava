package BasesDeDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class E_PatronDao {
	
	static Scanner sc;

    //* REQUIERE DEL EJERCICIO C, D y E PARA FUNCIONAR Y ENTENDERSE
	
    public static void main(String[] args){
    	
        try {
        	
        	sc = new Scanner(System.in);
        	int opcion;
        	F_DaoPersonas dao = F_DaoPersonas.getInstance(); //hara que se cree una instancia de F_DaoPersonas cada vez que sea empleado en el switch
        	
        	do {
				listarMenu();
				opcion = Integer.parseInt(sc.nextLine());

				switch (opcion) {
				case 1:
					insertarPersona(dao);
					break;
				case 2:
					listarPersonas(dao);
					break;
				case 3:
					listarPorId(dao);
					break;
				case 4:
					eliminarPersona(dao);
					break;
				case 5:
					actualizarPersona(dao);
					break;
				}	

			} while (opcion != 0);
        	
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
    
    
    //menu para el switch
    
    private static void listarMenu(){

        System.out.println("SISTEMA DE GESTION DE TABLA PERSONAS");
        System.out.println("------------------------------------\n");
        System.out.println("0. Salir");
        System.out.println("1. Insertar persona");
        System.out.println("2. Listar todas las personas");
        System.out.println("3. Listar por ID");
        System.out.println("4. Eliminar a una persona");
        System.out.println("5. Actualizar una persona");

    }
    
    //función para recoger los datos de la persona e insertarlos
    
    private static void insertarPersona(F_DaoPersonas dao) {
    	
    
		System.out.println("Inserción de una nueva persona");
		System.out.print("Introduzca el nombre de la persona: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca los apellidos de la persona ");
		String apellidos = sc.nextLine();
		System.out.print("Introduzca la direccion: ");
		String direccion = sc.nextLine();
		System.out.print("Introduzca la ciudad: ");
		String ciudad = sc.nextLine();

		try {
			
		
			dao.insert(new D_Persona(nombre, apellidos, direccion, ciudad));
			
			System.out.println("Nuevo registro insertado");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("");

	}
    
    //funcion que muestra por consola un select * gracias a una funcion de F_DaoPersonas que retorna una array de D_Persona
    
    private static void listarPersonas(F_DaoPersonas dao) {
		
		List<D_Persona> lista = null;
		try {
			lista = dao.selectAll(); //selectAll() retorna una arrayList de Personas
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		if (lista != null) //mientras haya contenido, por cada elemento
			lista.forEach((e) -> {
				System.out.printf("%n %s %s %s %s\n", e.getId(), e.getNombre(), e.getApellidos(), e.getDireccion(),e.getCiudad());
			});
		else
			System.out.println("No hay empleados registrados en la base de datos");
		
		System.out.println("");	//!no consigo mostrar la id con auto_increment
		
	}
    
    //funcion que filtra por id gracias al metodo de la instancia dao encontrarPorClavePrimaria(id) y muestra en consola
    
    private static void listarPorId(F_DaoPersonas dao) {
		System.out.println("Búsqueda de un empleado");
		System.out.print("Introduzca el ID del empleado: ");
		int id = Integer.parseInt(sc.nextLine());
		
		D_Persona p = null;
		try {
			p = dao.encontrarPorClavePrimaria(id);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		if (p != null) {
			System.out.printf("%n %s %s %s %s\n", p.getId(), p.getNombre(), p.getApellidos(), p.getDireccion(),p.getCiudad());
		} else {
			System.out.println("No existe ningún registro con ese ID");
		}
		
		System.out.println("");
		
	}
    
    //funcion que elimina persona por id gracias al metodo delete(id) de F_DaoPersonas
    
    private static void eliminarPersona(F_DaoPersonas dao) {
    	
		System.out.println("Borrado de un empleado");
		System.out.print("Introduzca el ID del empleado: ");
		
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("¿Está usted seguro de eliminar dicho registro? (S/N)"); //pregunta de seguridad , despues entra en el bloque if y elimina el registro
		
		String opcion = sc.nextLine();
		
		if (opcion.equalsIgnoreCase("S")) {
			try {
				dao.delete(id);
				System.out.println("Registro eliminado");
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.println("");
		
	}
    
    //función que actualiza una persona por id gracias al metodo update(id) de F_DaoPersonas
    
    private static void actualizarPersona(F_DaoPersonas dao) {
		System.out.println("Update de una persona");
		System.out.print("Introduce el ID de la persona a actualizar: ");
		
		int id = Integer.parseInt(sc.nextLine());
		
		D_Persona e = null;
		
		try {
			e = dao.encontrarPorClavePrimaria(id);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		if (e == null) {
			System.out.println("La persona a modificar no esta en la base de datos");			
		} else {
			System.out.print("Introduce nombre de la persona: ");
			String nombre = sc.nextLine();
			System.out.print("Introduce los apellidos de la persona:  ");
			String apellidos = sc.nextLine();
			System.out.print("Introduzca direccion de la persona: ");
			String direccion = sc.nextLine();
			System.out.print("Introduzca ciudad de la persona: ");
			String ciudad = sc.nextLine();
			
			e.setNombre(nombre);
			e.setApellidos(apellidos);
			e.setDireccion(direccion);
			e.setCiudad(ciudad);
			
			try {
				dao.update(e);
				System.out.println("Registro actualizado");
			} catch (SQLException ex) {				
				ex.printStackTrace();
			}
			
		}
		
		System.out.println("");
		
	}
    
}
