package poljoprivreda;

public class Suma extends Parcela {

	/*
	 * Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, prinos po
	 * zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju
	 * godina. Oznaka vrste je S. Prinos se ostvaruje formulom
	 * povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
	 * Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period). Ovo se ostvaruje
	 * pozivom super.toString();
	 */
	private double povrsina_stabla;
	private double prinos_stabla;
	private int godineSazrevanja;

	public Suma(double povrsina_stabla, double prinos_stabla, int godineSazrevanja) {
		super();
		this.povrsina_stabla = povrsina_stabla;
		this.prinos_stabla = prinos_stabla;
		this.godineSazrevanja = godineSazrevanja;
	}

	public double getPovrsina_stabla() {
		return povrsina_stabla;
	}

	public double getPrinos_stabla() {
		return prinos_stabla;
	}

	public int getGodineSazrevanja() {
		return godineSazrevanja;
	}

	public double prinos() {
		prinos = povrsina_parcele / povrsina_stabla * prinos_stabla * godineSazrevanja;
		return prinos;
	}

	@Override
	public char getVrsta() {
		return 'S';
	}

	@Override
	public String toString() {
		return super.toString() + ":(" + povrsina_stabla + "," + prinos_stabla + "," + godineSazrevanja + ").";
	}

}
