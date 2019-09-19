package domaci;

import java.util.Scanner;

public class Zadatak_3_08122019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi brojeve");
		int a=sc.nextInt(), sum=0;
		
		while (a>0) {
			sum+=a;
			a=sc.nextInt();
			
		}
		System.out.println("Suma pozitivnih brojeva je: " + sum);
	}

}
