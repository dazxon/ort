package ejercicio03;

public class Lavarropa extends Producto {
	
	private double maxCarga;
	private boolean isAuto;
	
	
	
	public Lavarropa(String marca, String modelo, String nroSerie, double voltaje, boolean isEncendido, double precio,
			double maxCarga, boolean isAuto) {
		super(marca, modelo, nroSerie, voltaje, isEncendido, precio);
		this.maxCarga = maxCarga;
		this.isAuto = isAuto;
	}



	@Override
	public String toString() {
		return "Lavarropa []";
	}
	
	
	

}
