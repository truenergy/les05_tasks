package by.epam.tr.main;

import java.util.Scanner;

public class Cikl27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc;
		int m;
		int n;
		int del;

		Scanner sc = new Scanner(System.in);

		System.out.println("Vvedite chislo m");
		System.out.print(">");
		m = sc.nextInt();

		System.out.println("Vvedite chislo n");
		System.out.print(">");
		n = sc.nextInt();

		while (m <= n) {

			for (int i = m; i > 0; i--) {
				del = m % i;
				if ((del == 0) && (i != m) && (i != 1)) {
					System.out.println("delitel chisla " + m + " est " + i);
				}
			}
			m = m + 1;
		}
	}
}
