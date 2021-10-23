package by.home.algorithmization.multidimensionalarrays;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №2.
* Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
*/

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {

		// Generate array dimensions 
		int m = (int) (Math.random() * 8.0) + 2;
		System.out.println("Array " + m + 'x' + m + ':');
		
		// Create an array
		int[][] a = new int[m][m];
		
		// Generate array elements
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < m; j++) {
				
				a[i][j] = (int) (Math.random() * 10.0) - 5;
			}
		}
		
		printArray(a);
		
		// Print diagonal elements  
		System.out.println("\nDiagonal elements are ");
		for (int i = 0; i < a.length; i++) {
			
			System.out.printf("%4d", a[i][i]);
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
