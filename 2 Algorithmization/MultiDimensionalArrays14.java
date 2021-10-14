package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №14.
* Сформировать случайную матрицу m x n, 
* состоящую из нулей и единиц, причем в каждом столбце число 
* единиц равно номеру столбца.
*/

public class MultiDimensionalArrays14 {

	public static void main(String[] args) {
		
		// Generate array dimensions
		int m;
		m = (int) (Math.random() * 8.0) + 2;
		
		int n;
		while (true) {
			n = (int) (Math.random() * 8.0) + 2;
			if (n <= m) {
				break;
			} else {
				System.out.println("Array " + m + 'x' + n + " is not valid. Try again.");
			}
		}
		
		// Create an array
		int[][] a = new int[m][n];
		
		System.out.println("Array " + m + 'x' + n + ':');
		
		// Fill the array
		int index = 0;
		for (int i = 0; i < n; i++) {
			int count = i + 1;
			while (count != 0) {
				do {
					index = (int) (Math.random() * m);
				} while (a[index][i] == 1);
				
				a[index][i] = 1;
				count--;
			}
		}
		
		// Print results
		printArray(a);
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
