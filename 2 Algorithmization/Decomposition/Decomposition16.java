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

enum SearchType {
	ODD,
	EVEN;
}

public class Decomposition16 {

	public static void main(String[] args) {

		int n;
		n = inputIntInRange("Enter n:", 1, 19); // В 'long' максимум 19 цифр

		long low;
		low = (long) Math.pow (10.0, n - 1);
		
		long high;
		if (n == 19) {
			
			high = Long.MAX_VALUE;
			
		} else {
			
			high = (long) Math.pow(10.0, n) - 1L;
		}

		long sum = 0L;
		
		for (long i = low; i <= high; i++) {
			
			if (CountDigitInNumber(i, SearchType.ODD) == n) {
				
				sum += i;
				
				System.out.println(i);
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
	
	public static int CountDigitInNumber (long n, SearchType type) {
		
		int digitNumber = 0;
		
		while (n != 0L) {
			
			boolean isFounded = isOdd ((int) (n % 10));
			
			if (type == SearchType.EVEN) { 
				
				isFounded = !isFounded;
				
			}
			
			if (isFounded) {
				
				digitNumber++;
			}
			
			n /= 10;
		}
		
		return digitNumber;
	}
	
	public static boolean isOdd (int digit) {
		
		if (digit % 2 == 0) {
			
			return false;
		}
		
		return true;
	}
}

