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
		
		int[] d = createRandomArray(n, 10); // 
		
		printArray("Array \'D\':", d);
		
		int[] range = createRangeForThreeElememnt (n); 
		
		int result = sumThreeSequential (d, range);
		
		System.out.println("Sum of elements between " + range[0] + " and " + range[1] + " = " + result);
		

	}

	///////////////////////////////////////////////////////////
	// Создает массив размером 'size' и заполняет его случайными целыми числами от -limit до +limit 
	
	public static int[] createRandomArray (int size, int limit) {
		
		int[] mas = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			mas[i] = (int) (Math.random() * 2.0 * limit) - limit;
		}
		
		return mas;
	}
	
	///////////////////////////////////////////////////////////
	// Выводит в консоль сообщение 'message' и печатает номера элементов и сами элементы массива 'mas'
	
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
	
	///////////////////////////////////////////////////////////
	// Возвращает массив из 2-х элементов, содержащего номера начального и конечного элемента 
	// для выборки 3-х элементов из массива размером size
	
	public static int[] createRangeForThreeElememnt (int size) {
		
		int k;
		int m;

		while (true) {

			k = inputIntInRange("\nEnter \'k\':", 1, size);

			m = inputIntInRange("Enter \'m\':", k, size);
			
			if (m - k < 2) {
				
				System.out.println("Range between " + k + " and " + m + " is too small. Try again");
				
			} else {
				
				if (m - k > 2) {
					
					System.out.println("Range between " + k + " and " + m + " is too big. Try again");
					
				} else {
					
					break;
				}
			}
		}
		
		return new int[] {k, m};
	}
	
///////////////////////////////////////////////////////////
// Возвращает целое положительное число в диапазоне min <= .. <= max, введенное с клавиатуры
	
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
	
	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число равное сумме трех элементов массива 'd' с номерами от range[0] до range[1]
	
	public static int sumThreeSequential (int[] d, int[] range) {
		
			int sum = 0;
			
			for (int i = range[0] - 1; i < range[1]; i++) {
				sum += d[i];
			}
			
			return sum;

	}
}
