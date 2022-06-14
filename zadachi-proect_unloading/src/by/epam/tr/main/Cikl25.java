package by.epam.tr.main;

import java.util.Scanner;

public class Cikl25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int a;
		int result;

		sc = new Scanner(System.in);

		System.out.println("Vvedite celoe chislo");
		System.out.print(">");
		a = sc.nextInt();
		
		result = 1;
		for (int i = 1; i <= a; i++) {
			result = result * i;
		}
		System.out.print("Factorial vvedennogo chisla = " + result);
	}

}
