package questão1e2;

public class Main {
	
	public static void main(String[] args) {
	Lampada lampada1 = new Lampada();
	Lampada lampada2 = new Lampada();
	
	lampada1.liga();
	System.out.println(lampada1.observa());
	lampada2.desliga();
	System.out.println(lampada2.observa());
	}
}
