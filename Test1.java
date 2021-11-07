package by.home.programmingclass.simple01;

/**
* ���� "Programming with classes"
* ������ "���������� ������ � �������".
* ������ �01.
* 
* �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ���� ����������. 
* �������� �����, ������� ������� ����� �������� ���� ����������, � �����, 
* ������� ������� ���������� �������� �� ���� ���� ����������.
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
