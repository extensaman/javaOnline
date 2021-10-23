package by.home.algorithmization.onedimensionalarrays;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №7.
* Даны действительные числа а1 ,а2 ,..., аn .
* Найти max (a1+a2n, a2+a2n-1,…,an+an+1)
*/

public class OneDimensionalArrays07 {

	public static void main(String[] args) {
		
		int n = 10; //size of an array has to be >= 2
		
		double[] a = new double[n];
		
		// Fill the array with real numbers from -100.0 to 100.00 and print it
		System.out.println("The next is our array:");
		
		for (int i = 0; i < n; i++) {
			
			a[i] = Math.random() * 200.0 - 100.0;
			System.out.printf("a[%d]=%.2f  ", i + 1, a[i]);
		}
		
		// Initialize variables
		double maximum = a[0] + a[n - 1];
		int leftIndex = 0;
		int rightIndex = n - 1;
		int middleIndex = n / 2;
		
		// Search maximum sum
		for (int i = 1, j = n - 2; i < middleIndex; i++, j--) {
			
			double tempSum = a[i] + a[j];
			
			if (tempSum > maximum) {
				maximum = tempSum;
				leftIndex = i;
				rightIndex = j;
			}
		}
		
		// Print results
		System.out.printf("\nMaximum sum is %.2f\nRight index is %d\nLeft index is %d", maximum, leftIndex + 1, rightIndex + 1);
		
	}

}
