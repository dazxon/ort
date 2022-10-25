package ejercicio03;

public class Heladera extends Producto {

	private double capacidad;
	private boolean isFrost;
	
	
	public Heladera(String marca, String modelo, int nroSerie, double voltaje, boolean encendido, double precio,
			double capacidad, boolean isFrost) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.capacidad = capacidad;
		this.isFrost = isFrost;
	}
	
	
}
