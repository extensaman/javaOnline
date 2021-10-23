package by.home.algorithmization.onedimensionalarrays;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №10.
* Дан целочисленный массив с количеством элементов п. 
* Сжать массив, выбросив из него каждый второй 
* элемент (освободившиеся элементы заполнить нулями). 
* Примечание. Дополнительный массив не использовать.
*/

public class OneDimensionalArrays10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = 0; // Array size
		int[] a;
		
		// Enter a size of array 
		System.out.println("Enter a size of array ( > 0 ): ");
		if (sc.hasNextInt() && (n = sc.nextInt()) > 0) {
			
			a = new int[n];
			
		} else {
			
			System.out.println("You entered wrong data. Program finished.");
			return;
		}

		// Fill the array 'a' with integers from -5 to 5 and print it
		System.out.println("The next is our array:");
				
		for (int i = 0; i < n; i++) {
			
			a[i] = (int) (Math.random() * 10.0) - 5;
			System.out.printf("a[%d]=%+d  ", i, a[i]);
		}
		
		int indexTo = 1;
		int indexFrom = 2;
		
		// Move every second element
		while (indexFrom < n) {
			
			a[indexTo++] = a[indexFrom];
			indexFrom += 2;
		}
		
		// Rest places fill with zero
		while (indexTo < n) {
			
			a[indexTo++] = 0;
		}
		
		// Result printing
		System.out.println("\nThe resulting array is:");
		for (int i = 0; i < n; i++) {
			
			System.out.printf("a[%d]=%+d  ", i, a[i]);
		}
	}

}
