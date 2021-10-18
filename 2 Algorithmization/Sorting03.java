package by.home.algorithmization;

import java.util.Arrays;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировки".
* Задача №3.
* Сортировка выбором. Дана последовательность чисел a1 < a2 < a3 ... < an. 
* Требуется переставить элементы так, чтобы они были расположены по убыванию. 
* Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, 
* а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. 
* Написать алгоритм сортировки выбором.
*/

public class Sorting03 {

	public static void main(String[] args) {
		
		int n; // dimension of array 'a' 
		n = (int) (Math.random() * 20.0) + 2;

		int[] a = new int[n];
		
		// Generate array's elements
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 20.0) - 10;
		}
		
		// ASC-sort array using built-in service
		Arrays.sort(a);
		
		// Print original array
		System.out.println("Original array is");
		printArray(a);
		
		
		// DESC-sort array using "selection"-algorithm
		for (int i = 0; i < n - 1; i++) {
			int indexOfMax = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] > a[indexOfMax]) {
					indexOfMax = j;
				}
			}
			int temp = a[i];
			a[i] = a[indexOfMax];
			a[indexOfMax] = temp;
		}
		
		System.out.println("\nSorted array is");
		printArray(a);
		
	}
	
	public static void printArray(int[] a) {
		
		for (int element : a) {
			System.out.printf("%+4d", element);
		}
	}

}
