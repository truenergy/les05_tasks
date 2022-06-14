package by.epam.tr.main;

import java.util.Scanner;

public class Cikl11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc;
		int count;
		double number;
		double lustnumber;
		double step;
		double difference;

		sc = new Scanner(System.in);
		System.out.println("Vvedite chislo a");
		System.out.print(">");

		number = sc.nextDouble(); // первое число

		System.out.println("Vvedite shag");
		System.out.print(">");

		step = sc.nextDouble(); // шаг

		count = 1; // счетчик
		lustnumber = number + step * (200 - 1); // последнее число в цепочке
		difference = Math.pow(lustnumber, 3); // куб последнего числа

		while (count < 200) {
			difference = difference - Math.pow(number, 3);
			number = number + step;
			count = count + 1;
		}
		System.out.println("Difference = " + difference);
		//System.out.println("Lustnumber = " + lustnumber);

	}
}
