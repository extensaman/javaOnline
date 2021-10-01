package by.home.basics;

/*
 * Раздел "Ветвления".
 * Задача №3.
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Branching03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 1;
		int y1 = 1;
		int x2 = -1;
		int y2 = 1;
		int x3 = 0;
		int y3 = 1;
		System.out.println("Question: Do the points A(" + x1 + ',' + y1 + "), " +
									"B(" + x2 + ',' + y2 + "), " +
									"C(" + x3 + ',' + y3 + ") belong to a line?");
		boolean result = (x3-x1)*(y2-y1) == (x2-x1)*(y3-y1);
		System.out.println("Answer: " + (result ? "Yes" : "No"));
	}

}
