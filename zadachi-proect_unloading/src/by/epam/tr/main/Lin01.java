package by.epam.tr.main;

public class Lin01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double sum;
		double raz;
		double proiz;
		double chastnoe;

		x = 25.5;
		y = 1.0;

		sum = x + y;
		raz = x - y;
		proiz = x * y;

		System.out.println("Summa = " + sum);
		System.out.println("Raznost = " + raz);
		System.out.println("Proizvedenie = " + proiz);

		chastnoe = x / y;

		if (chastnoe == Double.POSITIVE_INFINITY) {
			System.out.println("Pri delenii poluchena beskonechnost");
		} else {
			System.out.println("Chastnoe = " + chastnoe);
		}
	}
}
