package by.epam.tr.main;

public class Cikl36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int e;
		double chislo1;
		double chislo2;
		double test;
		double k;
		double m;

		a = 1000;
		for (int i = a; i <= 9999; i++) {
			b = i / 1000;
			c = i / 100 % 10;
			d = i / 10 % 10;
			e = i % 10;
			chislo1 = b * 10 + c;
			chislo2 = d * 10 + e;
			test = chislo1 * 100 + chislo2;
			m = chislo1 * chislo2;
			k = test / m;
			if ((k == 1.0) || (k == 2.0) || (k == 3.0) || (k == 4.0) || (k == 5.0) || (k == 6.0) || (k == 7.0)
					|| (k == 8.0) || (k == 9.0)) {
				System.out.println("chislo1 = " + chislo1 + " chislo2 = " + chislo2);
			}
		}
	}
}

		
		
	


