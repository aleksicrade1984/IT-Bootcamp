package poljoprivreda;

public class GlavniProgram {

	public static void main(String[] args) {

		Parcela p1 = new Suma(20, 15, 3);
		Parcela p2 = new Suma(28, 20, 3);
		Parcela p3 = new Suma(35, 25, 3);
		Parcela p4 = new Njiva(40);
		Parcela p5 = new Njiva(8);
		Parcela p6 = new Njiva(6);
		System.out.println(p1 + "\n" + p2 + "\n" + p3);
		System.out.println(p4 + "\n" + p5 + "\n" + p6);

	}

}
