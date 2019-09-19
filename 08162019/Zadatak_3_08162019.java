package domaci;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// Ispis prirodnih brojeva od k do n koji nisu djeljivi sa a.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite k: ");
		int k = sc.nextInt();
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		System.out.println("Unesite a: ");
		int a = sc.nextInt();
		int i = k;
		while (i <= n) {
			if (i % a != 0) {
				System.out.println("Brojevi koji nisu deljivi sa " + a + " su: " + i);
			}
			i++;
		}

	}
}
