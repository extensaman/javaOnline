package by.home.algorithmization;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №9.
* В массиве целых чисел с количеством элементов n 
* найти наиболее часто встречающееся число. 
* Если таких чисел несколько, то определить наименьшее из них.
*/

public class OneDimensionalArrays09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = 0; // Array size
		
		// Enter a size of array 
		System.out.println("Enter a size of array ( > 0 ): ");
		if (sc.hasNextInt() && (n = sc.nextInt()) > 0) {
			sc.close();
		} else {
			System.out.println("You entered wrong data. Program finished.");
			sc.close();
			return;
		}
		
		int[] a = new int[n];
		
		// Fill the array 'a' with integers from -5 to 5 and print it
		System.out.println("The next is our array:");
				
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 10.0) - 5;
			System.out.printf("a[%d]=%d  ", i, a[i]);
		}
		
		// Create and fill the array 'b' with frequencies
		int[] b = new int [n];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					b[i]++;
				}
			}
		}

		// Search the most frequently element 		
		int indexMaximum = 0;
		int maximumValue = b[0];
		int maximumCount = 1;
		for (int i = 1; i < n; i++) {
			
			if(b[i] > maximumValue) {
				indexMaximum = i;
				maximumValue = b[i];
				maximumCount = 1;
			} else {
				if (b[i] == maximumValue) {
					maximumCount++;
				}
			}
		}
		
		// Search minimum if the most frequently elements are more than 1
		if (maximumCount > 1) {
			for (int i = 0; i < n; i++) {
				if (b[i] == maximumValue && a[i] < a[indexMaximum]) {
					indexMaximum = i;
				}
			}
		}
		
		// Print results
		System.out.println("\nMost freaquently is " + a[indexMaximum] + " (counts = " + (b[indexMaximum] + 1) + ")");
	}

}
