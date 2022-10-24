package ejercicio04;

import java.util.ArrayList;

public class Vivienda {
	
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	
	public Vivienda(Direccion direccion) {
		
		this.direccion = direccion;
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
		
	}
	
	protected void addPersona(String nombre,String apellido,String edad) {
		
		personas.add(new Persona(nombre, apellido, edad));

	}
	
	protected void addMueble(String nombre,String material,String color) {
		
		muebles.add(new Mueble(nombre, material, color));
		
	}
	
	protected void mostrarTodo() {
		
		System.out.println("Vivienda 1:");
		
		mostrarDireccion();
		
		mostrarPersonas();
		
		mostrarMuebles();

	}
	
	private void mostrarDireccion() {
		
		System.out.println("Direccion: " + getDireccion());
		
	}
	
	private void mostrarPersonas() {
		
		if (personas.size() <= 1) {
			System.out.println("Persona: ");
		}else {
			System.out.println("personas: ");
		}
		
				
		if (!personas.isEmpty()) {
			
			for (Persona persona : personas) {
				
				System.out.println(persona.getDatos());
				
			}
			
		}else {
			System.out.println("No hay personas");
		}
		
	}
	
	private void mostrarMuebles() {
		
		if (muebles.size() <= 1) {
			System.out.println("Mueble: ");
		}else {
			System.out.println("Muebles: ");
		}
		
				
		if (!muebles.isEmpty()) {
			
			for (Mueble mueble : muebles) {
				
				System.out.println(mueble.getDatos());
				
			}
			
		}else {
			System.out.println("No hay Muebles");
		}

	}
	
	
	public String getDireccion() {
		return this.direccion.direccionCompleta();
	}
}
