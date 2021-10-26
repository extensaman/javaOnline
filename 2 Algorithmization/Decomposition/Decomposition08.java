package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №8.
* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
* Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
*/

public class Decomposition08 {

	public static void main(String[] args) {

		int n; // Размер массива 'd'
		
		n = (int) (Math.random() * 12.0) + 3; // Генерируем размер массива от 3 до 14
		
		int[] d = createRandomArray(n, 10);
		
		printArray("Array \'D\':", d);
		
		// FEATURE: надо сделать метод int[] createRangeForThreeElememnt (int size) который возвращает массив из 2-х элементов 
		
		int k;
		
		k = inputIntInRange("\nEnter \'k\':", 1, n);
		
		int m;
		
		m = inputIntInRange("Enter \'m\':", k, n);
		
		Result result = sumThreeSequential (d, k, m);
		
		System.out.println(result);
		

	}

	public static int[] createRandomArray (int size, int limit) {
		
		int[] mas = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			mas[i] = (int) (Math.random() * 2.0 * limit) - limit;
		}
		
		return mas;
	}
	
	public static void printArray (String message, int[] mas) {
		
		System.out.println(message);
		
		System.out.print("Number :");
		
		for (int i = 1; i <= mas.length; i++) {
			
			System.out.printf("%4d", i);
		}
		
		System.out.print("\nElement:");
		
		for (int element : mas) {
			
			System.out.printf("%+4d", element);
		}
	}
	
	public static int inputIntInRange (String message, int min, int max) {
		@SuppressWarnings ("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println(message);
		
		int n;
		
		while (!sc.hasNextInt() || (n = sc.nextInt()) < min || n > max) {
			
			System.out.println("Wrong data entered. Enter positive integer between " + min + " and " + max + ".\n" + message);
			sc.nextLine();
		}
		
		return n;
		
	}
	
	public static Result sumThreeSequential (int[] d, int k, int m) {
		
		if (m - k != 2) {
			
			return new Result (0, false, "(" + k + ", " + m + ") is bad range. Try again.");
			
		} else {
			
			int sum = 0;
			
			for (int i = k - 1; i < m; i++) {
				sum += d[i];
			}
			
			return new Result (sum, true, "Sum of elements between " + k + " and " + m + " = ");
		}
	}
}

class Result {
	
	private int sum;
	private boolean allRight;
	private String message;
	
	Result (int sum, boolean allRight, String message) {
		
		this.sum = sum;
		this.allRight = allRight;
		this.message = message;
		
	}
	
	@Override
	public String toString() {
		
		if (allRight) {
			
			return message + sum;
		}
		
		return message; 
	}
}
