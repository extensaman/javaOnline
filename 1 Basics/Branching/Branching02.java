package by.home.basic.branching;

/*
 * Раздел "Ветвления".
 * Задача №2.
 * Найти max{min(a, b), min(c, d)}.
 */

public class Branching02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 200;
		int c = 30;
		int d = 40;
		int minAB, minCD;
		
		if (a < b) {
			minAB = a;
		}
		else {
			minAB = b;
		}
		
		if (c < d) {
			minCD = c;
		}
		else {
			minCD = d;
		}
		
		System.out.print("The result of expression \'max{min(a, b), min(c, d)\' is " + (minAB > minCD ? minAB : minCD));
	}
}
