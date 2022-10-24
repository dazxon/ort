package ejercicio05;

import java.util.ArrayList;

public class Edificio {
	
	private ArrayList<Vivienda> viviendas;
	
	
	public Edificio() {
		// TODO Auto-generated constructor stub
		this.viviendas = new ArrayList<>();
	}
	
	public void realizarMudanza(String pisoA,String departamentoA,String pisoB,String departamentoB) {
		
		int nroVivienda1 = getNroVivienda(pisoA, departamentoA);
		int nroVivienda2 = getNroVivienda(pisoB, departamentoB);
		
		//if (nroVivienda1 != -1 && nroVivienda2 != -1) {
			
			System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA " +nroVivienda1 + " A VIVIENDA " +nroVivienda2);
			System.out.println();
			
			Vivienda vivienda1 = viviendas.get(nroVivienda1-1);
			Vivienda vivienda2 = viviendas.get(nroVivienda2-1);
			
			vivienda2.addPersonas(vivienda1.supPersonas());
			vivienda2.addMuebles(vivienda1.supMuebles());
		//}
		
		
	}
	
	private int getNroVivienda(String piso,String departamento) {
		int resultado = -1;
		int pos = 0;
		int topeArray = viviendas.size();
		
		while (pos < topeArray && resultado == -1) {
			
			boolean pisoIgual = this.viviendas.get(pos).getPiso() == piso;
			boolean deptoIgual = this.viviendas.get(pos).getDepartamento() == departamento;
			
			if (deptoIgual && pisoIgual) {
				
				resultado = pos+1;
				
			}else {
				pos++;
			}
			
		}

		return resultado;
	}
	
	
	public void mostrarTodo() {
		
		if (!this.viviendas.isEmpty()) {
			
			for (Vivienda vivienda : viviendas) {
				
				int nroVivienda = this.viviendas.indexOf(vivienda)+1;
				System.out.println("Vivienda "+nroVivienda);
				vivienda.mostrarTodo();
				
				
			}
			
		}
			
	}
	
	
	
	public void addVivienda(Vivienda vivienda) {
		
		this.viviendas.add(vivienda);

	}
	
}
