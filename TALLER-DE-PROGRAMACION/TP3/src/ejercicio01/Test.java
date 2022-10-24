package ejercicio01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asalariado asalariado = new Asalariado("Jose", 30, 10000);
		SubContratado subContratado = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println(asalariado.toString());
		System.out.println(subContratado.toString());
	}

}
