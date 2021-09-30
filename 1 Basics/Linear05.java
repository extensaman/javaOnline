package by.home.basics;

/*
 * Раздел "Линейные программы".
 * Задача №5.
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Linear05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t = 2_000_000_000_000L;
		long hours = t / 3600;
		int minutes = (int) (t%3600) / 60;
		int seconds = (int) (t%60);
		System.out.println("T=" + t + " seconds." + '\n' + "equals" + '\n' + hours + " hours" + '\n' + minutes + " minutes" + '\n' + seconds + " seconds");
	}
}
