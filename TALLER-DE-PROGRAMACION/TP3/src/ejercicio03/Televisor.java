package ejercicio03;

public class Televisor extends Producto {

	private double dimension;
	private boolean isSmart;
	
	
	
	public Televisor(String marca, String modelo, String nroSerie, double voltaje, boolean isEncendido, double precio,
			double dimension, boolean isSmart) {
		super(marca, modelo, nroSerie, voltaje, isEncendido, precio);
		this.dimension = dimension;
		this.isSmart = isSmart;
	}
	
	
	
	
}
