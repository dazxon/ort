package ejercicio05;

import java.util.ArrayList;

public class Jornada {
	
	private ArrayList<Partido> partidos;
	private int fecha;//1,2...n

	public Jornada() {
		// Completar
	}
	
	public Jornada(int fecha) {
		this.partidos = new ArrayList<>();
		this.fecha = fecha;
	}
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
	}
	
	public void eliminarPartido(Partido partido) {
		// Completar
	}
	
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}