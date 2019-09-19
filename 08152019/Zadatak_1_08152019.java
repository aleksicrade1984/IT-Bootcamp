package domaci;

import java.util.Scanner;

public class Zadatak_1_08152019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		double a, b, c, r, H;
		do {
			System.out.println("Izaberite jednu od ponudjenih opcija");
			System.out.println("1- Povrsina kocke");
			System.out.println("2- Povrsina kvadra");
			System.out.println("3- Povrsina valjka");
			System.out.println("4- Povrsina lopte");
			System.out.println("0- Izlaz");

			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Unesite stranicu a: ");
				a = sc.nextDouble();
				System.out.println("Povrsina kocke je: " + a * a);
				break;
			case 2:
				System.out.println("Unesite stranicu a: ");
				a = sc.nextDouble();
				System.out.println("Unesite stranicu b: ");
				b = sc.nextDouble();
				System.out.println("Unesite stranicu c: ");
				c = sc.nextDouble();
				System.out.println("Povrsina kvadra je: " + 2 * (a * b + a * c + b * c));
				break;
			case 3:
				System.out.println("Unesite poluprecnik osnove valjka r: ");
				r = sc.nextDouble();
				System.out.println("Unesite visinu valjka H ");
				H = sc.nextDouble();
				System.out.println("Povrsina valjka je: " + 2 * r * 3.14 * (r + H));
				break;
			case 4:
				System.out.println("Unesite poluprecnik r: ");
				r = sc.nextDouble();
				System.out.println("Povrsina lopte je: " + 4 * r * r * 3.14);
				break;
			default:
				System.out.println("Pogresan unos");
				break;
			case 0:
				System.out.println("Hvala sto koristite nas program");
				break;

			}
		} while (i != 0);
	}
}
