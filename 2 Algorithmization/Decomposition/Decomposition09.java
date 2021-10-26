package by.home.algorithm.decomp;

import java.util.Scanner;

/*
* Этап "Алгоритмизация"
* Раздел "Декомпозиция".
* Задача №9.
* Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
* если угол между сторонами длиной X и Y — прямой.
*/

public class Decomposition09 {

	public static void main(String[] args) {

		double x;
		x = inputDoubleMoreZero("Enter side X size of quadangle: ");
		
		double y;
		y = inputDoubleMoreZero("Enter side Y size of quadangle: ");
		
		double z;
		z = inputDoubleMoreZero("Enter side Z size of quadangle: ");
		
		double t;
		t = inputDoubleMoreZero("Enter side T size of quadangle: ");
		
		double diagonal;
		diagonal = Triangle.calculateHypotenuse(x, y);
		
		Triangle tr1 = new Triangle (x, y, diagonal);
		Triangle tr2 = new Triangle (z, t, diagonal);
		
		if (tr1.isExist() && tr2.isExist()) {
			
			System.out.println("The quadangle with sides " + x + ", " + y + ", " + z + ", " + t + " has square = " + 
								(tr1.getSquare() + tr2.getSquare()) );
		} else {
			
			System.out.println("The quadangle with sides " + x + ", " + y + ", " + z + ", " + t + " is not exist.");
			
		}
	}

	///////////////////////////////////////////////////////////
	// Возвращает положительное число (double), введенное с клавиатуры 
	
	public static double inputDoubleMoreZero (String message) {
		@SuppressWarnings ("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		double result;
		
		while (!sc.hasNextDouble() || (result = sc.nextDouble()) <= 0.0) {
			
			System.out.println("Wrong data. Enter double (> 0)\n" + message);
			sc.nextLine();
		}
		
		return result;
	}
	
}

class Triangle {
	
	private boolean exist;
	
	private double square;
	
	Triangle (double a, double b, double c) {
		
		if (a + b > c && b + c > a && a + c > b) {
			
			square = calculateSquare (a, b, c);
			exist = true;
		}	
	}
	
	double calculateSquare (double a, double b, double c) {
		
		double p = (a + b + c) / 2.0;
		
		return Math.sqrt( p * (p - a) * (p - b) * (p - c));
	}
	
	double getSquare() {
		
		return square;
		
	}
	
	boolean isExist() {

		return exist;
		
	}
	
	public static double calculateHypotenuse (double a, double b) {
		
		return Math.sqrt(a * a + b * b);
		
	}
}