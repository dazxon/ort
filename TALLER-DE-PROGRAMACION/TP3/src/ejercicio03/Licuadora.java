package ejercicio03;

public class Licuadora extends Producto {

	private double potencia;
	private int cantVelocidades;
	
	
	public Licuadora(String marca, String modelo, int nroSerie, double voltaje, boolean encendido, double precio,
			double potencia, int cantVelocidades) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}
	
	
}
