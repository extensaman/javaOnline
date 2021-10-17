package by.home.algorithmization;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировка".
* Задача №1.
* Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
* Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого
*/

public class Sorting01 {

	public static void main(String[] args) {
		
		int m; // dimension of array 'a'
		m = (int) (Math.random() * 5.0) + 2;
		
		int n; // dimension of array 'b'
		do {
			n = (int) (Math.random() * 5.0) + 2;
		} while (m == n);
		
		int[] a = new int[m + n]; // allocate cells for 'b' array
		int[] b = new int[n];
		
		// Generate elements for arrays 'a' and 'b'
		for (int i = 0; i < m; i++) {
			a[i] = (int) (Math.random() * 30.0) - 15;
		}
		
		for(int i = 0 ; i < n; i++) {
			b[i] = (int) (Math.random() * 30.0) -15;
		}
		
		// Print arrays 'a' and 'b'
		System.out.println("Array \'a\' (length =" + m + ") is");
		for (int i = 0; i < m; i++) {
			System.out.printf("%+4d", a[i]);
		}
		
		System.out.println("\nArray \'b\' (length =" + n + ") is");
		printArray(b);
		
		int k; //  Place for put
		do {
			k = inputInt("Enter \'k\' (1 <= # <=" + m + "):");
		} while (k < 1 || k > m);
		
		int i;
		int counts;
		for (i = a.length - 1, counts = m - k; counts > 0; i--, counts--) {

			a[i] = a[i - n];
		}
		for (i = k; i < k + b.length; i++) {
			a[i] = b[i - k];
		}
		
		System.out.println("Resulting array is");
		printArray(a);
	}
	
	public static int inputInt (String message) {
		
		@SuppressWarnings ("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println(message);
		
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println ("You enetered wrong data. Try again.\n" + message);
		}
		
		return sc.nextInt();
	}

	public static void printArray (int[] mas) {
		
		if (mas == null) {
			System.out.println("Bad array reference.");
			return;
		}
		
		for (int i : mas) {
			System.out.printf("%+4d", i);
		}
		System.out.println();
	}
}
