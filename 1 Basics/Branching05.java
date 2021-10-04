package by.home.basics;

import java.util.Scanner;
/*
 * Раздел "Ветвления".
 * Задача №5.
 * Вычислить значение функции: F(x) = pow(x,2) - 3x + 9, при x <= 3 || F(x) = 1 / (pow(x,3) + 6), при x > 3
 */

public class Branching05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a real number please: ");
		
		double x;
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		else {
			System.out.println("Program stopped because you had entered wrong number.");
			sc.close();
			return;
		}
		
		double  result;
		if (x <= 3.0) {
			result = Math.pow(x, 2.0) - 3.0 * x + 9.0;
		}
		else {
			result = 1.0 / (Math.pow(x, 3.0) + 6.0);
		}
		
		System.out.println("The result of calculation is " + result);
		sc.close();
	}

}
