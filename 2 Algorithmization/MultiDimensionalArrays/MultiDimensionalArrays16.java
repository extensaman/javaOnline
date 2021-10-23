package by.home.algorithmization.multidimensionalarray;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Массивы массивов".
* Задача №16.
* Магическим квадратом порядка n называется квадратная матрица размера n x n, 
* составленная из чисел 1, 2, 3,..., n^2 так, что суммы по каждому столбцу, 
* каждой строке и каждой из двух больших диагоналей равны между
* собой. Построить такой квадрат.
* 
* !!! Done only for odd-size arrays
*/

public class MultiDimensionalArrays16 {

	public static void main(String[] args) {
		
		// Enter a size
		int n;
		
		do {
			n = inputInt("Enter a size of \'Magic square\' ( >= 3 ): ");
			
		} while (n < 3);

		int[][] a = new int[n][n];
		
		if ((n & 1) == 1) {
			
			System.out.println("Odd");
			odd(a);
		}
		
		// Print resulting array
		System.out.println("Resulting array " + n + 'x' + n + " is");
		printArray(a);
	}

	public static void odd(int[][] a) {

		int n = a.length; // size of the array
		int number = 1; // will write it to the array and increment
		int limit = n * n; // last number for writing to the array

		int i = 0; // row index
		int j = n >> 1; // column index (initialize as middle (/2))
		
		int nextLot = n; // every n-times will write element in down position

		while (number <= limit) {

			a[i][j] = number++;

			if (number > nextLot) {
				
				nextLot += n;
				i++;
				
			} else {

				if (--i < 0) {
					i = n - 1;
				}

				if (++j >= n) {
					j = 0;
				}
			}

		}
	}
	
	public static int inputInt (String message) {
		@SuppressWarnings ("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		
		while (!sc.hasNextInt()) {
			
			sc.nextLine();
			System.out.println("You should enter an integer.\n" + message);
		}
		
		return sc.nextInt();
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
