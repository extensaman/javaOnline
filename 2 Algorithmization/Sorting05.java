package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировка".
* Задача №5.
* Cортировка вставками. 
* Дана последовательность чисел a1, a2 .. an. 
* Требуется переставить числа в порядке возрастания. 
* Делается это следующим образом. 
* Пусть a1, a2 .. ai - упорядоченная последовательность, т. е.
* a1 <= a2 <= .. <= ai. Берется следующее число ai+1 
* и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. 
* Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. 
* Примечание. Место помещения очередного элемента в отсортированную часть производить 
* с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/

public class Sorting05 {

	public static void main(String[] args) {
		
		int n; // dimension of array
		n = (int) (Math.random() * 20.0) + 2;
		
		int[] notSortedArray = new int[n];
		
		// Generate elements
		for (int i = 0; i < n; i++) {
			notSortedArray[i] = (int) (Math.random() * 100.0) - 50;
		}
		
		System.out.println("Original array is");
		printArray(notSortedArray);
		
		int[] a = new int[n];
		
		// Make sorted array 'a' from first and second elements of original array
		if (notSortedArray[0] < notSortedArray[1]) {
			a[0] = notSortedArray[0];
			a[1] = notSortedArray[1];
		} else {
			a[0] = notSortedArray[1];
			a[1] = notSortedArray[0];
		}
		
		// Sorting
		int lastIndexA = 1;
		for (int i = 2; i < n; i++) {
			
			// Determine index number for insert
			int insertIndex = binarySearch(a, 0, lastIndexA, notSortedArray[i]);
			
			// Move to the right elements that are situated after 'insert'-position
			for (int j = lastIndexA + 1, moveCount = lastIndexA - insertIndex; moveCount >= 0; moveCount--, j--) {
				a[j] = a[j - 1];
			}
			// Insert new element
			a[insertIndex] = notSortedArray[i];
			lastIndexA++;
		}
		
		// Print result
		System.out.println("\nSorted array is");
		printArray(a);
	}

	public static int binarySearch(int[] a, int beginIndex, int endIndex, int newElement) {
		
		int size = endIndex - beginIndex + 1;
		
		if (size <= 2) {
			
			if (newElement < a[beginIndex]) {
				return beginIndex;
			} else {
				if (newElement > a[endIndex]) {
					return endIndex + 1;
				} else {
					return endIndex; 
				}
			}
		}
		
		int currentIndex = beginIndex + size / 2;
		
		if (newElement < a[currentIndex]) {
			return binarySearch(a, beginIndex, currentIndex, newElement);
		} else {
			return binarySearch(a, currentIndex, endIndex, newElement);
		}
		
	}
	
	public static void printArray (int[] a) {
		
		for (int element: a) {
			System.out.printf("%+5d", element);
		}
	}
}
