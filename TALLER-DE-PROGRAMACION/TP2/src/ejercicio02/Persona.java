package ejercicio02;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numeros;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String nombre,String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeros = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.mascotas = new ArrayList<>();
		
	}
	
	protected void addNumero(NumeroTelefonico numero) {
		
		this.numeros.add(numero);

	}
	
	protected void addEmail(Email email) {
		
		this.emails.add(email);

	}
	
	protected void addMascota(Mascota mascota) {
		
		this.mascotas.add(mascota);
		
	}
				
	private String getNombreCompleto() {
		return this.apellido + ", " + this.nombre;
	}
	
	
	
	public void mostrarTodo() {
		
		System.out.println(getNombreCompleto());
		
		mostrarTelefonos();
		
		mostrarEmails();
		
		mostrarMascotas();

	}
	
	private void mostrarTelefonos() {
		
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
	}
	
	private void mostrarEmails() {
		
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
	
	private void mostrarMascotas() {
		
		if (!mascotas.isEmpty()) {
			
			if (mascotas.size() == 1) {
				System.out.println("Mascota:");
			}else {
				System.out.println("Mascotas:");
			}
			
			for (Mascota mascota : this.mascotas) {

				System.out.println(mascota.getValor());
			}
			
		}else {
			System.out.println("El usuario no tiene mascota");
		}
	}
	
}
