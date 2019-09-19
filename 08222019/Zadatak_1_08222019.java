package domaci;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		/*
		 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		 * metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		 * ispisuje najmanji od unesenih brojeva.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi realan broj a: ");
		double a = sc.nextDouble();
		System.out.println("Unesi realan broj b: ");
		double b = sc.nextDouble();
		System.out.println("Unesi realan broj c: ");
		double c = sc.nextDouble();
		System.out.println("Proizvod brojeva a, b i c je: " + proizvod(a, b, c));
		System.out.println("Najmanji broj je: " + najmanji(a, b, c));

	}

	public static double proizvod(double x, double y, double z) {
		double s = x * y * z;
		return s;

	}

	public static double najmanji(double x, double y, double z) {
		if (x < y && x < z) {
			return x;
		} else if (y < x && y < z) {
			return y;
		} else {
			return z;
		}
	}

}
