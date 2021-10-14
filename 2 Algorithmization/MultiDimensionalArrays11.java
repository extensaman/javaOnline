package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №11.
* Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
* которых число 5 встречается три и более раз.
*/

public class MultiDimensionalArrays11 {

	public static void main(String[] args) {

		// Generate array dimensions
		int m = 10;
		int n = 20;

		// Create an array
		int[][] a = new int[m][n];

		// Generate array elements
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) (Math.random() * 16.0);
			}
		}

		// Print array
		System.out.println("Array " + m + 'x' + n + " is\n");
		printArray(a);
		
		// Search and count '5' 
		System.out.println("\nThree or more \'5\' are founded in ...");
		int fiveCounter = 0;
		boolean isMoreThanThreeFounded = false;
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (a[i][j] == 5) {
					fiveCounter++;
				}
			
			}
			
			if (fiveCounter > 2) {
				System.out.println("row #" + (i+1));
				isMoreThanThreeFounded = true;
			}
			
			fiveCounter = 0;
		}
		
		// If three or more '5' not founded in a row
		if (!isMoreThanThreeFounded) {
			System.out.println("No such row");
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
