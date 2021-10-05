package by.home.basics;

/*
 * Раздел "Циклы".
 * Задача №2.
 * Вычислить значения функции на отрезке [а,b] c шагом h: y = x, при x > 2; y = -x, при x <= 2
 */

public class Cycles02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = -3.5;
		double b = 9.0;
		double h = 0.5;
		
		for (double i = a; i <= b; i += h) {
			if (i > 2.0) {
				System.out.println("y=" + i);
			}
			else {
				System.out.println("y=" + -i);
			}
		}
	}
}
