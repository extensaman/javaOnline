package by.home.basic.linear;

/*
* Раздел "Линейные программы".
* Задача №6.
* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, 
* и false — в противном случае:
*/

public class Linear06 {

	public static void main(String[] args) {
		
		int x = -1;
		int y = 0;
		
		System.out.println("Is the point with coordinates (" + x + ',' + y + ") belong to the area?");
		
		System.out.println( (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >=0 && y <= 4) );
	}
}
