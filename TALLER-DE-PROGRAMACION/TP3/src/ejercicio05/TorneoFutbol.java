package ejercicio05;

import java.util.ArrayList;

public abstract class TorneoFutbol {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	
	public TorneoFutbol() {
		this.jornadas = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		this.jornadas.add(jornada);
	}
	
	public void eliminarJornada(Jornada jornada) {
		// Completar
	}
	
	public void agregarEquipo(Equipo equipo) {
		// Completar
		this.equipos.add(equipo);
	}
	
	public void eliminarEquipo(Equipo equipo) {
		// Completar
	}
	
	public void finalizarJornada(Jornada jornada) {
		if(jornadas.contains(jornada)) {
			
			// Completar
			Jornada jornadaAux = jornada;
			ArrayList<Partido> partidosAux = jornadaAux.getPartidos();
			
			for (Partido partido : partidosAux) {
				calcularPuntos(partido);
			}
			
			
		}
	}
	
	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		// Completar
		
		for (Equipo equipo : equipos) {
			System.out.println(equipo.getNombre() + ": "+equipo.getPuntos() + " puntos");
		}
		
		
		
	}
	
	public abstract String getTipo();
	
	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();
		
		if(golesEquipoLocal > golesEquipoVisitante)//Si gana el local
		{
			//Completar
			puntosLocal += puntajePartidoGanado();
			puntosVisitante += puntajePartidoPerdido();
			
			if (condicionMas4Goles(golesEquipoLocal, golesEquipoVisitante)) {
				
				puntosLocal += puntajeGanador4Goles();
				
			}
			
			if (condicionVallaInvicta(golesEquipoVisitante)) {
				
				puntosLocal += puntajeVallaInvicta();
				
			}
		}	
		if (golesEquipoLocal < golesEquipoVisitante){
			//Si gana el visitante

				// Completar
				puntosVisitante += puntajePartidoGanado();
				puntosLocal += puntajePartidoPerdido();
				
				if (condicionMas4Goles(golesEquipoVisitante, golesEquipoLocal)) {
					
					puntosVisitante += puntajeGanador4Goles();
					
				}
				
				if (condicionVallaInvicta(golesEquipoLocal)) {
					
					puntosVisitante += puntajeVallaInvicta();
					
				}
				
		}
			
			//si empatan
			if (golesEquipoLocal == golesEquipoVisitante) {
				
				puntosLocal += puntajePartidoEmpatado();
				puntosVisitante += puntajePartidoEmpatado();
				
				if (condicionEmpateMas3Goles(golesEquipoLocal, golesEquipoVisitante)) {
					
					puntosLocal += puntajeEmpateMas3Goles();
					puntosVisitante += puntajeEmpateMas3Goles();
					
				}
			}
			
			partido.getEquipoLocal().setPuntos(puntosLocal);
			partido.getEquipoVisitante().setPuntos(puntosVisitante);
		}

	// Completar
	
	
	public int puntajePartidoEmpatado() {
		return 1;
	}
	public abstract int puntajePartidoGanado();
	
	public abstract int puntajePartidoPerdido();
	
	public abstract int puntajeVallaInvicta();
	
	public abstract int puntajeGanador4Goles();
	
	public abstract int puntajeEmpateMas3Goles();
	
	
	//
	private boolean condicionVallaInvicta(int golPer) {
		
		return golPer == 0;
	}
	
	private boolean condicionMas4Goles(int golGan,int golPer) {
		
		return golGan - golPer >= 4;
	}
	
	private boolean condicionEmpateMas3Goles(int gol1,int gol2) {

		return gol1 >= 3 && gol2 >= 3 && gol1 == gol2;
	}
}