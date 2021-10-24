package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №3.
* Вычислить площадь правильного шестиугольника со стороной а, 
* используя метод вычисления площади треугольника
*/

public class Decomposition03 {

	public static void main(String[] args) {

		double a; // Длина стороны шестиугольника
		
		a = inputDoubleMoreZero("Введите длину стороны шестиугольника:");
		
		double s = hexagonSquare(a);
		
		System.out.println("Площадь шестиугольника = " + s);
		
	}

	///////////////////////////////////////////////////////////
	// Возвращает положительное число (double), введенное с клавиатуры 
	
	public static double inputDoubleMoreZero (String message) {
		@SuppressWarnings ("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		double result;
		
		while (!sc.hasNextDouble() || (result = sc.nextDouble()) <= 0.0) {
			
			System.out.println("Wrong data. Enter double (> 0)\n" + message);
			sc.nextLine();
		}
		
		return result;
	}
	
	///////////////////////////////////////////////////////////
	// Вычисление площади шестиугольника, используя метод вычисления площади треугольника
	
	public static double hexagonSquare (double a) {
		
		return 6.0 * triangleSquare(a);
	}
	
	///////////////////////////////////////////////////////////
	// Вычисление площади равностороннего треугольника
	
	public static double triangleSquare (double a) {
		
		return Math.pow (3.0, 0.5) / 4.0 * Math.pow (a, 2.0);
	}
}
