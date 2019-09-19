package domaci;

import java.util.Scanner;

public class Zadatak_2_b_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt(), a = 1, sum = 0;

		while (a <= n) {

			sum = sum + a;
			a++;
		}

		System.out.println("Zbir brojeva od 1 do " + n + " je: " + sum);
	}

}
