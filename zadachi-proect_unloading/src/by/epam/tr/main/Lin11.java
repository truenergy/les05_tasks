package by.epam.tr.main;

public class Lin11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kat1;
		double kat2;
		double gip;
		double p;
		double s;
		
		kat1 = 5.5;
		kat2 = 6.0;
		
		gip = Math.sqrt(kat2 * kat2 + kat1 + kat1);
		p = kat1 + kat2 + gip;
		s = (kat1 + kat2) / 2;
		
		System.out.println(" Perimetr = " + p);
		System.out.println(" Square = " + s);
	}

}
