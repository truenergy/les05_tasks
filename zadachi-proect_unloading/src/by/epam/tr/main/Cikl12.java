package by.epam.tr.main;

public class Cikl12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int an;
		long product;
		int count;

		an = 1;
		count = 1;
		product = an;

		while (count < 10) {
			an = 6 + an;

			product = product * an;
			System.out.println("An = " + an);
			count = count + 1;
		}
		System.out.println("Product = " + product);

	}

}
