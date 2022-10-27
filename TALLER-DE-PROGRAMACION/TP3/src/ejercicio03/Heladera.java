package ejercicio03;

public class Heladera extends Producto {
	
	private double capacidad;
	private boolean isNoFrost;
	
	
	
	public Heladera(String marca, String modelo, String nroSerie, double voltaje, boolean isEncendido, double precio,
			double capacidad, boolean isNoFrost) {
		super(marca, modelo, nroSerie, voltaje, isEncendido, precio);
		this.capacidad = capacidad;
		this.isNoFrost = isNoFrost;
	}
	
	private String isNoFrostString() {
		String resultado = "Frost";
		
		if (isNoFrost) {
			resultado = "no frost";
		}
		
		return resultado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getSimple() + " " + getMarca() + ", modelo " + getModelo() + ", " + isNoFrostString() + 
				", capacidad " + this.capacidad + " litros: " + "$" + getPrecio() ;
	}
	
	
	
}
