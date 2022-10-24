package ejercicio01;

import java.util.ArrayList;

public class Email {
	
	private String cuenta;
	private String dominio;
	private Persona persona;
	
	public Email(String email) {
		String[] aux = email.split("@");
		this.cuenta = aux[0];
		this.dominio = aux[1];
	}
	
	public String getValor() {

		return getCuenta() + "@" + getDominio();

	}

	
	private String getCuenta() {
		return cuenta;
	}

	private String getDominio() {
		return dominio;
	}
	

}
