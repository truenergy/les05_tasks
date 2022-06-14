package by.epam.tr.main;

import java.util.Scanner;

public class Vetv23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		int day;
		int month;

		sc = new Scanner(System.in);

		System.out.println("Vvedite celoe chislo dnej");
		System.out.print(">");
		day = sc.nextInt();

		System.out.println("Vvedite celoe chislo mesiacev");
		System.out.print(">");
		month = sc.nextInt();

		if ((day <= 31) && (month <= 12)) 

			if ((day == 31) && (month != 2) && (month != 4) && (month != 6) && (month != 9) && (month != 11)) {
				System.out.println("chislo dnej = " + day + " chislo mesiacev = " + month);
			} else if ((day == 30) && (month != 2)) {

				System.out.println("chislo dnej = " + day + " chislo mesiacev = " + month);

			} else if (day <= 29) {
				System.out.println("chislo dnej = " + day + " chislo mesiacev = " + month);

			} else {
				System.out.print("Neverno vvedeny chisla");
				
		} else {
			System.out.print("Neverno vvedeny chisla");
			}

		}
	}

