package by.epam.tr.main;

import java.util.Scanner;

public class Cikl10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		long a;
		long b;
		long product;

		sc = new Scanner(System.in);
		System.out.println("Vvedite chislo a");
		System.out.print(">");

		a = sc.nextInt();

		b = a + 25;
		product = 1;

		while (a <= b) {
			product = a * a * product;
			a = a + 1;
		}

		System.out.println("Product = " + product);
	}

}
