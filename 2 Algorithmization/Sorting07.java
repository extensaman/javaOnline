package by.home.algorithmization;

import java.util.Arrays;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировки".
* Задача №7.
* Пусть даны две неубывающие последовательности действительных чисел 
* a1 <= a2 <= .. <== an и b1 <= b2 <= .. <= bm. Требуется указать те места, 
* на которые нужно вставлять элементы последовательности b1 <= b2 <= .. <= bm 
* в первую последовательность так, чтобы новая последовательность 
* оставалась возрастающей.
*/

public class Sorting07 {

	public static void main(String[] args) {
		
		int m; // dimension of array 'a'
		m = (int) (Math.random() * 5.0) + 2;
		
		int n; // dimension of array 'b'
		do {
			n = (int) (Math.random() * 5.0) + 2;
		} while (m == n);
		
		double[] a = new double[m]; 
		double[] b = new double[n];
		
		// Generate elements for arrays 'a' and 'b' (and they are not sorted)
		for (int i = 0; i < m; i++) {
			a[i] = (Math.random() * 30.0) - 15.0;
		}
		
		for(int i = 0 ; i < n; i++) {
			b[i] = (Math.random() * 30.0) - 15.0;
		}
		
		// Sort arrays
		Arrays.sort(a);
		Arrays.sort(b);
		
		// Print arrays 'a' and 'b'
		System.out.println("Array \'a\' (length = " + m + ") is");
		printArray(a);
		
		System.out.println("\nArray \'b\' (length = " + n + ") is");
		printArray(b);

		System.out.println();
		
		// Main part
		for (int i = 0, j = 0; i < n; i++) { // iterate in 'b'-array
			
			for ( ; j < m; j++) { // iterate in 'a'-array
				
				if (b[i] < a[j]) {
					System.out.println("b[" + i + "] insert to " + j + " position of \'a\' array.");
					break; // take next 'b'-array element if insertion position was found
				} 
			}
			
			if (j == m) { // insertion to the end of 'a'-array
				
				System.out.println("b[" + i + "] insert to " + j + " position of \'a\' array.");
			}
		}
	}
	
	public static void printArray (double[] mas) {
		
		if (mas == null) {
			System.out.println("Bad array reference.");
			return;
		}
		
		for (double i : mas) {
			System.out.printf("%+7.2f", i);
		}
		System.out.println();
	}
}
