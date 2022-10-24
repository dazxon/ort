package ejercicio05;

public class Direccion {
	
	private String calle;
	private String altura;
	private String piso;
	private String departamento;
	
	
	public Direccion(String calle, String altura, String piso, String departamento) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	protected String direccionCompleta() {
		
		return this.calle + " " + this.altura + " " + this.piso + "° '" + this.departamento + "'";
		
	}

	protected String getPiso() {
		return piso;
	}

	protected String getDepartamento() {
		return departamento;
	}
	
	
	
	
	
	
}
