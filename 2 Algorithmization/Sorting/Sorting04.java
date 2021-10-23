package by.home.algorithmization.sorting;

import java.util.Arrays;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировки".
* Задача №4.
* Сортировка обменами. Дана последовательность чисел a1 < a2 < a3 ... < an. 
* Требуется переставить числа в порядке убывания. 
* Для этого сравниваются два соседних числа ai и ai+1. 
* Если ai > ai+1 , то делается перестановка. 
* Так продолжается до тех пор, пока все элементы не станут расположены в порядке убывания.
* Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

public class Sorting04 {

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
		
		
		// DESC-sort array using "bubble"-algorithm
		boolean isNotSorted = true;
		int sortedElementCount = 0;
		int swapCount = 0;
		
		while (isNotSorted) {
			
			isNotSorted = false;
			
			for (int i = 0; i < n - 1 - sortedElementCount; i++) {
				
				if (a[i] < a[i + 1]) {
					
					isNotSorted = true;
					
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapCount++;
				}
			}
			
			sortedElementCount++;
		}
		
		System.out.println("\nSorted array is");
		printArray(a);
		
		System.out.println("\nCount of replacements = " + swapCount);
		
	}
	
	public static void printArray(int[] a) {
		
		for (int element : a) {
			
			System.out.printf("%+6d", element);
		}
	}

}
