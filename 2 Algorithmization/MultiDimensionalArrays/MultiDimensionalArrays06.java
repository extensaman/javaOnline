package by.home.algorithmization.multidimensionalarrays;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №6.
* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
* 1  1  1 ... 1  1  1
* 0  1  1 ... 1  1  0
* 0  0  1 ... 1  0  0
* .  .  . ...  . .  .
* 0  0  1 ... 1  0  0
* 0  1  1 ... 1  1  0
* 1  1  1 ... 1  1  1
*/

public class MultiDimensionalArrays06 {

	public static void main(String[] args) {

		// Generate array dimension 
		int m = 0;
		
		do {
			m = (int) (Math.random() * 10.0) + 2;
			
		} while (m % 2 != 0);
		
		
		// Create an array
		int[][] a = new int[m][m];
		
		// Fill upper part of the array
		for (int i = 0; i < a.length / 2; i++) {
			
			for (int j = i; j < a.length - i; j++) {
				
				a[i][j] = 1;
			}
		}
		
		// Fill lower part of the array
		for (int i = a.length - 1; i >= a.length / 2; i--) {
			
			for (int j = i; j >= a.length - i - 1; j--) {
				
				a[i][j] = 1;
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
