package ejercicio02;

public class Mascota {
	
	private String nombre;
	private String tipoDeAnimal;
	
	public Mascota() {
		// TODO Auto-generated constructor stub
	}
	
	public Mascota(String nombre,String tipoDeAnimal) {
		
		this.nombre = nombre;
		this.tipoDeAnimal = tipoDeAnimal;
		
	}
	
	protected String getValor() {
		
		return this.tipoDeAnimal + ", " + this.nombre;
		
	}
}
