package by.home.programmingclass.simple02;

/**
* Этап "Programming with classes"
* Раздел "Простейшие классы и объекты".
* Задача №02.
* 
* Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
* Добавьте конструктор, инициализирующий члены класса по умолчанию. 
* Добавьте set- и get- методы для полей экземпляра класса
* 
* @author extensaman
* @version 2.0
*/

public class Test2 {

	private int a;
	private int b;
	
	public Test2 (int a, int b) {
		
		setAB (a, b);
		
	}
	
	public Test2() {
		
		this ((int) (Math.random() * 10.0), (int) (Math.random() * 10.0));

	}
	
	public void setA (int a) {
		
		this.a = a;
	}
	
	public void setB (int b) {
		
		this.b = b;
		
	}
	
	public void setAB (int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	public int getA () {
		
		return a;
		
	}
	
	public int getB () {
		
		return b;
		
	}
	
	public String toString () {
		
		return "Object: " + super.toString() + "\n\'a\' = " + a + ", \'b\' = " + b;
		
	}
}
