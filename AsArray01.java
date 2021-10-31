package by.home.string.asarray;

import java.util.Scanner;

/*
* ���� "Strings and basics of of text processing"
* ������ "������ �� ������� ��� � �������� ��������".
* ������ �01.
* ��� ������ �������� ���������� � camelCase. 
* ������������� �������� � snake_case.
*/

public class AsArray01 {

	 private static String [] strArray = {
			"helloWorld",
			"helloworld",
			"mjsdkfskjdflskflksdf;ksd;flksd'fks'lfks'dfksd'flksdlfksdflksdlfks'dkff2304=-934028949283",
			"�������������2104-9������2-30940-  ��32�40 023940   324 -0324 ���������",
			"varCamel",
			"eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeRrrrrrrrrrrrrrrrrrrrrrrrrrr"
};
	
	public static void main(String[] args) {
		
		for (int i = 0; i < strArray.length; i++) {
			
			char[] camel = strArray[i].toCharArray();
			char[] snake = new char[camel.length + 1];
			int index = 0;
			
			for (int j = 0; j < camel.length; j++) {
				
				char ch = camel[j];
				
				if (Character.isUpperCase(ch)) {
					
					snake[index++] = '_';
					snake[index++] = Character.toLowerCase(ch);
										
				} else {
					
					snake[index++] = ch;
					
				}
			}
			
			strArray[i] = String.copyValueOf(snake);
		}
		
		printArray ("Variables in \'snake_case\' are", strArray);
	
	}

	///////////////////////////////////////////////////////////
	// �������� � ������� ��������� 'message' � ������ 'a'
	
	public static void printArray (String message, String[] a) {

		if (a == null || message == null) {
			
			System.out.println ("Bad reference in \'void printArray (String message, String[] a)\'\n");
			return;
		}
		
		System.out.println(message);

		for (int i = 0; i < a.length; i++) {

			System.out.printf("%s\n", a[i]);
			
		}
	}
}
