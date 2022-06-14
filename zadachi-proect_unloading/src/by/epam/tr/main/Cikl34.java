package by.epam.tr.main;

public class Cikl34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		int c;
		int d;
		int e;
		int sum;

		a = 1000;
		for (int i = a; i <= 9999; i++) {
			b = i / 1000;
			c = i / 100 % 10;
			d = i / 10 % 10;
			e = i % 10;
			sum = b + c + d + e;
			if (sum == 15) {
				System.out.println("a = " + i);
			}
		}
	}
}