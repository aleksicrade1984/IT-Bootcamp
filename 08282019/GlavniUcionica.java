package ucionica;

public class GlavniUcionica {

	public static void main(String[] args) {
		Polaznik p1 = new Polaznik("Rade Aleksic");
		Polaznik p2 = new Polaznik("Pera Peric");
		Laptop l1 = new Laptop("Toshiba");
		Laptop l2 = new Laptop("Lenovo");
		l1.setPolaznik(p1);
		l1.setPolaznik(p2);
		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());
		System.out.println(l1.ispisi());
		System.out.println(l2.ispisi());
	}

}
