package by.epam.tr.main;

public class Cikl39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int c;
		
		a = 100;

		while ((c = 7 * (a % 100)) != a) {
			a++;
		}
		System.out.print("a = " + a);
	}

}
