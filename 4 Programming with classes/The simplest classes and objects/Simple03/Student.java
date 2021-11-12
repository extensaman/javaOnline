package by.home.programmingclass.simple03;

import java.util.Arrays;

/**
* Этап "Programming with classes"
* Раздел "Простейшие классы и объекты".
* Задача №03.
* 
* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
* Создайте массив из десяти элементов такого типа. 
* Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
* 
* @author extensaman
* @version 1.0
*/

public class Student {
	
	private String surnameNamePatronymic;
	private String groupNumber;
	private byte[] academicPerformance = {0, 0, 0, 0, 0};
	
	Student () {}
	
	Student (String surnameNamePatronymic, String groupNumber, byte[] academicPerformance) {
		
		this.surnameNamePatronymic = surnameNamePatronymic;
		this.groupNumber = groupNumber;
		
		if (academicPerformance.length != 5) {
			
			this.academicPerformance = Arrays.copyOf(academicPerformance, 5);
			
		} else {
		
			this.academicPerformance = academicPerformance;
			
		}
		
	}
	
	public byte[] getAcademicPerformance () {
		
		return this.academicPerformance;
	}
	
	@Override
	public String toString () {
		
		return "Student: " + this.surnameNamePatronymic + "\nGroup number: " + this.groupNumber + "\nAcademic performance: " + Arrays.toString(this.academicPerformance) + '\n';
	}

}
