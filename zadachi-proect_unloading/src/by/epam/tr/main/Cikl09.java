package by.epam.tr.main;

import java.util.Scanner;

public class Cikl09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int a;
		int b;
		long sum;

		sc = new Scanner(System.in);
		System.out.println("Vvedite chislo a");
		System.out.print(">");
		
		a = sc.nextInt();
		
		b = a + 100;
		sum = 0;

		while (a <= b) {
			sum = sum + a * a;
			a = a + 1;
		}

		System.out.println("Summa = " + sum);
	}

}
