package ejercicio01;

public class Asalariado extends Empleado {
	
	private float sueldo;
	
	public Asalariado() {
		// TODO Auto-generated constructor stub
	}

	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		
		return super.toString() + calcularPago();
	}

	@Override
	public float calcularPago() {
		// devulve sueldo mensual
		return this.sueldo;
	}
	

	
	
}
