package by.epam.tr.main;

import java.util.Scanner;

public class Vetv03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		double a;

		sc = new Scanner(System.in);

		System.out.println("Vvedite chislo");
		System.out.print(">");
		a = sc.nextDouble();
		
		if (a < 3.0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
