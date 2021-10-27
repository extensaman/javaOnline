package by.home.algorithm.decomp;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №11.
* Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
*/

public class Decomposition11 {

	public static void main(String[] args) {

		double limit; // limit for generation of two numbers
		limit = 1000.0;

		long a;
		a = (long) (Math.random() * limit) + 1l;

		long b;
		b = (long) (Math.random() * limit) + 1L;

		System.out.println("The first number is " + a + " and the second one is " + b);

		int result;
		result = compareDigitCount(a, b);

		printResult(a, b, result);

	}

	///////////////////////////////////////////////////////////
	// Возвращает отрицательное число, если кол-во цифр в 'b' больше, чем в 'a'
	// Возвращает положительное число, если кол-во цифр в 'a' больше, чем в 'b'
	// Возвращает нулевое значение, если кол-во цифр в 'b' равно количеству цифр в
	/////////////////////////////////////////////////////////// 'a'

	public static int compareDigitCount(long a, long b) {

		return (int) Math.log10(a) - (int) Math.log10(b);
	}

	///////////////////////////////////////////////////////////
	// Формирует сообщение для печати резльтата в зависимости от значения параметра
	/////////////////////////////////////////////////////////// 'result'
	// Выыодит на печать сформированное сообщение

	public static void printResult(long a, long b, int result) {

		String message;
		;

		if (result == 0) {

			message = "Count of disgits equals in " + a + " and " + b;

		} else {

			if (result < 0) {

				message = "Count of digits in " + b + " is more than in " + a;

			} else {

				message = "Count of digits in " + a + " is more than in " + b;
			}
		}

		System.out.println(message);
	}
}
