package by.home.algorithmization.multidimensionalarrays;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №5.
* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
* 1  1  1 ... 1  1  1
* 2  2  2 ... 2  2  0
* 3  3  3 ... 3  0  0
* .  .  . ...  . .  .
* n-1 n-1 0 ... 0  0  0
* n  0  0 ... 0  0  0
*/

public class MultiDimensionalArrays05 {

	public static void main(String[] args) {
		
		// Generate array dimension 
		int m = 0;
		
		do {
			m = (int) (Math.random() * 8.0) + 2;
			
		} while (m % 2 != 0);
		
		
		// Create an array
		int[][] a = new int[m][m];
		
		// Fill the array
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length - i; j++) {
				
				a[i][j] = i + 1;
			}
		}
		
		// Print result
		System.out.println("Array " + m + 'x' + m + ":");
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
