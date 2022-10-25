package ejercicio03;

public class Test {

	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.addProducto("Whirlpool", "H2745", 555, 1.2, false, 14999);
		empresa.addProducto("Philips", "49PGFS", 0, 0, false, 14370);
		empresa.addProducto("Drean", "CONCEPT 5.05", 0, 0, false, 0);
		
		empresa.verProductos();
		
		
	}
	
}
