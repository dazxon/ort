package ejercicio05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vivienda vivienda = new Vivienda(new Direccion("Montañeses", "1234", "4", "C"));
		vivienda.addPersona("Arturo", "Roman", "53");
		vivienda.addPersona("Monica", "Gaztambide", "35");
		vivienda.addMueble("Mesa", "Madera", "Marron");
		vivienda.addMueble("Mesada", "Marmol", "Rojo");
		vivienda.addMueble("Perchero", "Metal", "Negro");
		vivienda.addMueble("Sillon", "Cuero", "Azul");
		
		Edificio edificio = new Edificio();
		edificio.addVivienda(vivienda);
		
		Vivienda vivienda2 = new Vivienda(new Direccion("Montañeses", "1234", "2", "B"));
		edificio.addVivienda(vivienda2);
		
		edificio.mostrarTodo();
		
		edificio.realizarMudanza("4", "C", "2", "B");
		
		edificio.mostrarTodo();
		
		
	}

}
