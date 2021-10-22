package by.home.basic.cycle;

//import java.math.BigInteger;

/*
 * Раздел "Циклы".
 * Задача №4.
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycles04 {

	public static void main(String[] args) {
		
		long result = 1L;
		
		for (int i = 2; i <= 200; i++) {
			
			result *= i * i;
			
			if (result <= 0L) {
				
				System.out.println("Overflow of \'long\' type. Program finished.");
				return;
			}
		}
		
		System.out.println("The multiplication of squared numbers from 1 to 200 is " + result);
	}
	
	/* Solution with "BigInteger"
		
		public static void main(String[] args) {
		
			BigInteger mul = new BigInteger("1");
		
			for (int i = 2; i <= 200; i++) {
				mul = mul.multiply(BigInteger.valueOf(i*i));
			}
		
			System.out.println("The multiplication of squared numbers from 1 to 200 is " + mul);
		}
	*/
}
