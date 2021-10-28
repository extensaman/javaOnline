package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №13.
* Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
* Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
* Для решения задачи использовать декомпозицию.
*/

public class Decomposition13 {

	public static void main(String[] args) {

		int n;
		n = inputIntMoreTwo("Enter \'n\':");
		
		int[] array0 = createSet (n);
		
		printArray ("Set is", array0);
		
		int[] array1 = createPrimeSet (array0);
		
		printArray ("PrimeSet is", array1);
		/*
		int[] array2 = createTwinPrimeSet (array1);
		
		printArray ("TwinPrimeSet is", array2);*/
	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (2 < .. <= Long.MAX_VALUE / 2), введенное с клавиатуры 
	
	public static int inputIntMoreTwo (String message) {
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner (System.in);
		
		int m;
		System.out.println(message);
		
		while (!sc.hasNextInt() || (m = sc.nextInt()) <= 2 || m > Integer.MAX_VALUE / 2) {
			
			System.out.println("Wrong data input. Enter an integer (2 < .. <= " + (Integer.MAX_VALUE / 2) + ")\n" + message);
			sc.nextLine();
		}
		
		return m;
	}
	
	public static int[] createSet (int n) {
		
		int[] mas = new int[n + 1];
		
		for (int i = 0; i < mas.length; i++) {
			
			mas[i] = n++;
		}
		
		return mas;
	}
	
	public static int[] createPrimeSet (int[] mas) {
		
		int primeCount = 0;
		
		for (int i = 0; i < mas.length; i++) {
			
			if (isPrime (mas[i])) {
				
				primeCount++;
			}
		}
		
		int[] primeSet = new int[primeCount];
		
		int index = 0;
		
		for (int i = 0; i < mas.length; i++) {
			
			if (isPrime (mas[i])) {
				
				primeSet[index++] = mas[i];
			}
		}
		
		return primeSet;
	}
	
	public static boolean isPrime (int n) {
		
		for (int i = 2; i < n; i++) {
			
			if (n % i == 0) {
				
				return false;
			}
		}
		
		return true;
	}
	
	///////////////////////////////////////////////////////////
	// Печатает в консоль сообщение 'message' и массив 'a'
	
	public static void printArray (String message, int[] a) {

		if (a == null || message == null) {
			
			System.out.println ("Bad reference in \'void printArray (String message, int[] a)\'\n");
			return;
		}
		
		System.out.println(message);

		for (int i = 0; i < a.length; i++) {

			System.out.printf("%d  ", a[i]);
			
			if (i % 10 == 0) {
				
				System.out.println();
			}

		}
	}
}
