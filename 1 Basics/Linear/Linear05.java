package by.home.basic.linear;

/*
 * Раздел "Линейные программы".
 * Задача №5.
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Linear05 {

	public static void main(String[] args) {
		
		long t = 5_000_000_000_001L;
		System.out.println("T=" + t + " seconds equals");
		
		byte seconds = (byte) (t % 60);
		
		t /= 60;
		
		byte minutes = (byte) (t % 60);
		
		long hours = t / 60;
		
		System.out.println(hours + " hours" + '\n' + minutes + " minutes" + '\n' + seconds + " seconds");
	}
}
