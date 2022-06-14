package by.epam.tr.main;

public class Vetv09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;

		a = 10.0;
		b = 6.0;
		c = 10.0;

		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			System.out.println("check the data");
		} else {
			if ((a > 0) && (a == b) && (a == c)) {
				System.out.println("equilateral triangle");
			} else {
				System.out.println("equilateral is not triangle");
			}
		}

	}
}
