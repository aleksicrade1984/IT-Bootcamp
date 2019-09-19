package poljoprivreda;

public class Njiva extends Parcela {

	private double prinosPoKvM;

	public Njiva(double prinosPoKvM) {
		
		this.prinosPoKvM = prinosPoKvM;
	}

	public double getPrinosPoKvM() {
		return prinosPoKvM;
	}

	public void setPrinosPoKvM(double prinosPoKvM) {
		this.prinosPoKvM = prinosPoKvM;
	}

	public double prinosNjive() {
		prinos = povrsina_parcele * prinosPoKvM;
		return prinos;
	}

	@Override
	public char getVrsta() {
		return 'N';

	}

	@Override
	public String toString() {
		return super.toString() + ":" + prinosPoKvM;
	}
}
/*
 * Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. Prinos
 * po kvadratnom metru moze da se promeni. Oznaka vrste je N. Prinos njive se
 * racuna po formuli: povrsina_parcele*prinosPoKvM. Tekstualni oblik je
 * Parcela:PrinosPoKvM.
 */