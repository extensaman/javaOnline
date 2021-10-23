package by.home.algorithmization.multidimensionalarrays;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №3.
* Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

public class MultiDimensionalArrays03 {

	public static void main(String[] args) {

		// Generate array dimensions 
		int m = (int) (Math.random() * 8.0) + 2;
		int n = (int) (Math.random() * 8.0) + 2;
		
		System.out.println("Array " + m + 'x' + n + ':');
		
		// Create an array
		int[][] a = new int[m][n];
		
		// Generate array elements
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				a[i][j] = (int) (Math.random() * 10.0) - 5;
			}
		}
		
		printArray(a);	
		
		// Enter row number for print
		int k;
		do {
			
			k = inputInt("Enter row number for print (1 <= k <= " + m + "):");
			
		} while (k < 1 || k > m);
		
		// Enter column number for print
		int p;
		do {
			
			p = inputInt("Enter column number for print (1 <= p <= " + n + "):");
			
		} while (p < 1 || p > n);
		
		// Print results
		printArrayRow(a, k);
		
		printArrayColumn(a, p);

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
	
	public static void printArray (int[][] mas) {
		
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
	
	public static void printArrayColumn (int[][] mas, int columnNumber) {
		
		if (mas == null) {
			
			System.out.println("Bad array reference.");
			return;
		}
		
		System.out.println("Column number " + columnNumber + " is");
		
		for (int i = 0; i < mas.length; i++) {
			
			System.out.printf("%4d", mas[i][columnNumber-1]);
		}
		
		System.out.println();
	}
	
	public static void printArrayRow (int[][] mas, int rowNumber) {
		
		if (mas == null) {
			
			System.out.println("Bad array reference.");
			return;
		}
		
		System.out.println("Row number " + rowNumber + " is");
		
		for (int i = 0; i < mas[rowNumber-1].length; i++) {
			
			System.out.printf("%4d", mas[rowNumber-1][i]);
		}
		
		System.out.println();
	}
}
