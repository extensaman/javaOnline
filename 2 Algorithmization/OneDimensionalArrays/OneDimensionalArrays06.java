package by.home.algorithmization.onedimensionalarrays;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №6.
* Задана последовательность N вещественных чисел. 
* Вычислить сумму чисел, порядковые номера которых 
* являются простыми числами.
*/

public class OneDimensionalArrays06 {

	public static void main(String[] args) {
		
		int n = 25; //size of an array
		
		double[] a = new double[n];
		
		// Fill the array with real numbers from -100.0 to 100.00 and print it
		System.out.println("The next is our array:");
		
		for (int i = 0; i < n; i++) {
			
			a[i] = Math.random() * 200.0 - 100.0;
			System.out.printf("a[%d]=%.2f  ", i + 1, a[i]);
		}
		
		// Search for prime indexes and summarize these elements
		System.out.println("\nSummarized elements of the array are: ");
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			
			if (isPrimeNumber(i + 1)) {
				
				System.out.printf("a[%d]=%.2f  ", i + 1, a[i]);
				sum += a[i];
			
			} else {
				System.out.printf("          ");
			}
		}
		
		// Print resulting sum
		System.out.printf("\nResulting sum is %.2f", sum);
	}

	/*
	 * Method returns 'true' if input parameter 'num' is a prime number
	 * Method returns 'false' if input parameter 'num' is less or equal zero or not a prime number
	 */
	
	public static boolean isPrimeNumber(int num) {
		
		if (num <= 0) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
