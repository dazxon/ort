package ejercicio03;

public class Producto {
	
	private String marca;
	private String modelo;
	private String nroSerie;
	private double voltaje;
	private boolean isEncendido;
	private double precio;
	
	
	public Producto(String marca, String modelo, String nroSerie, double voltaje, boolean isEncendido, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nroSerie = nroSerie;
		this.voltaje = voltaje;
		this.isEncendido = isEncendido;
		this.precio = precio;
	}
	
	protected String getMarca() {
		return marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected String getNroSerie() {
		return nroSerie;
	}

	protected double getVoltaje() {
		return voltaje;
	}

	protected boolean isEncendido() {
		return isEncendido;
	}

	protected double getPrecio() {
		return precio;
	}
	
	protected String getSimple() {
		String resultado = getClass().getSimpleName();
		return resultado;
	}
	
	@Override
	public String toString() {
		return getSimple() + " " + marca + ", modelo " + modelo;
	}
	
	
}
