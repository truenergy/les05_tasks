package by.epam.tr.main;

public class Vetv27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double d;
		double min1;
		double min2;
		double max;

		a = 5.0;
		b = 4.4;
		c = -33.2;
		d = 15.12;

		if (a > b) {
			min1 = b;
		} else { min1 =a;
		}
		
		if (c > d) {
			min2 = d;
		} else { min2 = c;
		}
		
		if (min1 > min2) {
			System.out.print("max = " + min1);
		} else {
			System.out.print("max = " + min2);
		}
	}

}
