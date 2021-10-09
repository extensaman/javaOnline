package by.home.algorithmization;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №5.
* Даны целые числа а1 ,а2 ,..., аn . 
* Вывести на печать только те числа, для которых аi > i.
*/

public class OneDimensionalArrays05 {

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
		
		// Fill the array with integers from -100 to 100 and print it
		System.out.println("The next is our array:");
				
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 200.0) - 100;
			System.out.printf("a[%d]=%d  ", i + 1, a[i]);
		}
		
		//Print results
		System.out.println("\nThe result is:");
			
		for (int i = 0; i < n; i++) {
			if (a[i] > i + 1) {
				System.out.printf("a[%d]=%d  ", i + 1, a[i]);
			} else {
				System.out.printf("          ");
			}
		}
	}

}
