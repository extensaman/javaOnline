﻿package by.home.basics;

import java.math.BigInteger;

/*
 * Раздел "Циклы".
 * Задача №4.
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycles04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger mul = new BigInteger("1");
		
		for (int i = 2; i <= 200; i++) {
			mul = mul.multiply(BigInteger.valueOf(i*i));
		}
		
		System.out.println("The multiplication of squared numbers from 1 to 200 is " + mul);
	}
}