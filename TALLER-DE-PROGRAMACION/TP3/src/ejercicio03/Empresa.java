package ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

	private ArrayList<Producto> productos;

	
	public void addProducto(String marca, String modelo, int nroSerie, double voltaje, boolean encendido, double precio) {
		
		if (this.productos == null) {
			this.productos = new ArrayList<>();
		}
		
		System.out.println("Que tipo de producto desea agregar:");
		System.out.println("1) televisor");
		System.out.println("2) lavarropas");
		System.out.println("3) heladera");
		System.out.println("4) licuadora");

		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		
		while (valor < 1 && valor > 4) {
			
			System.out.println("valor incorrecto, vuelva a elegir");
			
			valor = input.nextInt();
		}
		
		Producto producto = null;
		
		switch (valor) {
		case 1:
			//teles
			System.out.println("Indique pulgadas");
			double pulgadas = input.nextDouble();
			
			System.out.println("El televisor es Smart? 1 = SI , 2 = NO");
			int respuesta = input.nextInt();
			boolean isSmart = respuesta == 1;
			
			producto = new Televisor(marca, modelo, nroSerie, voltaje, encendido, precio, pulgadas, isSmart);
			
			break;

		case 2:
			//lavarropas
			System.out.println("Indique carga maxima");
			double maxCarga = input.nextDouble();
			
			System.out.println("Es Automatico? 1 = si , 2 = no");
			int respuesta2 = input.nextInt();
			boolean isAuto = respuesta2 == 1;
			break;
			
		case 3:
			//heladeras
			
			break;
			
		case 4:
			//licuadoras
			
			break;
		}
		
		if (producto != null) {
			
			this.productos.add(producto);
			
		}
		
	}
	
	
	public void verProductos() {

		for (Producto producto : productos) {
			System.out.println(producto);
		}

	}
	
}
