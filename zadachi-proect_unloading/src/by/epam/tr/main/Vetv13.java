package by.epam.tr.main;

public class Vetv13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1, y1;
		double x2, y2;
		double r1, r2;

		x1 = 1.5;
		y1 = 2.4;
		x2 = 1.4;
		y2 = 1.5;
		r1 = Math.sqrt((0 - x1) * (0 - x1) + (0 - y1) * (0 - y1));
		r2 = Math.sqrt((0 - x2) * (0 - x2) + (0 - y2) * (0 - y2));

		if (r1 < r2) {
			System.out.println(" point A1 is closer");
		} else {
			if (r1 > r2) {
				System.out.println(" point A2 is closer");
			} else {
				System.out.println(" points are equidistant");
			}
		}
	}

}
