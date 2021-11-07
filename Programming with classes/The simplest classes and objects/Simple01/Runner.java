package by.home.programmingclass.simple01;

/**
* Этап "Programming with classes"
* Раздел "Простейшие классы и объекты".
* Задача №01.
* 
* Класс Runner преназначен для обеспечения возможности функционирования класса Test1
* 
* @author extensaman
* @version 1.0
*/

public class Runner {

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		
		obj.setA(2);
		obj.setB(3);
		
		System.out.println(obj);
		
		System.out.println("a + b = " + obj.sumAB());
		
		System.out.println("The biggest number is " + obj.getBigger());

	}

}
