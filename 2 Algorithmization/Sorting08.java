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

	public static void main(String[] args) {
		
		int n; // dimension of arrays 'p' and 'q'
		n = (int) (Math.random() * 5.0) + 2;
		
		int[] p = new int[n];
		int[] q = new int[n];
		
		// Initialization of arrays
		for (int i = 0; i < n; i++) {
			p[i] = (int) (Math.random() * 20.0) + 1;
			q[i] = (int) (Math.random() * 20.0) + 1;
		}
		
		// Print generated fractions
		System.out.println("Original fractions are");
		printFraction(p, q);
		
		// Separate each 'q'-element to prime multipliers
		
		int[][] arrayPrimeMultiplier = new int[n][];
		
		for (int i = 0; i < n; i++) {
			arrayPrimeMultiplier[i] = separateToPrimeMultiplier(q[i]);
		}
		
		
	}

	public static int[] separateToPrimeMultiplier(int q) {
		
		int[] elementPrimeMultiplier = new int[50];
		
		return elementPrimeMultiplier;
	}
	
	public static void  printFraction (int[] p, int[] q) {
		
		if (p == null || q == null || p.length != q.length) {
			System.out.println("Bad parameters for print.");
			return;
		}
		
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%4d", p[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2c%2c", ' ', '-');
		}
		
		System.out.println();

		for (int i = 0; i < q.length; i++) {
			System.out.printf("%4d", q[i]);
		}
	}
}
