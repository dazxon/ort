package ejercicio03;

public class Lavarropas extends Producto {

	private double maxCarga;
	private boolean isAuto;
	
	
	public Lavarropas(String marca, String modelo, int nroSerie, double voltaje, boolean encendido, double precio,
			double maxCarga, boolean isAuto) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.maxCarga = maxCarga;
		this.isAuto = isAuto;
	}

	
}
