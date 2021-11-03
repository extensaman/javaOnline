package by.home.string.asarray;

import java.util.Scanner;

/*
* Этап "Strings and basics of of text processing"
* Раздел "Работа со строкой как с массивом символов".
* Задача №03.
* В строке найти количество цифр
*/

public class AsArray03 {

	public static void main(String[] args) {
		
		String str = enterString("Enter a string: ");
		
		int digitCount = calculateDigitCount (str);
		
		System.out.println("Digit count in " + str + " is " + digitCount);

	}

	public static String enterString (String message) {
		@SuppressWarnings ("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println(message);
		
		return sc.nextLine();
	}
	
	public static int calculateDigitCount (String str) {
		
		char[] mas = str.toCharArray();
		
		int counter = 0;
		
		for (int i = 0; i < mas.length; i++) {
			
			if (Character.isDigit(mas[i])) {
				
				counter++;
				
			}
		}
		
		return counter;
	}
}
