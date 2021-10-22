package by.home.basic.branching;

/*
 * Раздел "Ветвления".
 * Задача №1.
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Branching01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angle01 = 40;
		int angle02 = 50;
		if (angle01 >= 0 && angle02 >= 0 && angle01 + angle02 < 180) {
			System.out.print("Triangle with angle #1 = " +
									angle01 + " degrees and angle #2 = " +
									angle02 + " degrees EXISTS");
			if (angle01 == 90 || angle02 == 90 || angle01 + angle02 == 90) {
				System.out.println(" and it's rectangular");
			}
		}
		else {
			System.out.print("Triangle with angle #1 = " +
					angle01 + " degrees and angle #2 = " +
					angle02 + " degrees doesn't EXIST");
		}
	}

}
