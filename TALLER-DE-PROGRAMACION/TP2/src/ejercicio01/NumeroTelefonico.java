package ejercicio01;

public class NumeroTelefonico {
	
	private String caracteristica;
	private String numeroDeAbonado;
	private String codigoDePais;
	private TipoDeLinea tipoDeLinea;
	private Persona persona;
	
	public NumeroTelefonico() {
		// TODO Auto-generated constructor stub
	}

	public NumeroTelefonico(String caracteristica, String numeroDeAbonado, String codigoDePais, TipoDeLinea tipoDeLinea) {

		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public String getValor() {
		
		return "(+" + getCodigoDePais() + ") "+ getCaracteristica() + getNumeroDeAbonado();
		
	}

	

	
	
	
	private String getCaracteristica() {
		return caracteristica;
	}

	private String getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	private String getCodigoDePais() {
		return codigoDePais;
	}

	protected TipoDeLinea getTipoDeLinea() {
		return tipoDeLinea;
	}
	
}
