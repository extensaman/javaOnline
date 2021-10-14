package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №12.
* Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
*/

public class MultiDimensionalArrays12 {

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

		// Print original array
		System.out.println("Original array " + m + 'x' + n + " is\n");
		printArray(a);
		
		// Sort the array (ASC)
		for (int i = 0; i < a.length; i++) {
			sortArray(a[i], 1);
		}
		
		// Print ASC-sorted array
		System.out.println("\nThe array with sorted (ASC order) rows is");
		printArray(a);
		
		// Sort the array (DESC)
		for (int i = 0; i < a.length; i++) {
			sortArray(a[i], -1);
		}
		
		// Print DESC-sorted array
		System.out.println("\nThe array with sorted (DESC order) rows is");
		printArray(a);

	}
	
	public static void sortArray(int[] a, int order) {
		
		boolean isNotSorted = true;
		
		while (isNotSorted) {
			
			isNotSorted = false;
			
			for (int i = 0; i < a.length - 1; i++) {
				
				if (a[i] * order > a[i+1] * order) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					isNotSorted = true;
				}
			}
		}
		
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
