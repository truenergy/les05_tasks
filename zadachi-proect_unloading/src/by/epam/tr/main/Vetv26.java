package by.epam.tr.main;

public class Vetv26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double max;
		double min;
		double sum;
		
		a = 1.0;
		b = 3.2;
		c = -4.0;
		
		max = Math.max(a, b);
		max = Math.max(c, max);
		min = Math.min(a, b);
		min = Math.min(c, min);
		sum = max + min;
		System.out.println("Summa =" + sum);
	}

}
