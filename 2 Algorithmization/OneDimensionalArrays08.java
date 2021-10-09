package by.home.algorithmization;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №8.
* Дана последовательность целых чисел а1 ,а2 ,..., аn .
* Образовать новую последовательность, выбросив из 
* исходной те члены, которые равны 
* min(а1 ,а2 ,..., аn)
*/

public class OneDimensionalArrays08 {

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
			System.out.printf("a[%d]=%d  ", i + 1, a[i]);
		}
		
		// Look for minimal elements and its count
		int minimalElement = a[0];
		int minimalCount = 0;
		
		for (int element : a) {
			if (element == minimalElement) {
				minimalCount++;
			}
			if (element < minimalElement) {
				minimalElement = element;
				minimalCount = 1;
			}
		}
		
		// Finish if all elements are equal
		if (minimalCount == n) {
			System.out.println("\nAll elemnts of this array are equal.\nThe resulting array is empty.");
			return;
		}
		
		// Create and fill new array 'b'
		int sizeB = n - minimalCount;
		int[] b = new int[sizeB];
		int indexB = 0;
		
		for (int element : a) {
			if (element != minimalElement) {
				b[indexB++] = element;
			}
		}
		
		// Print results
		System.out.println("\nThe result is:");
		for (int i = 0; i < sizeB; i++) {
			System.out.printf("b[%d]=%d  ", i + 1, b[i]);
		}
	}

}
