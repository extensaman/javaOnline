package by.home.basics;

import java.util.Scanner;

/*
 * Раздел "Циклы".
 * Задача №7.
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

public class Cycles07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int m = 0;
		int n = 0;
		
		System.out.println("Enter positive integers \'m\' and \'n\': ");
		if (sc.hasNextInt() && (m = sc.nextInt()) > 0 && sc.hasNextInt() && (n = sc.nextInt()) > 0) {
			for (int i = m; i <= n; i++) {
				for (int j = 2; j <= i/2; j++) {
					if (i%j == 0) {
						System.out.println("Integer \'" + i + "\' has the divider " + j);
					}
				}
			}
		} else {
			System.out.println("Program stoped because you had entered wrong data");
		}
		sc.close();
	}

}
