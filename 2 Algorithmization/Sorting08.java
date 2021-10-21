package by.home.algorithmization;

/*
* Этап "Алгоритмизация"
* Раздел "Сортировка".
* Задача №8.
* Даны дроби p1/q1, p2/q2, ... , pn/qn (pi, qi - натуральные). 
* Составить программу, которая приводит эти дроби к общему знаменателю и 
* упорядочивает их в порядке возрастания.
*/

public class Sorting08 {

	private static final int MAX_COUNT_OF_PRIME = 50;
	
	public static void main(String[] args) {
		
		int n; // dimension of arrays 'p' and 'q'
		n = 2; //(int) (Math.random() * 3.0) + 2;
		
		int[] p = new int[n];
		int[] q = new int[n];
		
		// Initialization of arrays
		for (int i = 0; i < n; i++) {
			p[i] = (int) (Math.random() * 9.0) + 1;
			q[i] = (int) (Math.random() * 9.0) + 1;
		}
		
		// Print generated fractions
		System.out.println("Original fractions are");
		printFraction(p, q);
		
		// Separate each 'q'-element to prime multipliers
		
		int[][] arrayPrimeMultiplier = new int[n][];
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			arrayPrimeMultiplier[i] = separateToPrimeMultiplier(q[i]);
			System.out.println();
			printArray(arrayPrimeMultiplier[i]);
		}
		
		int[] nod = new int[n];
		arrayInitialization(nod, 1);
		
		for (int i = 0; i < n - 1; i++) {
			
			for (int j = 0; arrayPrimeMultiplier[i][j] != 0; j++) {
				
				boolean primeFounded = false;
				
				for (int k = 0; arrayPrimeMultiplier[i+1][k] != 0; k++) {
					
					if (arrayPrimeMultiplier[i][j] == arrayPrimeMultiplier[i+1][k]) {
						
						arrayPrimeMultiplier[i+1][k] = 1;
						primeFounded = true;
						break;
					}
				}
				
				if (!primeFounded) {
					arrayPrimeMultiplier[i][j] = 1;
				}
			}
			
			nod[i] = calcNod(arrayPrimeMultiplier[i]);
			System.out.println("\nNOD of " + q[i] + " and " + q[i+1] + " is " + nod[i]);
			arrayPrimeMultiplier[i+1] = separateToPrimeMultiplier(nod[i]);
		}
		
		nod[n-1] = calcNod(arrayPrimeMultiplier[n-1]);
	}

	public static int[] separateToPrimeMultiplier(int q) {
		
		int[] elementPrimeMultiplier = new int[MAX_COUNT_OF_PRIME];
		
		int index = 0;
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
			System.out.println("Bad parameters for print.");
			return;
		}
		
		for (int element : a) {
			if (element == 0) {
				break;
			}
			System.out.printf("%8d", element);
		}
	}
	
	public static void arrayInitialization (int[] a, int var) {
		
		for (int i = 0; i < a.length; i++) {
			a[i] = var;
		}
	}
	
	public static int calcNod (int[] prime) {
		
		int nod = 1;
		for (int i = 0; prime[i] != 0; i++) {
			nod *= prime[i];
		}
		
		return nod;
	}
}
