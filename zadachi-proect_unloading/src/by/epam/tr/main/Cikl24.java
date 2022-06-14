package by.epam.tr.main;

public class Cikl24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long chislo;
		long sum;
		
		chislo = 215689213L;
		sum = 0;
		
		while (chislo > 0) {
			if (chislo % 2 == 0) {
				sum = sum + chislo % 10;
			}
			chislo = chislo / 10;
		}
		System.out.print("Summa chetnyh cifr = " + sum);
	}

}
