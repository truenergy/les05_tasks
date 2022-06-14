package by.epam.tr.main;

public class Lin12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1, y1;
		double x2, y2;
		double r;

		x1 = 1.5;
		y1 = 5.4;
		x2 = 1.5;
		y2 = 1.4;
		
		r = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("distance = " + r);
	}

}
