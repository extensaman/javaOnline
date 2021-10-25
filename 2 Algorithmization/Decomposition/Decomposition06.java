package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №6.
* Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

public class Decomposition06 {

	public static void main(String[] args) {

		int a; // Первое число
		a = inputIntMoreZero("Введите первое число: ");
		
		int b; // Второе число
		b = inputIntMoreZero("Введите второе число: ");
		
		int c; // // Третье число
		c = inputIntMoreZero("Введите третье число: "); 
		
		boolean prime;
		prime = isPrime (a, b, c);
		
		System.out.println("Числа " + a + ", " + b + ", " + c + (prime ? " " : " не ") + "взаимно простые.");

	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (> 0), введенное с клавиатуры
	
	public static int inputIntMoreZero (String message) {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		int n;
		
		while (!sc.hasNextInt() || (n = sc.nextInt()) <= 0) {
			
			System.out.println("Введите целое положительное число (> 0):");
			sc.nextLine();
			
		}
		
		return n;
	}
	
	///////////////////////////////////////////////////////////
	// Проверяет являются ли данные три числа взаимно простыми.
	
	public static boolean isPrime (int a, int b, int c) {
		
		if (nod (a, nod (b, c)) == 1) {
			
			return true;
		}
		
		return false;
	}
	
	///////////////////////////////////////////////////////////
	// Возвращает НОД чисел 'a' и 'b'
	
	public static int nod (int a, int b) {
		
		if (a < b) {
			
			int temp = a; 
			a = b;
			b = temp;
		}
		
		int ost = a % b;
		
		if (ost == 0) {
			
			return b;
			
		} else {
			
			return nod (b, ost);
		}
	}
}
