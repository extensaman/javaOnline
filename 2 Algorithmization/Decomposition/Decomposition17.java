package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №17.
* Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
* Сколько таких действий надо произвести, чтобы получился нуль? 
* Для решения задачи использовать декомпозицию.
*/

public class Decomposition17 {

	public static void main(String[] args) {

		int n;
		n = inputIntInRange("Enter n:", 0, Integer.MAX_VALUE - 1);
		
		int count;
		count = calculateIteration (n);
		
		System.out.println("Count of iterations = " + count);

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
	
	public static int calculateIteration (int n) {
		
		int count = 0;
		
		while ( n != 0 ) {
			
			//System.out.println(n);
			n -= calculateDigitSum (n);
			count++;
		}
		
		return count;
	}
	
	public static int calculateDigitSum (int n) {
		
		int sum = 0;
		
		while (n != 0) {
			
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}
