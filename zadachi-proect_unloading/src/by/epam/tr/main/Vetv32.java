package by.epam.tr.main;

public class Vetv32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		a = 5.4;
		b = -5.4;
		c = -1.5;
		double sum1;
		double sum2;
		double sum3;
		if ((a + b) > 0) {
			sum1 = a + b;
			System.out.println(" Summa a + b > 0");
		}
		if ((a + c) > 0) {
			sum2 = a + c;
			System.out.println(" Summa a + c > 0");
		}
		if ((c + b) > 0) {
			sum3 = c + b;
			System.out.println(" Summa c + b > 0");
		}
		if (((a + b) < 0) && ((a + c) < 0) && ((b + c) < 0)) {
			System.out.println("no positive sum");

		}

	}

}
