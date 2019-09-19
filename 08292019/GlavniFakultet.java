package fakultet;

public class GlavniFakultet {

	public static void main(String[] args) {
		Student s1 = new Student("Rade", "Aleksic", 1984, "229/19", 4, 9.99);
		Student s2 = new Student("Pera", "Peric", 1990, "254/19", 2, 8.68);
		Student s3 = new Student("Mika", "Mikic", 1983, "358/17", 3, 9.28);
		Profesor p1 = new Profesor("Zika", "Zikic", 1954, "redovni profesor");
		Profesor p2 = new Profesor("Jovan", "Jovanovic", 1968, "asistent");
		p1.dodajPredmet("anatomija");
		p1.dodajPredmet("fiziologija");
		p2.dodajPredmet("fizika");
		p2.dodajPredmet("matematika");
		p2.dodajPredmet("hemija");
		System.out.println(s1.ispisi() + "\n" + s2.ispisi() + "\n" + s3.ispisi());
		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());
		p2.ukloniPredmet("hemija");
		System.out.println(p2.ispisi());

	}

}
