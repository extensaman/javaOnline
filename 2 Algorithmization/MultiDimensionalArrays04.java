package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №4.
* Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
* 1,  2,   3, ..., n
* n, n-1, n-2,...  1
* 1,  2,   3, ..., n
* n, n-1, n-2,...  1
* .   .    .   .   .
* n, n-1, n-2,...  1
*/

public class MultiDimensionalArrays04 {

	public static void main(String[] args) {

		// Generate array dimensions 
		int m = 0;
		do {
			m = (int) (Math.random() * 10.0) + 2;
		} while (m % 2 != 0);
		
		//Create an array
		int[][] a = new int[m][m];
				
		// Fill even rows
		for (int i = 0; i < m; i += 2) {
			for (int j = 0; j < m; j++) {
				a[i][j] = j + 1;
			}
		}
		
		// Fill odd rows
		for (int i = 1; i < m; i += 2) {
			for (int j = 0; j < m; j++) {
				a[i][j] = m - j;
			}
		}
		
		System.out.println("Array " + m + 'x' + m + " is\n"); 
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
