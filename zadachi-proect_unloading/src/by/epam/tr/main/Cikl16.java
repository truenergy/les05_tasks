package by.epam.tr.main;

public class Cikl16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int sum;
		long product;

		a = 0;
		sum = 0;
		product = 1;

		while (a < 8) {
			System.out.println("a = " + a);
			sum = sum + a + 1;
			product = product * sum;
			System.out.println("Sum of numbers1 = " + sum);
			System.out.println("Product of numbers1 = " + product);
			a = a + 1;
		}

		System.out.println("Total = " + product);
	}

}
