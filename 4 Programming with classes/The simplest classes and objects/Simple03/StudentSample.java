package by.home.programmingclass.simple03;

/**
* Этап "Programming with classes"
* Раздел "Простейшие классы и объекты".
* Задача №03.
* 
* Вспомогательный класс для осуществления выборок студентов
* 
* @author extensaman
* @version 1.0
*/

public class StudentSample {

	public static final int SAMPLE_COUNT_LIMIT = 10;
	private Student[] sample;
	private int count;
	
	public StudentSample () {
		
		this.sample = new Student[SAMPLE_COUNT_LIMIT];
	}
	
	public void addStudentToSample (Student st) {
		
		if (this.count < this.sample.length) {
			
			this.sample[this.count++] = st;
			System.out.println("SAMPLE OPERATION \'ADD\' IS DONE FOR\n" + st);
			
		} else {
			
			System.out.println("Reached limit of \'SAMPLE_COUNT_LIMIT\'");
			
		}
	}
	
	public StudentSample sampleOfBestStudent (int lowLimit) {
		
		StudentSample bestStudentSample = new StudentSample();
		
		for (int i = 0; i < this.count; i++) {
			
			byte[] academicPerformance = sample[i].getAcademicPerformance();
			
			int j;
			
			for (j = 0; j < academicPerformance.length; j++) {
				
				if (academicPerformance[j] < lowLimit) {
					
					break;
					
				}
				
			}

			if (academicPerformance.length == j) {
				
				bestStudentSample.addStudentToSample(this.sample[i]);
			}
			
		}
		
		return bestStudentSample;
	}
	
	@Override
	public String toString () {
		
		StringBuffer strBuf = new StringBuffer();
		
		System.out.println("STUDENTS SAMPLE IS ");
		
		for (int i = 0; i < this.count; i++) {
			
			strBuf.append(sample[i].toString()).append('\n');
			
		}
		
		return strBuf.toString();
	}
}
