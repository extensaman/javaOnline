package by.home.basics;

/*
 * ������ "�����".
 * ������ �3.
 * ����� ����� ��������� ������ ��� �����.
 */

public class Cycles03 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i*i;
		}
		
		System.out.println("The sum of squared numbers from 1 to 100 is " + sum);
	}
}
