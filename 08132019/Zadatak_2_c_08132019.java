package domaci;

import java.util.Scanner;

public class Zadatak_2_c_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj k: ");
		int k = sc.nextInt();
		System.out.println("Unesite broj n: ");
		int n=sc.nextInt(), sum = 0;

		while (k <= n) {

			sum = sum + k;
			k++;
		}

		System.out.println("Zbir brojeva je: " + sum);

	}

}
