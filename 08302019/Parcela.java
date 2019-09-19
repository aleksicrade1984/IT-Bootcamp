package poljoprivreda;

public abstract class Parcela {

	private static int UID = 0;
	private int id;
	protected double povrsina_parcele = 50;
	protected double prinos;

	public Parcela() {
		id = ++UID;
	}

	public static int getUID() {
		return UID;
	}

	public int getId() {
		return id;
	}

	public double getPovrsina_parcele() {
		return povrsina_parcele;
	}

	public double getPrinos() {
		return prinos;
	}

	public abstract char getVrsta();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getVrsta()).append("-").append(id).append("[").append(povrsina_parcele).append("]");
		return sb.toString();
	}

	/*
	 * Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu
	 * povrsinu(u kvadratnim metrima) prilikom kreiranja. Mogu da joj se dohvate
	 * sadrzani podaci, kao i jednoslovna vrsta(char). Moze da joj se odredi prinos
	 * u periodu zadatom brojem godina. Moze da se sastavi tekstualni opis u obliku
	 * VRSTA-ID[POVRSINA].
	 */
}
