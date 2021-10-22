package by.home.basic.branching;

/*
 * Раздел "Ветвления".
 * Задача №4.
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class Branching04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0;
		double b = 5.0;
		double x = 3.0;
		double y = 6.0;
		double z = 1.0;
		boolean result = false;
		
		System.out.println("Question: Is the hole " + a + 'x' + b + " bigger than brick " + x + 'x' + y + 'x' + z + '?');
		
		if (a > 0.0 && b > 0.0 && x > 0.0 && y > 0.0 && z > 0.0) {
			if ((x < a && y < b) || 
				(y < a && x < b) || 
				(x < a && z < b) ||
				(z < a && x < b) ||
				(y < a && z < b) ||
				(z < a && y < b)) 
			{
				result = true;
			}
		}
		
		System.out.println("Answer: " + (result ? "Yes" : "No"));
	}

}
