package by.home.algorithmization;

/*
* ���� "��������������"
* ������ "����������".
* ������ �6.
* ���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������.
* �������� ��� ��������� �������: ������������ ��� �������� �������� ai � ai+1.
* ���� ai <= ai+1, �� ������������ �� ���� ������� ������. ���� ai > ai+1, 
* �� ������������ ������������ � ���������� �� ���� ������� �����.
* ��������� �������� ���� ����������
*/

public class Sorting06 {

	public static void main(String[] args) {
		
		int n; // dimension of array
		n = (int) (Math.random() * 20.0) + 2;
		
		double[] a = new double[n];
		
		// Generate elements
		for (int i = 0; i < n; i++) {
			a[i] = (Math.random() * 100.0) - 50.0;
		}
		
		System.out.println("Original array is");
		printArray(a);
		
		for (int i = 0; i < n - 1; i++) {
			
			if (a[i] > a[i + 1]) {
			
				double temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				
				for (int j = i; j > 0; j--) {
					
					if (a[j] < a[j - 1]) {
						
						temp = a[j];
						a[j] = a[j  - 1];
						a[j - 1] = temp;
						
					} else {
						
						break;
					}
				}
			}
		}
		
		// Print result
		System.out.println("\nSorted array is");
		printArray(a);
	}
	
	public static void printArray (double[] a) {
		
		for (double element: a) {
			System.out.printf("%+6.1f", element);
		}
	}
}
