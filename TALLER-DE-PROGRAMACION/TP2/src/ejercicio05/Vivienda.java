package ejercicio05;

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
		
		this.personas.add(new Persona(nombre, apellido, edad));

	}
	
	protected void addPersonas(ArrayList<Persona> personas) {
		
		this.personas.addAll(personas);
		
	}
	
	protected void addMueble(String nombre,String material,String color) {
		
		this.muebles.add(new Mueble(nombre, material, color));
		
	}
	
	protected void addMuebles(ArrayList<Mueble> muebles) {
		
		this.muebles.addAll(muebles);
		
	}
	
	protected ArrayList<Persona> supPersonas() {
		
		ArrayList<Persona> resultado = new ArrayList<>();
		
		for (Persona persona : personas) {
			resultado.add(persona);
		}
		
		this.personas.clear();
		
		return resultado;
		
	}
	
	protected ArrayList<Mueble> supMuebles() {
		
		ArrayList<Mueble> resultado = new ArrayList<>();
		
		for (Mueble mueble : muebles) {
			resultado.add(mueble);
		}
		
		this.muebles.clear();
		
		return resultado;
		
	}
	
	protected void mostrarTodo() {
		
		mostrarDireccion();
		
		mostrarPersonas();
		
		mostrarMuebles();
		
		System.out.println();

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
	
	public String getPiso() {
		return this.direccion.getPiso();
	}
	
	public String getDepartamento() {
		return this.direccion.getDepartamento();
	}
}
