package domaci;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// U�itati radijus. Ako je ve�i od 5 izra�unati obim kruga ina�e izra�unati
		// povr�inu kruga.

		/*
		 * Scanner sc = new Scanner (System.in);
		 * System.out.println("Unesite radijus r: "); double r=sc.nextDouble();
		 * 
		 * if (r>5) { System.out.println("Obim kruga je: "+ 2*r*3.14); } else {
		 * System.out.println("Povrsina kruga je: "+ r*r*3.14); }
		 */

		/*
		 * Generisati 2 realna broja razli�ita od 0. Ako su razli�itog predznaka sabrati
		 * ih, a ako su istog predznaka pomno�iti ih. Rezulat Ispisati na ekran.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj a: ");
		double a = sc.nextDouble();
		System.out.println("Unesite broj b: ");
		double b=sc.nextDouble();
		
		if (a>0 && b>0) {
			System.out.println("Proizvod brojeva "+a+ " i "+b+ " je " + a*b);
			
		}
		else if (a<0 && b<0) {
			System.out.println("Proizvod brojeva "+a+ " i "+b+ " je " + a*b);
			
		}else {
			System.out.println("Zbir brojeva "+a+ " i "+b+ " je " + (a+b));
		}
	}
}