package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №1.
* Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел
* НОК (А, В) = А * В / НОД (А, В)
*/

public class Decomposition01 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = inputInt ("Введите A: ");
		b = inputInt ("Введите B: ");
		
		long result;

		result = nok (a, b);
		
		if (result <= 0) {
			
			System.out.println("\nToo big result. \'long\' type overflow. Program stopped.");
		
		} else {
			
			System.out.println("НОК (" + a + ", " + b + ") = " + result);
		}
		
	}
	
	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число, введенное с клавиатуры 
	
	public static int inputInt (String message) {
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner (System.in);
		
		int m;
		System.out.println(message);
		
		while (!sc.hasNextInt() || (m = sc.nextInt()) <= 0) {
			
			System.out.println("Wrong data input. Enter an integer (0 < .. < " + Integer.MAX_VALUE + ")\n" + message);
			sc.nextLine();
		}
		
		return m;
	}
	
	///////////////////////////////////////////////////////////
	// Нахождение НОК чисел 'a' и 'b'
	
	public static long nok (int a, int b) {
		
		if (a > b) {
			
			return (long) a * b / nod(a, b);
			
		} else {
			
			return (long) a * b / nod(b, a);
		}
	}
	
	///////////////////////////////////////////////////////////
	// Нахождение НОД чисел 'a' и 'b'
	
	public static int nod (int a, int b) {
		
		int ost = a % b;
		
		if (ost == 0) {
			
			return b;
			
		} else {
			
			return nod (b, ost);
		}
	}
	
}
