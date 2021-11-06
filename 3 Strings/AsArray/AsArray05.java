package by.home.string.asarray;

import java.util.Arrays;
import java.util.Scanner;

/**
* Этап "Strings and basics of of text processing"
* Раздел "Работа со строкой как с массивом символов".
* Задача №05.
* Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. 
* Крайние пробелы в строке удалить
* @author extensaman
* @version 1.0
*/

public class AsArray05 {

	public static void main(String[] args) {

		String str = enterString("Enter a string: ");
		
		String strWithoutExtraSpace = deleteExtraSpaceFromString(str);

		System.out.println("String without extra spaces:" + strWithoutExtraSpace);
		
	}

	/**
	* Возвращает введенную с консоли строку
	* @author extensaman
	* @version 1.0
	*/
	
	public static String enterString(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		if (message != null) {
			
			System.out.println(message);
		}

		return sc.nextLine();
	}
	
	/**
	* Возвращает строку с удаленными лишними пробелами (то есть серии подряд идущих пробелов заменяются на одиночные пробелы) 
	* @author extensaman
	* @version 1.0
	*/
	
	public static String deleteExtraSpaceFromString (String str) {
		
		if (str == null) {
			
			return null;
			
		}
		
		char[] originalMas = str.toCharArray();
		
		int counter = 0;
		
		for (int i = 0; i < originalMas.length; i++) {
			
			if (originalMas[i] == ' ') {
				
				while (++i < originalMas.length && originalMas[i] == ' ') {
					
					counter++;
					
				}
			}
		}
		
		char[] resultingMas = new char[originalMas.length - counter];
		
		int index = 0;
		
		for (int i = 0; i < originalMas.length; i++) {
			
			resultingMas[index++] = originalMas[i];
			
			if (originalMas[i] == ' ') {
					
					while (++i < originalMas.length && originalMas[i] == ' ') {}
					i--;
			
			}
			
		}
		
		resultingMas = trimCharArray(resultingMas);;
		
		return String.valueOf(resultingMas); 
		
	}
	
	/**
	* Возвращает char[], у которого удалены начальный и конечный пробелы, если такие были 
	* @author extensaman
	* @version 1.0
	*/
	
	public static char[] trimCharArray (char[] mas) {
		
		if (mas == null) {
			
			return null;
			
		}
		
		if (mas.length > 0 && mas[0] == ' ') {
			
			mas = Arrays.copyOfRange(mas, 1, mas.length);
		
		}
			
		if (mas.length > 0 && mas[mas.length - 1] == ' ') {
			
			mas = Arrays.copyOfRange(mas,  0, mas.length - 1);
		}
		
		return mas;
	}
}
