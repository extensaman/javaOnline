package by.home.algorithm.decomp;

import java.util.Scanner; 

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №10.
* Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
*/

public class Decomposition10 {

	public static void main(String[] args) {

		long n;
		n = inputLongMoreZero ("Enter positive integer:");
		
		int[] mas = new int[19]; //19 - максимальное количество цифр в числе типа 'long'
		
		int digitCount;
		digitCount = fillDigitArray (n, mas);
		
		printArray ("\nArray with digits of number " + n + " is next", mas, digitCount);

	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (> 0), введенное с клавиатуры 
	
	public static long inputLongMoreZero (String message) {
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner (System.in);
		
		long m;
		System.out.println(message);
		
		while (!sc.hasNextLong() || (m = sc.nextLong()) <= 0) {
			
			System.out.println("Wrong data input. Enter an integer (1 <= .. <= " + Long.MAX_VALUE + ")\n" + message);
			sc.nextLine();
		}
		
		return m;
	}
	
	///////////////////////////////////////////////////////////
	// Заполняет массив 'mas' цифрами числа 'n' (начиная с последней цифры)
	// Возвращает количество цифр в числе 'n'
	
	public static int fillDigitArray (long n, int[] mas) {
		
		int index = 0;
		
		while (n > 0L) {
			
			mas[index++] = (int) (n % 10L);
			n /= 10;
			
		}
		
		return index;
	}
	
	///////////////////////////////////////////////////////////
	// Выводит на печать сообщение message, а также элементы массива 'mas' начиная с элемента с индексом 'count - 1' и до элемента с индексом 0
	// 
	
	public static void printArray (String message, int[] mas, int count) {
		
		System.out.println(message);
		
		for (int i = count - 1; i >= 0; i--) {
			
			System.out.printf("%3d", mas[i]);
			
		}
	}
}
