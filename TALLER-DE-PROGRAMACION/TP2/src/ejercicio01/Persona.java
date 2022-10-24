package ejercicio01;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numeros;
	private ArrayList<Email> emails;
	
	public Persona(String nombre,String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeros = new ArrayList<>();
		this.emails = new ArrayList<>();
		
	}
	
	protected void addNumero(NumeroTelefonico numero) {
		
		this.numeros.add(numero);

	}
	
	protected void addEmail(Email email) {
		
		this.emails.add(email);

	}
	
	private String getNombreCompleto() {
		return this.apellido + ", " + this.nombre;
	}
	
	public void mostrarTodo() {
		
		System.out.println(getNombreCompleto());
		
		if (!numeros.isEmpty()) {
			
			if (numeros.size() == 1) {
				System.out.println("Telefono:");
			}else {
				System.out.println("Telefonos:");
			}
			
			for (NumeroTelefonico numero : this.numeros) {
				System.out.println(numero.getTipoDeLinea());
				System.out.println(numero.getValor());
			}
			
			
		}else {
			System.out.println("El usuario no tiene telefono");
		}
		
		if (!emails.isEmpty()) {
			
			if (emails.size() == 1) {
				System.out.println("Email:");
			}else {
				System.out.println("Emails:");
			}
			
			for (Email email : this.emails) {

				System.out.println(email.getValor());
			}
			
		}else {
			System.out.println("El usuario no tiene Email");
		}
	}
}
