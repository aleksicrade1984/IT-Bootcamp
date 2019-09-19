package fakultet;

public class Covek {

	protected String ime;
	protected String prezime;
	protected int godRodj;

	public Covek(String ime, String prezime, int godRodj) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodRodj() {
		return godRodj;
	}

	public String ispisi() {
		return ime + " " + prezime + "[" + godRodj + "]";
	}

}
