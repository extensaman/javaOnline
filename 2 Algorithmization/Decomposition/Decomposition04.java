package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №4.
* На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
* Указание. Координаты точек занести в массив.
*/

public class Decomposition04 {

	public static void main(String[] args) {

		int n; // Количество точек
		
		n = inputIntMoreOne("Введите количество точек на плоскости:");
		
		Point[] mas;
		
		mas = generateRandomPointArray (n);
		
		printPointArray("Массив точек на плоскости следующий:", mas);
		
		Point[] result;
		
		result = maxDistanceSearch (mas);
		
		printPointArray("Cамое большое расстояние между следующими точками:", result);

	}

	///////////////////////////////////////////////////////////
	// Возвращает целое положительное число (> 1), введенное с клавиатуры 
	
	public static int inputIntMoreOne (String message) {
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner (System.in);
		
		int m;
		System.out.println(message);
		
		while (!sc.hasNextInt() || (m = sc.nextInt()) <= 1) {
			
			System.out.println("Wrong data input. Enter an integer (2 <= .. <= " + Integer.MAX_VALUE + ")\n" + message);
			sc.nextLine();
		}
		
		return m;
	}
	
	///////////////////////////////////////////////////////////
	// Создает массив точек Point[] mas, заполненный новыми точками со случайно сгенерированными координатами от -50 до +50 
	
	public static Point[] generateRandomPointArray (int n) {
		
		Point[] mas = new Point[n];
				
		for (int i = 0; i < mas.length; i++) {
			
			int x = (int) (Math.random() * 100.0) - 50;
			int y = (int) (Math.random() * 100.0) - 50;
			mas[i] = new Point(x, y);
			
		}
		
		return mas;
	}
	
	///////////////////////////////////////////////////////////
	// Выводит в консоль сообщение 'message' и печатает координаты всех точек массива 'mas' 
	
	public static void printPointArray (String message, Point[] mas) {
		
		System.out.println(message);
		
		for (Point p : mas) {
			
			System.out.println(p);
			
		}
	}
	
	///////////////////////////////////////////////////////////
	// Возвращает массив, состоящий из 2-х точек массива 'mas', расстояние между которыми максимально 
	
	public static Point[] maxDistanceSearch (Point[] mas) {
		
		double maxDistance = 0.0;
		Point[] result = new Point[2];
		result[0] = mas[0];
		result[1] = mas[1];
		
		for (int i = 0; i < mas.length - 1; i++) {
			
			for ( int j = i + 1; j < mas.length; j++) {
				
				double distance = distanceBetweenTwoPoint(mas[i], mas[j]); 
				
				if (distance > maxDistance) {
					
					maxDistance = distance;
					result[0] = mas[i];
					result[1] = mas[j];
				}
			}
			
			// Отображение прогресса (полезно при количестве точек > 100_000)
			// System.out.printf("%.2f\r", ((double) i / mas.length) * 100.0);
		}
		
		return result;
	}
	
	///////////////////////////////////////////////////////////
	// Возвращает расстояние между двумя точками на плоскости 
	
	public static double distanceBetweenTwoPoint (Point a, Point b) {
		
		return Math.sqrt( (a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()) );
	}
	
}

class Point {
	
	private final int id;
	private static int counter;
	
	private int x;
	private int y;
	
	Point () {
		
		id = ++counter;
	}
	
	Point (int x, int y) {
		
		this.x = x;
		this.y = y;
		id = ++counter;
		
	}
	
	public int getX() {
		
		return x;
		
	}
	
	public int getY() {
		
		return y;
		
	}
	
	@Override
	public String toString() {
		
		return "Точка №" + id + " имеет координаты x = " + x + ", y = " + y;
		
	}
	
}