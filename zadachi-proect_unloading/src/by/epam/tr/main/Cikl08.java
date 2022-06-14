package by.epam.tr.main;

public class Cikl08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double h;
		double y;
		double x;
		double c;

		a = -5.0;
		b = 5.0;
		h = 0.5;
		c = 1.0;
		x = a;

		while ((x >= a) && (x <= b)) {
			if (x != 15) {
				y = ((x - c) + 6);
			} else {
				y = ((x + c) * 2);
			}
			System.out.println("x = " + x + " y = " + y);
			x = x + h;
		}

	}
}
	