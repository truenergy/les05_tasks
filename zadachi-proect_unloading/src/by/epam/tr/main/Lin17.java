package by.epam.tr.main;

public class Lin17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double cub;
		double geo;
		a = 3.0;
		b = -5.0;
		cub = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		System.out.println("Cub = " + cub);
		
		if (b < 0) {
			b = b * -1;
		}
		
		if (a < 0) {
			a = a * -1;
		}
		
		geo = Math.sqrt(a * b);
		System.out.println("Geo = " + geo);
		
	}

}
