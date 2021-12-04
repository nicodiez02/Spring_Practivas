package es.nico.ioc;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		
		//Creacion de objetos de tipo empleado
		
		Empleados empleado1 = new secretario_empleado();
		 /*Se puede ir creando diferentes clases que implementen la interfaz Empleados pero esto
		no es muy practico y puede pasar que necesitemos un objeto nuevo que no hayamos construido*/
		
		
		//Uso de los objetos
		System.out.println(empleado1.getTareas());
	}

}
