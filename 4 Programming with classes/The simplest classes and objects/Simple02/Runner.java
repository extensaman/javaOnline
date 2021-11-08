package by.home.programmingclass.simple02;

/**
* Этап "Programming with classes"
* Раздел "Простейшие классы и объекты".
* Задача №02.
* 
* Класс Runner преназначен для обеспечения возможности функционирования класса Test2
* 
* @author extensaman
* @version 1.0
*/

public class Runner {

	public static void main(String[] args) {

		Test2 obj1 = new Test2 ();
		System.out.println(obj1);
		
		obj1.setA(99);
		obj1.setB(88);
		System.out.println(obj1);
		
		Test2 obj2 = new Test2 (6,3);
		System.out.println(obj2);
		
		obj2.setAB(obj1.getA(), obj1.getB());
		System.out.println(obj2);
	}

}
