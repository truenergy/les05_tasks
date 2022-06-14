package by.epam.tr.main;

import java.util.Scanner;

public class Cikl06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					Scanner sc;
				    int a;
				    int b;
				    int sum;

				    sc = new Scanner(System.in);
				    do {
				      System.out.println("Vvedite chislo > 0");
				      System.out.print(">");
				      a = sc.nextInt();

				      while (a <= 0) {
				        sc.nextLine();
				        System.out.println("Vvedeno nepolozhitelnoe chislo");
				        System.out.println("Vvedite chislo > 0");
				        System.out.print(">");
				        a = sc.nextInt();
				      }
				      

				      if (a > 0) {
				        break;
				      }
				      System.out.println("vvedite chislo");
				    } while (true);

				    b = 1;
				    sum = 0;
				    while (b <= a) {
				      sum = sum + b;
				      b = b + 1;
				    }
				    System.out.print("Summa = " + sum);

				  }
				}