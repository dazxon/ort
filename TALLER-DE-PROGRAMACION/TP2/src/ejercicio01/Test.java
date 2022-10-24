package ejercicio01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona messi = new Persona("Lionel","Messi");
		messi.addNumero(new NumeroTelefonico("11","4111-2222","549",TipoDeLinea.CELULAR));
		messi.addNumero(new NumeroTelefonico("032","444-5678","068",TipoDeLinea.CELULAR));
		messi.addNumero(new NumeroTelefonico("", "4411-5472", "054", TipoDeLinea.FIJO));
		messi.addEmail(new Email("lio@messi.com"));

		messi.mostrarTodo();
		
		
		
	}

}
