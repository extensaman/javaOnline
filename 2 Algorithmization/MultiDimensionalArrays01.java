package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №1.
* Дана матрица. 
* Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
*/

public class MultiDimensionalArrays01 {

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
		
		// Search and print odd columns where first element more than the last one
		System.out.println("\nResult:");
		for (int i = 1; i < a[0].length; i += 2) {
			if (a[0][i] > a[a.length - 1][i]) {
				printArrayColumn(a, i);
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
	
	public static void printArrayColumn (int[][] mas, int columnIndex) {
		
		if (mas == null) {
			System.out.println("Bad array reference.");
			return;
		}
		
		System.out.println("Column with index " + columnIndex + ":");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i][columnIndex]);
		}
		System.out.println();
	}
}
