package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №15.
* Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). 
* Для решения задачи использовать декомпозицию.
*/

public class Decomposition15 {

	public static void main(String[] args) {
		
		int n;
		n = inputIntInRange("Enter n:", 2, 9); // Если больше 9 цифр в числе, то строго возрастающей последовательности не будет (последнее число это 123_456_789)
		
		int[] mas = createIncreaseNumberArray(n);
		
		printArray ("Result is", mas);
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
	
	///////////////////////////////////////////////////////////
	// Возвращает созданный массив, содержащий n-значные числа, цифры в которых образуют строго возрастающую последовательность
	
	public static int[] createIncreaseNumberArray (int n) {
		
		int[] mas = new int[10 - n];
		int[] digit = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int index = 0;
		
		for (int i = 0; i < digit.length - n + 1; i++) {
			
			int sum = 0;
			
			for (int j = i; j < i + n; j++) {
				
				sum += digit[j] * Math.pow (10.0, (n - 1 - (j - i) % n) );
			}
			
			mas[index++] = sum;
		}
		
		return mas;
		
	}
	
	///////////////////////////////////////////////////////////
	// Выводит на печать сообщение message, а также элементы массива 'mas' начиная с элемента с индексом 'count - 1' и до элемента с индексом 0
	
	public static void printArray (String message, int[] mas) {
		
		System.out.println(message);
		
		for (int element : mas) {
			
			System.out.printf("%d  ", element);
			
		}
	}
}
