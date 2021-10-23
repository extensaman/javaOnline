package by.home.algorithmization.multidimensionalarrays;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №8.
* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
* на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
* пользователь с клавиатуры.
*/

public class MultiDimensionalArrays08 {

	public static void main(String[] args) {

		// Generate array dimensions
		int m = (int) (Math.random() * 8.0) + 2;
		int n = (int) (Math.random() * 8.0) + 2;

		// Create an array
		int[][] a = new int[m][n];

		// Generate array elements
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				a[i][j] = (int) (Math.random() * 10.0) - 5;
			}
		}

		System.out.println("Array " + m + 'x' + n + " is\n");
		printArray(a);
		
		// Enter a column #1 for swap
		int k;
		
		do {
			k = inputInt("\nEnter a column #1 for swap (1 <= # <= " + n + "):");
			
		} while (k < 1 || k > n);

		// Enter a column #2 for swap
		int p;
		
		do {
			p = inputInt("Enter a column #2 for swap (1 <= # <= " + n + "):");
			
		} while (p < 1 || p > n);
		
		// Transform # to indexes
		p--;
		k--;
		
		// Swap columns' elements
		int temp;
		for (int i = 0; i < a.length; i++) {
			
			temp = a[i][k];
			a[i][k] = a[i][p];
			a[i][p] = temp;
		}
		
		// Print results
		System.out.println("Result array is");
		printArray(a);
	}

	public static void printArray(int[][] mas) {

		if (mas == null) {
			
			System.out.println("Bad array reference.");
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j < mas[i].length; j++) {
				
				System.out.printf("%4d", mas[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static int inputInt (String message) {
		@SuppressWarnings ("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("You should enter an integer.\n" + message);
		}
		return sc.nextInt();
	}

}
