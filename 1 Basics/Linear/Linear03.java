package by.home.basic.linear;

/*
 * Раздел "Линейные программы".
 * Задача №3.
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (sin x + cos y) / (cos x - sin y) * tg xy
 */

public class Linear03 {

	public static void main(String[] args) {
		
		double x = 2.0;
		double y = 10.0;
		
		double result;
		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println("\"x\"=" + x + '\t' + "\"y\"=" + y + '\n' + "The result of \"(sin x + cos y) / (cos x - sin y) * tg xy\" is " + result);
	}
}
