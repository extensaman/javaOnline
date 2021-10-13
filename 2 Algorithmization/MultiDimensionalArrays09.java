package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №9.
* Задана матрица неотрицательных чисел. 
* Посчитать сумму элементов в каждом столбце. 
* Определить, какой столбец содержит максимальную сумму.
*/

public class MultiDimensionalArrays09 {

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
				a[i][j] = (int) (Math.random() * 10.0);
			}
		}
		
		printArray(a);	
		
		// Create an array for array 'a' columns' sums 
		int[] columnSum = new int [n];
		
		int maxSum = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				columnSum[j] += a[i][j];
			}
			if (columnSum[j] > maxSum) {
				maxSum = columnSum[j];
			}
		}
		
		// Print results
		System.out.println("Sums of every column are");
		for (int i = 0; i < columnSum.length; i++) {
			System.out.printf("%4d", columnSum[i]);
		}
		
		System.out.println("\nMaximum sum is " + maxSum);

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
}
