package by.home.basics;

/*
 * Раздел "Линейные программы".
 * Задача №3.
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (sin x + cos y) / (cos x - sin y) * tg xy
 */

public class Linear03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y,result;
		x = 2.0;
		y = 10.0;
		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
		System.out.println("\"x\"=" + x + '\t' + "\"y\"=" + y + '\n' + "The result of \"(sin x + cos y) / (cos x - sin y) * tg xy\" is " + result);
	}
}
