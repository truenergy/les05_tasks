package by.epam.tr.main;

public class Cikl15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int sum;
n = 1;
sum = 0;

while (n<= Math.pow(2, 10)) {
	sum = sum +n;
	n = n+n;
}
System.out.println("Summa = " + sum);
	}

}
