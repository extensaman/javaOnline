package by.home.basic.cycle;

/*
 * Раздел "Циклы".
 * Задача №6.
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Cycles06 {

	public static void main(String[] args) {

		for (char i = '0'; i <= 'z'; i++) {
			System.out.println("Symbol \'" + i + "\' has code " + (byte) i);
		}
	}
}
