package ejercicio03;

public class Producto {

	private String marca;
	private String modelo;
	private int nroSerie;
	private double voltaje;
	private boolean encendido;
	private double precio;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String marca, String modelo, int nroSerie, double voltaje, boolean encendido, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroSerie = nroSerie;
		this.voltaje = voltaje;
		this.encendido = encendido;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", modelo=" + modelo + ", nroSerie=" + nroSerie + ", voltaje=" + voltaje
				+ ", encendido=" + encendido + ", precio=" + precio + "]";
	}
	
		
	
}
