package by.home.algorithm.decomp;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №7.
* Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/

public class Decomposition07 {

	public static void main(String[] args) {

		int limit = 9;
		
		long result;
		result = sumFactorial(limit);
		
		System.out.println("Сумма факториалов всех нечетных чисел от 1 до " + limit + " = " + result);

	}

	///////////////////////////////////////////////////////////
	// Возвращает сумму факториалов всех нечетных чисел от 1 до 'n'
	
	public static long sumFactorial (int n) {
		
		long sum = 0L;
		
		for (int i = 1; i <= n; i++) {
			
			if (isOdd(i)) {
				
				sum += getFactorial(i);
				
			}
		}
		
		return sum;
	}
	
	///////////////////////////////////////////////////////////
	// Возвращает факториал числа 'n'
	
	public static long getFactorial (int n) {
		
		long result = 1L;
		
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	///////////////////////////////////////////////////////////
	// Возвращает 'true', если 'n' нечетное; 'false', если 'n' четное
	
	public static boolean isOdd (int n) {
		
		return n % 2 != 0;
	}
}
