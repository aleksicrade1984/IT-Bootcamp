package domaci;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, o, p;
		System.out.print("Unesi stranicu a: ");
		a = sc.nextDouble();
		System.out.print("Unesi stranicu b: ");
		b = sc.nextDouble();
		o = 2 * a + 2 * b;
		p = a * b;
		System.out.println("Obim pravougaonika je: " + o);
		System.out.println("Povrsina pravougaonika je: " + p);

	}

}
