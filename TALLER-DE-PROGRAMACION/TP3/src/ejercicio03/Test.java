package ejercicio03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa empresa = new Empresa();
		
		empresa.cargarProductos("Whirlpool", "H2745", null, 0, false, 14999);
		empresa.cargarProductos("Philips", "49PGFS", null, 0, false, 14370);
		empresa.cargarProductos("Drean", "CONCEPT 5.05", null, 0, false, 6799);
		
		empresa.mostrarProductos();
		
		
		
	}

}
