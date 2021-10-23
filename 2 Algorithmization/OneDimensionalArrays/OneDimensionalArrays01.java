package by.home.algorithmization.onedimensionalarrays;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №1.
* В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
*/

public class OneDimensionalArrays01 {

	public static void main(String[] args) {
		int k = 11;
		int n = 10;
		int[] a = new int[n];
		
		// Filling an array
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * 100.0) + 1;
			System.out.println("a[" + i + "]=" + a[i]);
		}

		long sum = 0;

		//Calculation
		for (int i = 0; i < n; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		
		System.out.println("The result of calculation is " + sum);
	}

}
