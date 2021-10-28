package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №14.
* Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
* возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи 
* использовать декомпозицию.
*/

public class Decomposition14 {

	/*
	 * Декомпозиция задачи заключается в разделении ее на несколько этапов 
	 * 1) Ввод информации (k) 
	 * 2) Создание 'базы данных' для работы прорграммы в виде двумерного массива
	 * 3) Первая строка 'базы данных' заполняется числами из анализируемого промежутка (1 .. к)
	 * 4) Вторая строка заполняется числами равными сумме цифр чисел, расположенных в первой строке, возведенных в степень
	 *    количества цифр в соответствующем числе первого ряда 
	 * 5) Вводим на печать числа Армстронга из 'базы данных', анализируя равенство чисел в впервой и второй строках 
	 */

	public static void main(String[] args) {

		int k;
		
		k = inputIntMoreZero("Enter \'k\':");

		int[][] database;
		
		database = createDatabase(k);

		fillNumber(database);
		
		fillArmstrongNumber(database);
		
		printArmstrongNumber ("Armstrong numbers are ", database);
		
	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (1 <= .. <= Integer.MAX_VALUE - 5),
	// введенное с клавиатуры

	public static int inputIntMoreZero(String message) {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		int m;
		System.out.println(message);

		while (!sc.hasNextInt() || (m = sc.nextInt()) < 1 || m > Integer.MAX_VALUE - 5) {

			System.out.println(
					"Wrong data input. Enter an integer (1 < .. <= " + (Integer.MAX_VALUE - 5) + ")\n" + message);
			sc.nextLine();
		}

		return m;
	}

	///////////////////////////////////////////////////////////
	// Возвращает двумерный массив 2 х size
	
	public static int[][] createDatabase(int size) {

		return new int[2][size];
	}

	///////////////////////////////////////////////////////////
	// Первая строка 'базы данных' заполняется числами из анализируемого промежутка (1 .. к)
	
	public static void fillNumber(int[][] a) {

		for (int i = 0; i < a[0].length; i++) {

			a[0][i] = i + 1;
		}

	}

	///////////////////////////////////////////////////////////
	// Вторая строка заполняется числами равными сумме цифр чисел, расположенных в первой строке, возведенных в степень
	// количества цифр в соответствующем числе первого ряда
	
	public static void fillArmstrongNumber(int[][] a) {
		
		for (int i = 0; i < a[0].length; i++) {
			
			a[1][i] = armstrongCandidate(a[0][i]);
		}
	}

	///////////////////////////////////////////////////////////
	// Возвращает сумма цифр 'n', возведенная в степень количества цифр в числе 'n',
	
	public static int armstrongCandidate (int n) {
		
		int sum = 0;
		int digitCount = 0;
		
		do {
			
			sum += n % 10;
			
			n /= 10;
			
			digitCount++;
			
		} while (n != 0);
		
		return (int) Math.pow(sum, digitCount);
	}
	
	///////////////////////////////////////////////////////////
	// Вводим на печать числа Армстронга из 'a', анализируя равенство чисел в впервой и второй строках 
	
	public static void printArmstrongNumber (String message, int[][] a) {
		
		System.out.println(message);
		
		for (int i = 0; i < a[0].length; i++) {
			
				if (a[0][i] == a[1][i]) {
					
					System.out.println(a[0][i] + "  ");
				}
		}
	}
}
