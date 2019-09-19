package domaci;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		 * metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca zbir
		 * parnih elemenata niza.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz1 = new int[n];
		upis(niz1);
		System.out.println("Proizvod elemenata na neparnim pozicijama je: " + proizvodNeparnihPozicija(niz1));
		System.out.println("Zbir parnih elemenata je: " + zbirParnihElemenata(niz1));
	}

	public static void upis(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static int proizvodNeparnihPozicija(int[] niz) {
		int sum = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 1) {
				sum *= niz[i];
			}
		}
		return sum;
	}

	public static int zbirParnihElemenata(int[] niz) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				sum += niz[i];
			}
		}
		return sum;
	}
}