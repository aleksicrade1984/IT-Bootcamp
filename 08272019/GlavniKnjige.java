package knjige;

public class GlavniKnjige {

	public static void main(String[] args) {
		Knjige k1=new Knjige ("Koreni","Dobrica Cosic",376);
		k1.setGodIzdanja(2015);
		Knjige k2=new Knjige ("Molekuli","Ivan Tokin",284);
		k2.setGodIzdanja(2014);
		Knjige k3=new Knjige ("Majstor i Margarita","Mihail Bulgakov",375);
		k3.setGodIzdanja(2012);

		System.out.println("Knjiga 1: "+k1.getNaziv()+", "+k1.getAutor()+", "+k1.getBrStrana()+" strana, "+k1.getGodIzdanja());
		System.out.println("Knjiga 2: "+k2.getNaziv()+", "+k2.getAutor()+", "+k2.getBrStrana()+" strana, "+k2.getGodIzdanja());
		System.out.println("Knjiga 3: "+k3.getNaziv()+", "+k3.getAutor()+", "+k3.getBrStrana()+" strana, "+k3.getGodIzdanja());

	}

}
