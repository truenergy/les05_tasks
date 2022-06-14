package by.epam.tr.main;

public class Vetv11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1, b1, c1;
		double a2, b2, c2;
		double p1, s1;
		double p2, s2;
		
		a1 = 1.5;
		b1 = 3.4;
		c1 = 3.4;
		
		a2 = 5.1;
		b2 = 5.1;
		c2 = 3.2;
		
		p1 = (a1 + b1 + c1) / 2;
		p2 = (a2 + b2 + c2) / 2;
		s1 = Math.sqrt((p1 * (p1 - a1) * (p1 - b1) * (p1 - c1)));
		s2 = Math.sqrt((p2 * (p2 - a2) * (p2 - b2) * (p2 - c2)));
		
		if (s1 > s2) {
			System.out.println(" Square S1 > Square S2");
		} else {
			System.out.println(" Square S2 > Square S1");

		}

	}
}
