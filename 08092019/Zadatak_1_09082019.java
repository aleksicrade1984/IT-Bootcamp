package domaci;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int br;
		System.out.println("Unesite broj: ");
		br = sc.nextInt();

		if (br % 2 == 0) {
			System.out.println("Broj je paran!");
		} else {
			System.out.println("Broj je neparan!");
		}
	}

}
