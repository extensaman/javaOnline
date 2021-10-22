package by.home.basic.linear;

/*
 * Раздел "Линейные программы".
 * Задача №4.
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Linear04 {

	public static void main(String[] args) {
		
		double r = 999.888;
		
		int temp = (int) r;
		
		double result = r * 1000.0 - temp * 1000.0 + temp / 1000.0;
		
		System.out.println("\"R\"=" + r + '\n' + "The result is " + result);
	}

}
