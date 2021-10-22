package by.home.basic.linear;

import java.util.Scanner;

/*
 * Раздел "Линейные программы".
 * Задача №1.
 * Найдите значение функции: z = ( (a – 3) * b / 2) + c
 */

public class Linear01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
						
		System.out.println("Enter \"a\":");
		double a;
		a = sc.nextDouble();
		
		System.out.println("Enter \"b\":");
		double b;
		b = sc.nextDouble();
		
		System.out.println("Enter \"c\":");
		double c;
		c = sc.nextDouble();
		
		double z;
		z = ( (a - 3.0) * b / 2.0) + c;
		System.out.println("The result of \"z = ( (a – 3) * b / 2) + c\" is " + z);

	}
}
