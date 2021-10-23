package by.home.algorithmization.multidimensionalarray;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №15.
* Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class MultiDimensionalArrays15 {

	public static void main(String[] args) {

		// Generate array dimensions
		int m; // Number of rows
		m = (int) (Math.random() * 8.0) + 2;
		
		int n; // Number of columns
		n = (int) (Math.random() * 8.0) + 1;

		// Create an array
		int[][] a = new int[m][n];

		// Generate array elements
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				a[i][j] = (int) (Math.random() * 20.0) - 10;
			}
		}

		// Print original array
		System.out.println("Original array " + m + 'x' + n + " is");
		printArray(a);

		// Search for maximum element
		int maxArrayElement = a[0][0];
		
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (maxArrayElement < a[i][j]) {
					
					maxArrayElement = a[i][j];
				}
			}
		}
		
		// Replace odd elements with maximum element
		System.out.println("Maximium element is " + maxArrayElement);
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (a[i][j] % 2 != 0) {
					
					a[i][j] = maxArrayElement;
				}
			}
		}
		
		// Print resulting array
		System.out.println("Resulting array " + m + 'x' + n + " is");
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
