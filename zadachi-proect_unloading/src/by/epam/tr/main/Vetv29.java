package by.epam.tr.main;

public class Vetv29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, y1;
		double x2, y2;
		double x3, y3;
		double a, b;

		x1 = 2.0;
		y1 = 0.0;
		x2 = 0.0;
		y2 = 2.0;
		x3 = -1.0;
		y3 = 3.0;

		if ((y1 != y2) && (x1 != x2)) {
			a = (y3 - y1) / (y2 - y1);
			b = (x3 - x1) / (x2 - x1);
			if (a == b) {
				System.out.print("Tochki lezat na odnoj priamoj");
			} else {
				System.out.print("Tochki ne lezat na odnoj priamoj");
			}

		} else if (((y1 == y2) && (y2 == y3) && (x1 != x2) && (x2 != x3))
				|| ((y1 != y2) && (y2 != y3) && (x1 == x2) && (x2 == x3))) {
			System.out.print("Tochki lezat na odnoj priamoj");
		} else {
			System.out.print("Tochki ne lezat na odnoj priamoj");
		}
	}

}
