package fakultet;

import java.util.ArrayList;
import java.util.List;

//Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu. Predmeti mogu da se dodaju i oduzimaju iz liste.
public class Profesor extends Covek {

	private String titula;
	private List<String> predmet;

	public Profesor(String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.titula = titula;
		predmet = new ArrayList<>();
	}

	public String getTitula() {
		return titula;
	}

	public List<String> getPredmet() {
		return predmet;
	}

	public void dodajPredmet(String p) {
		predmet.add(p);
	}

	public void ukloniPredmet(String p) {
		predmet.remove(p);

	}// Profesora ispisati u formatu: Ime_Prezime[godina rodjenja] je ___(titula)
		// koji drzi nastavu na: <lista predmeta>.

	public String ispisi() {
		return ime + " " + prezime + " [" + godRodj + "] je " + titula + ", koji drzi nastavu na: " + predmet;
	}

}
