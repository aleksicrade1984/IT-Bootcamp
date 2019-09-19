package kalkulator;

public class Calculator {
	private static double sum = 0;

	public Calculator add(double x) {
		sum += x;
		return this;
	}

	public Calculator sub(double x) {
		sum -= x;
		return this;
	}

	public Calculator mul(double x) {
		sum *= x;
		return this;
	}

	public Calculator div(double x) {
		sum /= x;
		return this;
	}

	public double value() {
		return sum;
	}

}
