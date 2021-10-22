package by.home.basic.cycle;

import java.util.Scanner;

/*
 * Раздел "Циклы".
 * Задача №5.
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид: An = 1 / pow (2,n) + 1 / pow (3,n)
 */

public class Cycles05 {

	public static void main(String[] args) {
		
		System.out.println("Enter a real number \'e\': ");
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Try again. Enter a real number \'e\': ");
		}

		double e = sc.nextDouble();

		double an = 0.0;
		double sum = 0.0;
		int n = 1;

		while (true) {
			an = 1.0 / Math.pow(2.0, n) + 1.0 / Math.pow(3.0, n);
			if (Math.abs(an) >= e) {
				sum += an;
				n++;
			} else {
				break;
			}
		}
		System.out.println("The result of calculation is " + sum);

	}
		
}
