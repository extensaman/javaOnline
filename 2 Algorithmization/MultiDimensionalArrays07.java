package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №7.
* Сформировать квадратную матрицу порядка N по правилу
* A[I,J] = sin ( (pow(I,2) - pow(J,2) / N)
* и подсчитать количество положительных элементов в ней.
*/

public class MultiDimensionalArrays07 {

	public static void main(String[] args) {
		
		// Generate array dimension
		int m;
		m = (int) (Math.random() * 10.0) + 2;
		
		//Create an array
		double[][] a = new double [m][m];
		
		int counter = 0; // Counter of positive elements
		
		// Fill the array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				a[i][j] = Math.sin	( 
								( 
									Math.pow((i + 1), 2.0) - Math.pow((j + 1), 2.0) 
								) / m 
							);
				// Count amount of positive elements
				if (a[i][j] > 0.0) {
					counter++;
				}
			}
		}
		
		// Print results
		System.out.println("Array " + m + 'x' + m + " is"); 
		printArray(a);
		System.out.println("\nAmount of positive elements is " + counter);
	}
	
	public static void printArray (double[][] mas) {
		
		if (mas == null) {
			System.out.println("Bad array reference.");
			return;
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%+.4f   ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
