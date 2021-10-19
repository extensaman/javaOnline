package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировки".
* Задача №6.
* Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
* Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
* Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, 
* то производится перестановка и сдвигаются на один элемент назад.
* Составить алгоритм этой сортировки
*/

public class Sorting06 {

	public static void main(String[] args) {
		
		int n; // dimension of array
		n = (int) (Math.random() * 20.0) + 2;
		
		int[] a = new int[n];
		
		// Generate elements
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 100.0) - 50;
		}
		
		System.out.println("Original array is");
		printArray(a);
		
		for (int i = 0; i < n - 1; i++) {
			
			if (a[i] > a[i + 1]) {
			
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				
				for (int j = i; j > 0; j--) {
					
					if (a[j] < a[j - 1]) {
						
						temp = a[j];
						a[j] = a[j  - 1];
						a[j - 1] = temp;
						
					} else {
						
						break;
					}
				}
			}
		}
		
		// Print result
		System.out.println("\nSorted array is");
		printArray(a);
	}
	
	public static void printArray (int[] a) {
		
		for (int element: a) {
			System.out.printf("%+5d", element);
		}
	}
}
