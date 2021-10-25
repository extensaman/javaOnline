package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №5.
* Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
* которое меньше максимального элемента массива, но больше всех других элементов).
*/

public class Decomposition05 {

	public static void main(String[] args) {

		int n; // Количество элементов массива
		
		n = inputIntMoreOne ("Введите размер массива (> 1)");
		
		int[] mas = generateRandomArray (n, 100);
		
		printArray("Сгенерирован массив со следующими элементами", mas);
		
		Max max = getSecondMax(mas);
		
		System.out.println(max);
		
	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (> 1), введенное с клавиатуры
	
	public static int inputIntMoreOne (String message) {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		int n;
		
		while (!sc.hasNextInt() || (n = sc.nextInt()) <= 1) {
			
			System.out.println("Введите целое положительное число (> 1):");
			sc.nextLine();
			
		}
		
		return n;
	}
	
	///////////////////////////////////////////////////////////
	// Создает массив размером 'size' и заполняет его случайными целыми числами от -limit до +limit 
	
	public static int[] generateRandomArray (int size, int limit) {
		
		int[] mas = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			mas[i] = (int) (Math.random() * limit * 2.0) - limit;
			
		}
		
		return mas;
	}
	
	///////////////////////////////////////////////////////////
	// Выводит в консоль сообщение 'message' и печатает элементы массива 'mas'
	
	public static void printArray (String message, int[] mas) {
		
		System.out.println(message);
		
		for (int element : mas) {
			
			System.out.printf("%+6d", element);
		}
	}
	
	///////////////////////////////////////////////////////////
	// Осуществляет поиск второго максимального элемента.
	// В случае нахождение такого элемента возвращается объект класса Max, содержащий данный элемент
	// В противном случае возвращается объект класса Max, инициаизированный информацией об отсутствии такого элемента
	
	public static Max getSecondMax (int[] mas) {
		
		sortArray(mas, -1);
		
		int max = mas[0];
		
		for (int i = 1; i < mas.length; i++) {
			
			if (mas[i] < max) {
				
				return new Max (mas[i], true, "\nЧисло меньше максимального элемента массива = ");
			}
		}
		
		return new Max (0, false, "\nЧисла меньше максимального элемента массива, но больше всех других элементов, не существует");
	}
	
	
	///////////////////////////////////////////////////////////
	// Осуществляет сортировку массива 'mas' в порядке 'order' (-1/+1)
	
	public static void sortArray (int[] mas, int order) {
		
		boolean isNotSorted = true;
		int sortedCount = 0;
		
		while (isNotSorted) {
			
			isNotSorted = false;
			
			for (int i = 0; i < mas.length - 1 - sortedCount; i++) {
				
				if (mas[i] * order > mas[i + 1] * order) {
					
					isNotSorted = true;
					
					int temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
				}
			}
			
			sortedCount++;
		}
	}
}

class Max {
	
	private int max;
	private boolean exist;
	private String message;
	
	Max (int max, boolean exist, String message) {
		
		this.max = max;
		this.exist = exist;
		this.message = message;
	}
	
	@Override
	public String toString() {
		
		if (exist) {

			return message + max;

		} else {
			
			return message;
		}
	}
	
}