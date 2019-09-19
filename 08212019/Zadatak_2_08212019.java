package domaci;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		// redosledom.

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.print("Unesi elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for (int i = 0; i < n / 2; i++) {
			int temp = niz[i];
			niz[i] = niz[n - i - 1];
			niz[n - i - 1] = temp;
		}
		for (int j = 0; j < n; j++) {
			System.out.print(niz[j]+" ");

		}
	}

}