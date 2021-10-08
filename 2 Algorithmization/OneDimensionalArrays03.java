package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №3.
* Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, 
* положительных и нулевых элементов
*/

public class OneDimensionalArrays03 {

	public static void main(String[] args) {

		int n = 10;
		
		double[] a = new double[n];
		
		// Fill an array with numbers from -100.0 to 100.00 and print it
		System.out.println("The next is our array:");
		
		for (int i = 0; i < n; i++) {
			a[i] = (Math.random() * 200.0) - 100.0;
			System.out.printf("a[%d]=%.2f\n", i, a[i]);
		}
		
		int positiveCount = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < n; i++ ) {
			
			if (a[i] > 0.0) {
				positiveCount++;
			} else {
				if (a[i] == 0.0) {
					zeroCount++;
				}
			}
		}
		
		System.out.println("Amount of positive numbers is " + positiveCount +
							"\nAmount of zero numbers is " + zeroCount + 
							"\nAmoount of negative numbers is " + 
							(n - positiveCount - zeroCount));
	}
}
