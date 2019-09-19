package domaci;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		int a = 0;
		int sum = 0;
		int sum1 = 1;
		while (a < n) {
			if (a % 2 == 0) {
				sum += a;
			} else {
				sum1 *= a;
			}
			a += 1;
		}
		System.out.println("Zbir parnih brojeva je: " + sum);
		System.out.println("Proizvod neparnih brojeva je: " + sum1);
	}

}
