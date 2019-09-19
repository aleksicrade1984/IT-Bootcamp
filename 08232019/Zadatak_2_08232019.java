package domaci;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava tri cela broja i metodu koja ispisuje brojeve
		 * od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj a: ");
		int a = sc.nextInt();
		System.out.print("Unesite broj b: ");
		int b = sc.nextInt();
		System.out.print("Unesite broj kojim se deli: ");
		int c = sc.nextInt();
		deljenje(a, b, c);
	}

	public static void deljenje(int x, int y, int z) {
		for (int i = x; i <= y; i++) {
			if (i % z == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
