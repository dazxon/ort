package ejercicio01;

public class SubContratado extends Empleado {

	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		// TODO Auto-generated constructor stub
	}

	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + calcularPago();
	}

	@Override
	public float calcularPago() {
		
		return precioHora*cantHoras;
	}
	
}
