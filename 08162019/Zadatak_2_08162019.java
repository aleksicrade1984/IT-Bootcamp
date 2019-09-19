package domaci;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		/*
		 * Napisati program za ispis obrnutog trougla sa željenim brojem redova: .
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko zelite redova: ");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {

			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();

			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}

		}

	}
}