package ejercicio05;

public class Mueble {
	
	private String nombre;
	private String material;
	private String color;
	
	
	public Mueble(String nombre, String material, String color) {
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	protected String getDatos() {
		
		return this.nombre + " de " + this.material + " color " + this.color;
		
	}
	
}
