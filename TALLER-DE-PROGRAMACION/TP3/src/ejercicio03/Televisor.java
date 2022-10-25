package ejercicio03;

public class Televisor extends Producto {

	private double pulgadas;
	private boolean smart;
	
	
	public Televisor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Televisor(String marca, String modelo, int nroSerie, double voltaje, boolean encendido, double precio, double pulgadas, boolean smart) {
		super(marca, modelo, nroSerie, voltaje, encendido, precio);
		this.pulgadas = pulgadas;
		this.smart = smart;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [pulgadas=" + pulgadas + ", smart=" + smart + ", toString()=" + super.toString() + "]";
	}
	
	
}
