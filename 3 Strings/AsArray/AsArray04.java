package by.home.string.asarray;

import java.util.Scanner;

/*
* Этап "Strings and basics of of text processing"
* Раздел "Работа со строкой как с массивом символов".
* Задача №04.
* В строке найти количество чисел.
*/

public class AsArray04 {

	public static void main(String[] args) {

		String str = enterString("Enter a string: ");

		int numberCount = calculateNumberCount(str);

		System.out.println("Number count in " + str + " is " + numberCount);

	}

	/**
	* Возвращает введенную с консоли строку
	* @author extensaman
	* @version 1.0
	*/
	
	public static String enterString(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		if (message != null) {
			
			System.out.println(message);
		}

		return sc.nextLine();
	}

	/**
	* Возвращает количество чисел в строке 'str'
	* @author extensaman
	* @version 1.0
	*/
	
	public static int calculateNumberCount(String str) {

		if (str == null) {
			
			return 0;
			
		}
		
		char[] mas = str.toCharArray();

		int counter = 0;
		
		for (int i = 0; i < mas.length; i++) {

			if (Character.isDigit(mas[i])) {

				counter++;
				
				while (++i < mas.length && Character.isDigit(mas[i])) {}

			}
		}

		return counter;
	}

}
