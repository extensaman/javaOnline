package by.home.programmingclass.simple01;

/**
* Этап "Programming with classes"
* Раздел "Простейшие классы и объекты".
* Задача №01.
* 
* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
* Добавьте метод, который находит сумму значений этих переменных, и метод, 
* который находит наибольшее значение из этих двух переменных.
* 
* @author extensaman
* @version 2.0
*/

public class Test1 {
	
	private int a;
	private int b;

	@Override
	public String toString() {

		return "Variable \'a\' is " + a + ", variable \'b\' is " + b;
	}

	public void setA(int a) {

		this.a = a;
	}

	public void setB(int b) {

		this.b = b;
	}

	public int sumAB() {

		return a + b;
	}

	public int getBigger() {

		return a > b ? a : b;
	}

}
