package knjige;

public class Knjige {

	private String naziv, autor;
	private int brStrana, godIzdanja;

	public Knjige(String naziv, String autor, int brStrana) {
		this.naziv = naziv;
		this.autor = autor;
		this.brStrana = brStrana;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getAutor() {
		return autor;
	}

	public int getBrStrana() {
		return brStrana;
	}

}
