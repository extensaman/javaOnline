package by.home.basic.cycle;

import java.util.Scanner;

/*
 * Раздел "Циклы".
 * Задача №1.
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Cycles01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a positive integer: ");
		
		int x = 0;
		long sum = 0;
		
		if (sc.hasNextInt() && (x = sc.nextInt()) > 0) {
			for (int i = 1; i <= x; i++) {
				sum += i;
			}
			System.out.println("Sum of integers from 1 to " + x + " is " + sum);
		}
		else {
			System.out.println("Program stopped because you had entered the wrong number.");
		}
	}

}
