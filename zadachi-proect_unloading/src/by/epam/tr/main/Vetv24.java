package by.epam.tr.main;

import java.util.Scanner;

public class Vetv24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		double n;

		sc = new Scanner(System.in);

		System.out.println("Input chislo");
		System.out.print(">");
		n = sc.nextInt();

		if (n % 2 != 0) {
			System.out.print("Love");
		} else {
			System.out.print("Don't love");
		}
	}
}
