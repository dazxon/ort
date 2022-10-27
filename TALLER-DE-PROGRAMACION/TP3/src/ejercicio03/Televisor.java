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

	private String isFrostString(boolean isSmart) {
		String resultado = "no";
		
		if (isSmart) {
			resultado = "Smart";
		}
		
		return resultado;
	}

	@Override
	public String toString() {
		return getSimple() + " " + isFrostString(isSmart) + " " + getMarca() + " " + this.dimension + 
				" pulgadas, modelo " + getModelo() + ": $" +getPrecio();
	}
	
	
	
	
}
