package ejercicio04;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String edad;
	
	
	public Persona(String nombre, String apellido, String edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	protected String getDatos() {
		
		return "Nombre: " + this.nombre + " " + this.apellido + ", Edad: " + this.edad;
		
	}
	
	
}
