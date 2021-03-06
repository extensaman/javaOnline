package by.home.programmingclass.simple03;

/**
* Этап "Programming with classes"
* Раздел "Простейшие классы и объекты".
* Задача №03.
* 
* Класс Runner предназначен для обеспечения возможности функционирования классов Student и StudentSample
* 
* @author extensaman
* @version 1.0
*/

public class Runner {

	public static void main(String[] args) {
		
		System.out.println ("-= Empty student creation example =-\n");
		Student st1 = new Student ();
		System.out.println(st1);
		
		System.out.println ("-= Student creation example =-\n");
		Student st2 = new Student ("Иванов И.И.", "А1290", new byte[] {2,3,7,8,9});
		System.out.println(st2);
		
		System.out.println ("-= Creation and adding students to just created student's sample =-\n");
		StudentSample studentSample = new StudentSample ();
		
		studentSample.addStudentToSample(st1);
		studentSample.addStudentToSample(st2);
		studentSample.addStudentToSample(new Student ("Петров П.П.", "D231", new byte[] {4,5,9,7,5}));
		studentSample.addStudentToSample(new Student ("Козлов А.П.", "D231", new byte[] {8,5,4,7,9}));
		studentSample.addStudentToSample(new Student ("Рубенов В.П.", "D231", new byte[] {9,9,10,10,9}));
		studentSample.addStudentToSample(new Student ("Мартиросян М.М.", "D232", new byte[] {3,5,6,7,9}));
		studentSample.addStudentToSample(new Student ("Вехов С.П.", "D232", new byte[] {9,5,6,7,3}));
		studentSample.addStudentToSample(new Student ("Ветров А.А.", "D231", new byte[] {9,5,10,7,9}));
		studentSample.addStudentToSample(new Student ("Пронин А.В.", "D232", new byte[] {9,10,10,10,9}));
		studentSample.addStudentToSample(new Student ("Лермонтов В.С.", "D232", new byte[] {9,9,10,9,9}));
		
		System.out.println(studentSample);
		
		System.out.println ("-= Create a sample of students with marks higher than 9 =-\n");
		StudentSample bestStudentSample = studentSample.sampleOfBestStudent(9);
		
		System.out.println(bestStudentSample);
	}

}
