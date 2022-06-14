package by.epam.tr.main;

import java.util.Scanner;

public class Vetv21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;

		String a;

		sc = new Scanner(System.in);

		System.out.println("Who are you: Boy or Girl? Input B or G");
		System.out.print(">");
		
		a = sc.next();

		if (a.equals("B")) {
			System.out.println("I like Boys");
		} else {
			System.out.println("I like Girls");
		}

	}
}
