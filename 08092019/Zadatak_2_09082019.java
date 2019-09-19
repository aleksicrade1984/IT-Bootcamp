package domaci;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, r;
		String s;
		System.out.print("Unesite naziv geometrijskog tela: ");
		s = sc.nextLine();

		switch (s) {
		case "pravougaonik":
			System.out.print("Unesite stranicu a: ");
			a = sc.nextDouble();
			System.out.print("Unesite stranicu b: ");
			b = sc.nextDouble();
			System.out.println(" Povrsina pravougaonika je: " + (a * b));
			break;
		case "krug":
			System.out.print("Unesite poluprecnik: ");
			r = sc.nextDouble();
			System.out.print("Povrsina kruga je: " + (r * r * 3.14));
			break;
		case "kvadrat":
			System.out.print("Unesite stranicu a: ");
			a = sc.nextDouble();
			System.out.println("Povrsina kvadrata je: " + (a * a));
			break;
		default:
			System.out.println("Nije dobro unet naziv geometrijskog tela!");
		}

	}

}
