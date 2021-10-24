package by.home.algorithm.decomp;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №2.
* Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
*/

public class Decomposition02 {

	public static void main(String[] args) {
		
		int n = 4; // Количество чисел для нахождения общего НОД
		
		int[] a = new int[n];
		
		// Генерируем  n-чисел от 1 до 100
		fillArrayRandom(a, 100.0);
		
		//a = new int[] {36, 12, 88, 44};
		
		// Печатаем сгенерированные числа
		printArray ("Числа для нахождения НОД следующие:", a);
		
		// Вычисляем НОД этих n-чисел 
		int result = calculateNod (a);
		
		// Печатаем результат
		System.out.println("\nОбщий НОД = " + result);
		
	}

	///////////////////////////////////////////////////////////
	// Заполняет массив 'a' случайными целыми числами от 1 до 'limit' 
	
	public static void fillArrayRandom (int[] a, double limit) {
		
		if (a == null) {
			
			System.out.println ("Bad \'a\' reference in \'void fillArrayRandom (int[] a, double limit)\'\n");
			return;
		}
		
		if (limit > Integer.MAX_VALUE) {
			
			limit = Integer.MAX_VALUE;
			
		} else {
			
			if (limit < 1.0) {
				
				limit = 1.0;
				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = (int) (Math.random() * limit) + 1;
		}
	}
	
	///////////////////////////////////////////////////////////
	// Печатает в консоль сообщение 'message' и массив 'a'
	
	public static void printArray (String message, int[] a) {

		if (a == null || message == null) {
			
			System.out.println ("Bad reference in \'void printArray (String message, int[] a)\'\n");
			return;
		}
		
		System.out.println(message);

		for (int element : a) {

			System.out.printf("%6d", element);

		}
	}

	///////////////////////////////////////////////////////////
	// Возвращает НОД чисел 'a' и 'b'

	static int nod(int a, int b) {

		if (a < b) {

			int temp = a;
			a = b;
			b = temp;

		}

		int ost = a % b;

		if (ost == 0) {

			return b;

		} else {

			return nod(b, ost);
		}

	}

	///////////////////////////////////////////////////////////
	// Возвращает общий НОД чисел, хранящихся в массиве 'a'
	
	public static int calculateNod (int[] a) {
		
		if (a == null || a.length < 2) {
			
			System.out.println ("Bad \'a\' reference in \'int calculateNod (int[] a)\'\nProgram stopeed.");
			System.exit(0);
		}
		
		int result = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			result = nod (result, a[i]);
		}
		
		return result;
	}
}
