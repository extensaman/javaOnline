package by.home.string.asarray;

/*
* Этап "Strings and basics of of text processing"
* Раздел "Работа со строкой как с массивом символов".
* Задача №01.
* Дан массив названий переменных в camelCase. 
* Преобразовать названия в snake_case.
*/

public class AsArray01 {

	 private static String [] strArray = {
			"helloWorld",
			"helloworld",
			"mjsdkfskjdflskflksdf;ksd;flksd'fks'lfks'dfksd'flksdlfksdflksdlfks'dkff2304=-934028949283",
			"апажпоалдпоапо оывплоыапоыждпо ЛЖДЛПвып ЛЖДЛФВУпа ФЭВАЛ эфВЭАл эФВаэfskdf;lk;PLK",
			"varCamelSda",
			"eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeRrrrrrrrrrrrrrrrrrrrrrrrrrr",
			"HHHHbbbJJJJJ",
			"dY"
};
	
	public static void main(String[] args) {
		
		for (int i = 0; i < strArray.length; i++) {
			
			char[] camel = strArray[i].toCharArray();
			
			int snakeSize = calculateSnakeSize(strArray[i]);
			
			char[] snake = new char[snakeSize];
			
			int index = 0;
			
			int j;
			for (j = 1; j < camel.length; j++) {
				
				snake[index++] = camel[j - 1];

				if (Character.isLowerCase(camel[j - 1]) && Character.isUpperCase(camel[j])) {
					
					snake[index++] = '_';
					snake[index++] = Character.toLowerCase(camel[j]);
					j++;
					
				} 
			}
			
			if (j <= camel.length) {
				
				snake[index] = camel[j - 1];

			}
			
			strArray[i] = new String(snake);
		}
		
		printArray ("Variables in \'snake_case\' are", strArray);
	
	}

	///////////////////////////////////////////////////////////
	// Печатает в консоль сообщение 'message' и массив 'a'
	
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
	
	///////////////////////////////////////////////////////////
	// Вычисляет размер имени переменной snake_case
	
	public static int calculateSnakeSize (String camel) {
		
		int counter = 0;
		
		for (int i = 0; i < camel.length() - 1; i++) {
			
			if (Character.isLowerCase(camel.charAt(i)) && Character.isUpperCase(camel.charAt(i + 1))) {
				
				counter++;
			}
		}
		
		return camel.length() + counter;
	}
}
