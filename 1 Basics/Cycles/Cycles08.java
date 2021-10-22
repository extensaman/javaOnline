package by.home.basic.cycle;

/*
 * Раздел "Циклы".
 * Задача №8.
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Cycles08 {

	public static void main(String[] args) {

		int a = 201920000;
		int b = 98932840;

		if (a == 0 && b == 0) {
			System.out.println("Equal digit in numbers \'a\'=" + a + " \'b\'=" + b + " is 0");
			return;
		}

		boolean[] mas = { false, false, false, false, false, false, false, false, false, false };
		int tempA = a;

		while (tempA != 0) {

			int lastDigitInA = tempA % 10;
			int tempB = b;

			while (tempB != 0) {

				int lastDigitInB = tempB % 10;
				if (lastDigitInA == lastDigitInB) {
					mas[lastDigitInA] = true;
					break;
				}

				tempB /= 10;
			}

			tempA /= 10;
		}
		
		for (int i = 0; i < 10; i++) {
			
			if (mas[i]) {
				System.out.println("Equal digit in numbers \'a\'=" + a + " \'b\'=" + b + " is " + i);
			}
		}
	}

}
