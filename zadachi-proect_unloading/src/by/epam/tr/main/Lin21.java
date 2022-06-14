package by.epam.tr.main;

public class Lin21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int b;
		int c;
		double d;
		double number;
		
		a = 155.263;
		System.out.println("First number = " + a);
		
		b = (int) a;
		c = (int) (a * 1000);
		c = c % 1000;
		d = b * 1;
		a = c * 1;
		number = a + d / 1000;

		//System.out.println("b = " + b + " c = " + c + " d = " + d + " a = " + a);
		System.out.println("Second number = " + number);
	}

}
