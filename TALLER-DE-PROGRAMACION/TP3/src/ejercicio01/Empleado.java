package ejercicio01;

public class Empleado {

	private String nombre;
	private int edad;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " +getNombre() + " gana: ";
	}
	
	public float calcularPago(){
		return 0.0f; 
	}
	
}
