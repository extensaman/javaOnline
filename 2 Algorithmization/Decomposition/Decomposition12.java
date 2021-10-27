package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №12.
* Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
* являются числа, сумма цифр которых равна К и которые не больше N.
*/

public class Decomposition12 {

	public static final int START_ARRAY_SIZE = 10;
	
	public static void main(String[] args) {

		int k;
		k = inputIntMoreZero("Enter K:");
		
		int n;
		n = inputIntMoreZero("Enter N");
		
		int[] a = createArray (k, n);
		
		printArray("\nArray is", a);
		
	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (> 0), введенное с клавиатуры
	
	public static int inputIntMoreZero (String message) {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		int n;
		
		while (!sc.hasNextInt() || (n = sc.nextInt()) <= 0) {
			
			System.out.println("Введите целое положительное число (> 0):");
			sc.nextLine();
			
		}
		
		return n;
	}

	///////////////////////////////////////////////////////////
	// Создает массив, элементами которого являются числа, сумма цифр которых равна 'k' и которые не больше 'n'
	
	public static int[] createArray (int k, int n) {
		
		int[] mas = new int[START_ARRAY_SIZE];
		
		int currentArrayLimit = START_ARRAY_SIZE;
		
		int index = 0;
		
		// Чтобы не запустить for (1) в зацикливание, "вручную" отрабатывааем Integer.MAX_VALUE
		if (n == Integer.MAX_VALUE) {
			
			--n;
			
			if (digitSum(Integer.MAX_VALUE) == k) {
				
				mas[index++] = Integer.MAX_VALUE;
			}
		}
		
		for (int i = 1; i <= n; i++) { // (1)
			
			if (digitSum(i) == k) {
				
				// Если превышам размер текущего массива, то увеличиваем его в 2 раза
				if (index == currentArrayLimit) {
					
					currentArrayLimit *= 2;
					
					mas = resizeArray (mas, currentArrayLimit);
					
				}
				
				mas[index++] = i;
			}
			
		}
		
		// Если остались незаполненные ячейки, то 'отрезаем' их
		if (index < currentArrayLimit) { 
			
			mas = resizeArray (mas, index);
			
		}
		
		return mas;
	}
	
	///////////////////////////////////////////////////////////
	// Возвращает сумму цифр числа 'number'
	
	public static int digitSum (int number) {
		
		int sum = 0;
		
		while (number != 0) {
			
			sum += number % 10;
			number /= 10;
		}
		
		return sum;
	}
	
	// Возвращает новый массив с размером 'newSize', содержащий элементы массива 'mas' 
	// Если 'newSize' больше размера 'mas', то остальное пространство заполняется нулями
	// Если 'newSize' меньше размера 'mas', то не вошедшие элементы не копируются в новый массив
	
	public static int[] resizeArray (int[] mas, int newSize) {
		
		int[] newMas = new int[newSize];
		
		int limit;
		
		if (newSize > mas.length) {
			
			limit = mas.length;
			
		} else {
			
			limit = newSize;
		}
		
		for (int i = 0; i < limit; i++) {
			
			newMas[i] = mas[i];
			
		}
		
		return newMas;
	}
	
	///////////////////////////////////////////////////////////
	// Выводит в консоль сообщение 'message' и печатает элементы массива 'mas'
	
	public static void printArray (String message, int[] mas) {
		
		System.out.println(message);
		
		for (int i = 0; i < mas.length; i++) {
			
			if (i % 10 == 0) {
				
				System.out.println();
				
			}
			
			System.out.printf("%d  ", mas[i]);
		}
	}
}
