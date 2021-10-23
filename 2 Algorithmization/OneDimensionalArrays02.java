package by.home.algorithmization.onedimensionalarrays;

/*
* Этап "Алгоритмизация"
* Раздел "Одномерные массивы".
* Задача №2.
* Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
* числом. Подсчитать количество замен.
*/

public class OneDimensionalArrays02 {

	public static void main(String[] args) {
		
		double z = 11.0;
		int n = 10;
		
		double[] a = new double[n];
		
		// Filling an array with numbers from -100.0 to 100.00
		for (int i = 0; i < n; i++) {
			a[i] = (Math.random() * 200.0) - 100.0;
		}
		
		System.out.println("The next is initial array:");
		printArray(a);
		
		//Searching
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > z) {
				a[i] = z;
				counter++;
			}
		}
		
		System.out.println("The next is result array:");
		printArray(a);
		
		System.out.println("The count of changes is " + counter);
	}
	
	public static void printArray(double[] mas) {
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("a[%d]=%.2f\n", i, mas[i]);
		}
	}

}
