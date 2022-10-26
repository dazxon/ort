package ejercicio03;

public class Licuadora extends Producto {

	private double potencia;
	private int cantVelocidades;
	
	
	public Licuadora(String marca, String modelo, String nroSerie, double voltaje, boolean isEncendido, double precio,
			double potencia, int cantVelocidades) {
		super(marca, modelo, nroSerie, voltaje, isEncendido, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}
	
	
}
