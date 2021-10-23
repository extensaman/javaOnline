package by.home.algorithmization.sorting;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировки".
* Задача №2.
* Даны две последовательности a1, a2 .. an и b1, b2 ... bm
* Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
* Примечание. Дополнительный массив не использовать.
*/

public class Sorting02 {

	public static void main(String[] args) {
		
		int m; // dimension of array 'a'
		m = (int) (Math.random() * 5.0) + 2;
		
		int n; // dimension of array 'b'
		do {
			n = (int) (Math.random() * 5.0) + 2;
			
		} while (m == n);
		
		int[] a = new int[m + n]; // allocate cells for 'b' array
		int[] b = new int[n];
		
		// Generate elements for arrays 'a' and 'b' (and they are not sorted)
		for (int i = 0; i < m; i++) {
			
			a[i] = (int) (Math.random() * 30.0) - 15;
		}
		
		for(int i = 0 ; i < n; i++) {
			
			b[i] = (int) (Math.random() * 30.0) -15;
		}
		
		// Sort arrays
		sortArray(a, m);
		sortArray(b, n);
		
		// Print arrays 'a' and 'b'
		System.out.println("Array \'a\' (length =" + m + ") is");
		
		for (int i = 0; i < m; i++) {
			
			System.out.printf("%+4d", a[i]);
		}
		
		System.out.println("\nArray \'b\' (length =" + n + ") is");
		printArray(b);
		
		// Move 'a'-array's elements to its end 
		int counter;
		int i;
		
		for (i = a.length - 1, counter = 0; counter < m; i--, counter++) {
			
			a[i] = a[i-n];
		}
		
		// Combine arrays 'a' and 'b' to one array
		int indexFromA = n;
		int indexFromB = 0;
		int indexToA = 0;
		
		for (counter = 0; counter < m + n; counter++) {
			
			if (indexFromA == a.length) {
				
				a[indexToA++] = b[indexFromB++];
				continue;
			}
			
			if (indexFromB == b.length) {
				
				a[indexToA++] = a[indexFromA++];
				continue;
			}
			
			if (a[indexFromA] < b[indexFromB]) {
				
				a[indexToA++] = a[indexFromA++];
				
			} else {
				
				a[indexToA++] = b[indexFromB++];
			}
		}
		
		// Print results
		System.out.println("Resulting array is");
		printArray(a);
	}

	public static void printArray (int[] mas) {
		
		if (mas == null) {
			
			System.out.println("Bad array reference.");
			return;
		}
		
		for (int i : mas) {
			
			System.out.printf("%+4d", i);
		}
		
		System.out.println();
	}
	
	public static void sortArray (int[] a, int lastPosition) {
		
		boolean isNotSorted = true;
		int sortedCount = 0;
		
		while (isNotSorted) {
			
			isNotSorted = false;
			
			for (int i = 0; i < lastPosition - 1 - sortedCount; i++) {
				
				if (a[i] > a[i+1]) {
					
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					
					isNotSorted = true;
				}
			}
			
			sortedCount++;
		}
	}
}
