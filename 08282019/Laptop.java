package ucionica;

public class Laptop {

	private Polaznik p;
	private String marka;

	public Laptop(String marka) {
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public Polaznik getPolaznik() {
		return p;
	}

	public void setPolaznik(Polaznik p) {
		this.p = p;
	}

	public String ispisi() {
		String s;
		if (p == null) {
			s = "NEMA POLAZNIKA";

		} else {
			s = p.ispisi();
		}
		return marka + "{" + s + "}";
	}

}
