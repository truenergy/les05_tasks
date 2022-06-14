package by.epam.tr.main;

public class Lin13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1, y1;
		double x2, y2;
		double x3, y3;
		double stor1, stor2, stor3;
		double p;
		double per;
		double s;

		x1 = 1.5;
		y1 = 1.5;
		x2 = 2.0;
		y2 = 2.0;
		x3 = 3.0;
		y3 = 3.0;

		stor1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		stor2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		stor3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		
		System.out.println("stor1 = " + stor1);
		System.out.println("stor2 = " + stor2);
		System.out.println("stor3 = " + stor3);
		
		if ((stor1 + stor2 <= stor3) || ((stor2 + stor3) <= stor1) || ((stor1 + stor3) <= stor2)) {
			System.out.println("incorrect data entered");
		} else {
			per = stor1 + stor2 + stor3;
			p = per / 2;
			s = Math.sqrt(p * (p - stor1) * (p - stor2) * (p - stor3));
			System.out.println("perimeter = " + per);
			System.out.println("square = " + s);
		}

	}

}
