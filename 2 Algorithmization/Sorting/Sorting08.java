package by.home.algorithmization.sorting;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировки".
* Задача №8.
* Даны дроби p1/q1, p2/q2, ... , pn/qn (pi, qi - натуральные). 
* Составить программу, которая приводит эти дроби к общему знаменателю и 
* упорядочивает их в порядке возрастания.
*/

public class Sorting08 {

	private static final int MAX_COUNT_OF_PRIME = 50;
	
	public static void main(String[] args) {
		
		int n; // dimension of arrays 'p' and 'q'
		n = (int) (Math.random() * 4.0) + 2;
		
		int[] p = new int[n];
		int[] q = new int[n];
		
		// Initialization of arrays
		for (int i = 0; i < n; i++) {
			
			p[i] = (int) (Math.random() * 8.0) + 1;
			q[i] = (int) (Math.random() * 8.0) + 1;
		}
		
		// Print generated fractions
		System.out.println("Original fractions are");
		printFraction(p, q);
		
		// Separate each denominator ('q'-element) to prime multipliers
		
		int[][] arrayPrimeMultiplier = new int[n][];
		
		System.out.print("\n\nSeparate each denominator ('q'-element) to prime multipliers:");
		for (int i = 0; i < n; i++) {
			
			arrayPrimeMultiplier[i] = separateToPrimeMultiplier(q[i]);
		}
		
		System.out.println("\n\nCalculations...");

		// Вычисляем НОК всех знаменателей дробей 
		int nod = 0;
		int nok = 1;
		int previousNok = q[0];
				
		for (int i = 0; i < n - 1; i++) { // цикл по всем массивам массивов простых множителей
			
			for (int j = 0; arrayPrimeMultiplier[i][j] != 0; j++) { // берем один из массивов простых множителей, обозначим его как "1"
				
				boolean primeFounded = false;
				
				for (int k = 0; arrayPrimeMultiplier[i+1][k] != 0; k++) { // и ищем одинаковые цифры в следующем массиве простых множителей, обозначим его как "2"
					
					if (arrayPrimeMultiplier[i][j] == arrayPrimeMultiplier[i+1][k]) { 
						
						arrayPrimeMultiplier[i+1][k] = 1; // если нашлась одинаковая цифра, то в "2" ее "убираем" (присваиваем 1)
						primeFounded = true;
						break;				// и переходим к следующей цифре в "1", тем самым оставляя найденную общую цифру в "1"
					}
				}
				
				if (!primeFounded) {				// если нет такой цифры в "2"
					
					arrayPrimeMultiplier[i][j] = 1; // то "убираем" ее из "1" (присваиваем 1)
				}
			}
			
			// в результате общие простые останутся в массиве "1"   
			
			nod = calcNod(arrayPrimeMultiplier[i]); // перемножив их получим НОД этих двух чисел (разложенных ранее на простые множители)
			
			nok = previousNok * q[i + 1] / nod;  // переводим НОД в НОК по известной формуле 
			
			System.out.print("\n\'" + previousNok + "\' and \'" + q[i + 1]  + "\' : NOD is " + nod + " NOK is " + nok); // служебная печать (для контроля)
			
			arrayPrimeMultiplier[i+1] = separateToPrimeMultiplier(nok); // и раскладываем этот НОК на простые множители и пишем в массив "2", который на следующей итерации 'i' станет "1"
			
			previousNok = nok;
		}

		System.out.println("\nLeast common multiple of all denominators is " + nok);
		
		// Reduce fractions to a common denominator
		for (int i = 0; i < n; i++) {
			
			p[i] *= nok / q[i];
			q[i] = (int) nok;
		}
		
		// Print generated fractions
		System.out.println("\nFractions with common denominator are");
		printFraction(p, q);
		
		// Sort fractions
		sortArray(p);
		
		// Print result
		System.out.println("\nSorted fractions with common denominator are");
		printFraction(p, q);
		
	}

	public static int[] separateToPrimeMultiplier(int q) {
		
		if (q < 1) {
			
			System.out.println("Bad input parameter \'q\' in \'int[] separateToPrimeMultiplier(int q)\'.");
			System.exit(0);
		}
		
		int[] elementPrimeMultiplier = new int[MAX_COUNT_OF_PRIME];
		
		int index = 0;
		
		System.out.print("\nPrime-multipliers of " + q + " are");
		
		do {
			for (int i = 2; i <= q; i++) {
				
				if (q % i == 0) {
					
					elementPrimeMultiplier[index++] = i;
					q /= i;
					break;
				}
			}
		} while (q > 1 && index < MAX_COUNT_OF_PRIME);
		
		
		if (index == MAX_COUNT_OF_PRIME) {
			
			System.out.println("\nToo big number. Result is wrong.");
			return elementPrimeMultiplier;
		}
		
		elementPrimeMultiplier[index] = 1;
		
		printArray(elementPrimeMultiplier);
		
		return elementPrimeMultiplier;
	}
	
	public static void  printFraction (int[] p, int[] q) {
		
		if (p == null || q == null || p.length != q.length) {
			
			System.out.println("Bad parameters for print.");
			return;
		}
		
		for (int i = 0; i < p.length; i++) {
			
			System.out.printf("%8d", p[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < p.length; i++) {
			
			System.out.printf("%4c%4c", ' ', '-');
		}
		
		System.out.println();

		for (int i = 0; i < q.length; i++) {
			
			System.out.printf("%8d", q[i]);
		}
	}
	
	public static void printArray(int[] a) {
		
		if (a == null) {
			
			System.out.println("Bad parameter for print.");
			return;
		}
		
		for (int element : a) {
			
			if (element == 0) {
				break;
			}
			
			System.out.printf("%8d", element);
		}
	}
	
	public static int calcNod (int[] prime) {
		
		if (prime == null) {
			
			System.out.println("Bad input parameter in \'int calcNod(int[] mas)\'.");
			System.exit(0);
		}
		
		int nod = 1;
		for (int i = 0; prime[i] != 0; i++) {
			
			nod *= prime[i];
		}
		
		return nod;
	}
	
	public static void sortArray (int[] a) {
		
		if (a == null) {
			
			System.out.println("Bad parameter for sort.");
			return;
		}
		
		boolean isNotSorted = true;
		int countOfSortedElement = 0;
		
		while (isNotSorted) {
			
			isNotSorted = false;
			
			for (int i = 0; i < a.length - 1 - countOfSortedElement; i++) {
				
				if (a[i] > a[i+1]) {
					
					int temp = a[i];
					a[i] = a[i+1];
					a[i + 1] = temp;
					
					isNotSorted = true;
				}
			}
			
			countOfSortedElement++;
		}
		
	}
}
