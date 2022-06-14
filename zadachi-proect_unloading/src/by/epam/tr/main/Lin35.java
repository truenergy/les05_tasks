package by.epam.tr.main;

public class Lin35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double M;
		double N;
		double a;
		double x1;
		double x2;
		
		M = 5010;
		N = 35;
		a = M / N;
		System.out.println("Chastnoe = " + a);
		x1 = a % 10;
		x1 = (int) x1;
		x2 = a * 10 % 10;
		x2 = (int) x2;
		System.out.println("low digit = " + x1);
		System.out.println("highest digit = " + x2);
	}

}
