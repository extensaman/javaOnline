package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №16.
* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
* Определить также, сколько четных цифр в найденной сумме. 
* Для решения задачи использовать декомпозицию.
*/

public class Decomposition16 {

	public static void main(String[] args) {

		int n;
		n = inputIntInRange("Enter n:", 1, 19); // В 'long' максимум 19 цифр

		for () {
			
			if (CountDigitNumber(i, ODD) == n) {
				
				sum += i;
			}
		}
	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (low <= .. <= high), введенное с клавиатуры 
	
	public static int inputIntInRange (String message, int low, int high) {
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner (System.in);
		
		int m;
		System.out.println(message);
		
		while (!sc.hasNextInt() || (m = sc.nextInt()) < low || m > high) {
			
			System.out.println("Wrong data input. Enter an integer (" + low + " <= .. <= " + high + ")\n" + message);
			sc.nextLine();
		}
		
		return m;
	}
}

