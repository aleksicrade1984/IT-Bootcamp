package fakultet;

public class Student extends Covek {
	private String brIndeksa;
	private int godStudija;
	private double prosek;

	public Student(String ime, String prezime, int godRodj, String brIndeksa, int godStudija, double prosek) {
		super(ime, prezime, godRodj);
		this.brIndeksa = brIndeksa;
		this.godStudija = godStudija;
		this.prosek = prosek;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public double getProsek() {
		return prosek;
	}

	// Studenta ispisati u formatu: Ime_Prezime[godina rodjenja] je student ___ (god
	// studija) godine studija sa prosekom____ (trenutni prosek).
	public String ispisi() {
		return ime + " " + prezime + " je student " + godStudija + ". godine studija sa prosekom " + prosek + ".";
	}

}
