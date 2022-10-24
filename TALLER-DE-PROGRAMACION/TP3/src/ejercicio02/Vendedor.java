package ejercicio02;
import ejercicio01.*;

public class Vendedor extends SubContratado {

	private float porcentaje;
	
	
	public Vendedor() {
		// TODO Auto-generated constructor stub
	}
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}
	
	private float getPorcentaje() {
		return this.porcentaje;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public float calcularPago() {
		
		return super.calcularPago() + super.calcularPago()*getPorcentaje()/100;
	}
	
}
