package by.epam.tr.main;

public class Lin32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours, min, sec;
		int hours1, min1, sec1;
		int hours2, min2, sec2;

		hours = 1;
		min = 20;
		sec = 5;
		System.out.println("original time " + hours + "h " + min + "m " + sec + "s");

		hours1 = 18;
		min1 = 58;
		sec1 = 59;

		sec2 = (hours + hours1) * 3600 + (min + min1) * 60 + sec + sec1;
		while (sec2 > 86400) {
			sec2 = sec2 - 86400;
		}
		
		if (sec2 == 86400) {
			System.out.println("Current time 0h 0m 0s");
		}
		
		hours2 = sec2 / 3600;
		min2 = (sec2 - hours2 * 3600) / 60;
		sec2 = sec2 - hours2 * 3600 - min2 * 60;
		if (min2 >= 60) {
			min2 = min2 - 60;
			hours2 = hours2 + 1;
			if (hours2 >= 24) {
				hours2 = hours2 - 24;
			}
		}

		System.out.println("Current time " + hours2 + "h " + min2 + "m " + sec2 + "s");
	}
}