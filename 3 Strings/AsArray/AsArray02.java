package by.home.string.asarray;

/*
* Этап "Strings and basics of of text processing"
* Раздел "Работа со строкой как с массивом символов".
* Задача №02.
* Замените в строке все вхождения 'word' на 'letter'.
*/

public class AsArray02 {

	public static void main(String[] args) {
		
		String str = "wordsdfkjaslk1wordwordfWORD_word";
		
		System.out.println("Original string: " + str);
		
		char[] oldArray = str.toCharArray();
		
		int counter = 0;
		
		// Подсчитываем количество вхождений слова 'word' в исходной строке для определения размера результирующего массива 
		for (int i = 0; i < oldArray.length; i++) {
			
			if (isWordInIndex(oldArray, i)) {
				
				counter++;
				i += 3;
				
			}
		}
		
		System.out.println("Count of \'word\' is " + counter);
		
		// Создаем результирующий массив
		char[] newArray = new char[str.length() + counter * 2];
		
		int index = 0;
		
		// Проходимся еще раз по oldArray и заменяем все 'word' на 'letter'
		for (int i = 0; i < oldArray.length; i++) {
			
			if (isWordInIndex(oldArray, i)) {
				
				newArray[index++] = 'l';
				newArray[index++] = 'e';
				newArray[index++] = 't';
				newArray[index++] = 't';
				newArray[index++] = 'e';
				newArray[index++] = 'r';
				i += 3;
				
			} else {
				
				newArray[index++] = oldArray[i];
			}
		}
		
		String result = new String (newArray);
		
		System.out.println("Resulting string: " + result);

	}

	// Возвращает 'true', если с индекса 'index' в массиве 'str' начинается слово 'word'
	public static boolean isWordInIndex (char[] str, int index) {
		
		if (index + 4 > str.length) {
			
			return false;
			
		}
		
		if (str[index] == 'w' && str[index + 1] == 'o' && str[index + 2] == 'r' && str[index + 3] == 'd') {
			
			return true;
			
		} else {
	
			return false;
			
		}
	}
}
