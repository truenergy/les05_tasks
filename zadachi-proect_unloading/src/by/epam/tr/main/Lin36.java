package by.epam.tr.main;

public class Lin36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chislo;
		double prod1;
		double prod2;
		double chast;

		chislo = 2556;
		prod1 = 1;
		prod2 = 1;

		if (chislo % 2 == 0) {
			prod1 = prod1 * (chislo % 10);
		} else {
			prod2 = prod2 * (chislo % 10);
		}

		if (chislo / 10 % 2 == 0) {
			prod1 = prod1 * (chislo / 10 % 10);
		} else {
			prod2 = prod2 * (chislo / 10 % 10);
		}

		if (chislo / 100 % 2 == 0) {
			prod1 = prod1 * (chislo / 100 % 10);
		} else {
			prod2 = prod2 * (chislo / 100 % 10);
		}

		if (chislo / 1000 % 2 == 0) {
			prod1 = prod1 * (chislo / 1000);
		} else {
			prod2 = prod2 * (chislo / 1000);
		}

		System.out.println("prod1 = " + prod1);
		System.out.println("prod2 = " + prod2);

		if (prod2 == 0) {
			System.out.println("Not a number");
		} else {
			chast = prod1 / prod2;
			System.out.println("Private = " + chast);
		}

	}
}
