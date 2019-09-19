package domaci;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko zelite redova zvezdica vertikalno: ");
		int n = sc.nextInt();
		System.out.println("Unesi koliko zelite zvezdica u svakom redu horizontalno: ");
		int k = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}
}
