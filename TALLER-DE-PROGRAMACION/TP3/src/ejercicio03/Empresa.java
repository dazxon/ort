package ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	
	private ArrayList<Producto> productos;
	private ArrayList<Producto> carrito;
	
	public Empresa() {
		// TODO Auto-generated constructor stub
		this.productos = new ArrayList<>();
	}
	
	public void cargarProductos(String marca, String modelo, String nroSerie, double voltaje, boolean isEncendido, double precio) {
		
		Producto producto = new Producto(marca, modelo, nroSerie, voltaje, isEncendido, precio);
		
		int x = 1;
		
		Scanner input = new Scanner(System.in);
			
			do {
				
				mostrarOpciones();
				
				x = input.nextInt();
				
				if (x < 0 || x > 4) {
					
					System.out.println("Opcion incorrecta, vuelva a elegir");
					
				}
				
			} while (x < 0 || x > 4);
			
			switch (x) {
			case 1:
				double dimension = 0;
				
				do {
					
					System.out.println("De cuantas pulgadas?");
					dimension = input.nextDouble();
					
					if (!mayorCero(dimension)) {
						System.out.println("Dimension debe ser mayor a 0");
					}
					
					
				} while (!mayorCero(dimension));
				
				System.out.println("Es Smart? 1 = SI, cualquier otro numero = NO");
				
				boolean isSmart = input.nextInt() == 1;
				
				producto = new Televisor(marca, modelo, nroSerie, voltaje, isEncendido, precio, dimension, isSmart);
							
				break;
				
			case 2:
				
				double maxCarga = 0;
				
				do {
					
					System.out.println("Indique carga maxima");
					maxCarga = input.nextDouble();
					
					if (!mayorCero(maxCarga)) {
						System.out.println("Carga maxima debe ser mayor a 0");
					}
					
				} while (!mayorCero(maxCarga));
				
				System.out.println("Es automatico? 1 = SI, cualquier oto numero = NO");
				boolean isAuto = input.nextInt() == 1;
				
				producto = new Lavarropa(marca, modelo, nroSerie, voltaje, isEncendido, precio, maxCarga, isAuto);
				
				break;
				
			case 3:
				double capacidad = 0;
				
				do {
					
					System.out.println("Indique capacidad");
					capacidad = input.nextDouble();
					
					if (!mayorCero(capacidad)) {
						System.out.println("Capacidad debe ser mayor a 0");
					}
					
					
				} while (!mayorCero(capacidad));
				
				System.out.println("Es noFrost? 1 = SI, cualquier otro numero = NO");
				boolean isFrost = input.nextInt() == 1;
				
				producto = new Heladera(marca, modelo, nroSerie, voltaje, isEncendido, precio, capacidad, isFrost);
				
				break;
				
				
			case 4:
				
				double potencia = 0;
				
				do {
					
					System.out.println("Indique potencia");
					potencia = input.nextDouble();
					
					if (!mayorCero(potencia)) {
						System.out.println("Potencia debe ser mayor a 0");
					}
					
					
				} while (mayorCero(potencia));
				
				int cantVelocidades = 0;
				
				do {
					
					System.out.println("Indique cantidad de velocidades");
					cantVelocidades = input.nextInt();
							
					if (mayorCero(cantVelocidades)) {
						System.out.println("Cantidad de velocidades debe ser mayor a 0");
					}
					
				} while (mayorCero(cantVelocidades));
				
				producto = new Licuadora(marca, modelo, nroSerie, voltaje, isEncendido, precio, potencia, cantVelocidades);
				
				break;

			default:
				break;
			}
			
			this.productos.add(producto);
			
	}
	
	private void mostrarOpciones() {
		System.out.println("Articulos: "+this.productos.size());
		System.out.println("1) Televisor");
		System.out.println("2) Lavarropa");
		System.out.println("3) Heladera");
		System.out.println("4) Licuadora");
	}
	
	
	private boolean mayorCero(int valor) {	
		
		return valor > 0;
		
	}
	
	private boolean mayorCero(double valor) {

		return valor > 0;

	}
		
	public void mostrarProductos() {
		
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
		
	}
	
}
