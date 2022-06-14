package by.epam.tr.main;

public class Cikl14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double sum;

		n = 1.0;
		sum = 0.0;
		
		while (n <= 10) {
			sum = sum + 1 / n;
			n = n + 1;
		}
		System.out.println("Result = " + sum);
	}
}
