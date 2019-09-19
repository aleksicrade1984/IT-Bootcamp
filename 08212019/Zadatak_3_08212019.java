package domaci;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		boolean rastuci = true;
		System.out.print("Uneti elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for (int j = 0; j < n - 1; j++) {
			if (niz[j] >= niz[j + 1]) {
				rastuci = false;
				break;
			}
		}
		if (rastuci) {
			System.out.println("Uneti niz je rastuci.");
		} else {
			System.out.println("Uneti niz nije rastuci.");
		}

	}

}
