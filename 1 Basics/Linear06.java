package by.home.basics;

/*
 * ������ "�������� ���������".
 * ������ �6.
 * ��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �) ����������� ����������� �������, 
 * � false � � ��������� ������:
 */

public class Linear06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -0;
		int y = 0;
		System.out.println("Is the point with coordinates (" + x + ',' + y + ") belong to the area?");
		System.out.println( (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >=0 && y <= 4) );
	}
}
