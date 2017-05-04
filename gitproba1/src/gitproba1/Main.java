package gitproba1;

public class Main {

	public static void main(String[] args) {
		PruebasDebug probas = new PruebasDebug();
		int factorial= probas.metodo1(-2);
		int factorial2=  probas.recursiva(4);
		System.out.println(factorial2);
		System.out.println(probas.toString());
		probas.setA(10);
		Producto producto1 = new Producto(14);
		producto1.prezoSenIva=17;
		System.out.println(producto1.getPrezoSenIva());
		System.out.println(producto1.getPrezoConIva());
	}
}
