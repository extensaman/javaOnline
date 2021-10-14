package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №10.
* Найти положительные элементы главной диагонали квадратной матрицы.
*/

public class MultiDimensionalArrays10 {

	public static void main(String[] args) {
		
		// Generate array dimensions 
		int m = 0;
		do {
			m = (int) (Math.random() * 10.0) + 2;
		} while (m % 2 != 0);
		
		//Create an array
		int[][] a = new int[m][m];

		// Generate array elements
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = (int) (Math.random() * 10.0) - 5;
			}
		}

		// Print array
		System.out.println("Array " + m + 'x' + m + " is\n");	
		printArray(a);
		
		// Print positive elements of the main diagonal
		System.out.println("\nPositive elements of the main diagonal are");
		for (int i = 0; i < m; i++) {
			if (a[i][i] > 0) {
				System.out.printf("%4d", a[i][i]);
			}
		}
	
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
}
