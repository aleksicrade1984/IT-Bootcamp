package domaci;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n");
		int n = sc.nextInt();

		int a = 0, b = 1, c;

		for (int i = 0; i < n; i++)

		{
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;

		}

	}

}
