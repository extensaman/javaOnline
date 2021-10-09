package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №4.
* Даны действительные числа а1 ,а2 ,..., аn . 
* Поменять местами наибольший и наименьший элементы.
*/

public class OneDimensionalArrays04 {

	public static void main(String[] args) {
		
		int n = 10; //size of an array
		
		double[] a = new double[n];
		
		// Fill the array with real numbers from -100.0 to 100.00 and print it
		System.out.println("The next is our array:");
		
		for (int i = 0; i < n; i++) {
			a[i] = Math.random() * 200.0 - 100.0;
			System.out.printf("a[%d]=%.2f  ", i, a[i]);
		}

		int indexMax = 0;
		int indexMin = 0;
		
		//Search for indexes of minimal and maximum elements
		for (int i = 1; i < n; i++) {
			
			if (a[i] > a[indexMax]) {
				indexMax = i;
			} else {
				if (a[i] < a[indexMin]) {
					indexMin = i;
				}
			}
		}
		
		//Swap minimal and maximum elements of the array
		double temp = a[indexMax];
		a[indexMax] = a[indexMin];
		a[indexMin] = temp;
		
		//Print results
		System.out.println("\nThe resulting array is:");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d]=%.2f  ", i, a[i]);
		}
		
		System.out.println("\nIndex of minimal element was " + indexMin +
				"\nIndex of maximum element was " + indexMax);
	}

}
