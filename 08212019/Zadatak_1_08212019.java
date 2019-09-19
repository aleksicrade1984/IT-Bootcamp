package domaci;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neko broj br. Program
		 * ispisuje elemente niza deljive brojem br
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucitaj broj elemenata niza: ");
		int n = sc.nextInt();
		System.out.print("Unesi broj sa kojim se dele elementi niza: ");
		int br = sc.nextInt();
		int[] niz = new int[n];
		System.out.print("Unesi elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.println("Elementi niza koji su deljivi sa brojem " + br + " su " + niz[i]);
			}

		}
	}

}
