package by.epam.tr.main;

public class Lin16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int e;
		int prod;
		
		a = 1234;
		b = a / 1000;
		c = a / 100 % 10;
		d = a / 10 % 10;
		e = a % 10;
		
		System.out.println("b =" + b);
		System.out.println("c =" + c);
		System.out.println("d =" + d);
		System.out.println("e =" + e);

		prod = b * c * d * e;
		System.out.println("Product =" + prod);
	}

}
