package by.home.basics;

/*
 * Раздел "Линейные программы".
 * Задача №2.
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (b + sqrt(b*b + 4*a*c)) / 2*a - Math.pow(a,3) * c + Math.pow(b,-2) 
 */

public class Linear02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, result;
		a = 1.0;
		b = 1.0;
		c = 1.0;
		result = (b + Math.sqrt(b*b + 4.0*a*c)) / 2.0*a - Math.pow(a, 3.0) * c + Math.pow(b, -2.0);
		System.out.println("\"a\"=" + a + '\t' + "\"b\"=" + b + '\t' + "\"c\"=" + c + '\n' + "Result is " + result);
	}

}
