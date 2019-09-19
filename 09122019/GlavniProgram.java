package kalkulator;

public class GlavniProgram {

	public static void main(String[] args) {
		Calculator kal=new Calculator();
		double sum= kal.add(12).div(2).sub(2).mul(20.5).add(-5).value();
		System.out.println("Rezultat je: "+sum);
			
	}

	}


