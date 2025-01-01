package myFunctions;

import java.util.Scanner;

public class printAverage {
	
	static int calculate_Average(int n1, int n2, int n3) {
		int average = (n1 + n2 + n3)/3;
		return average;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		System.out.print("Average = " + calculate_Average(n1, n2, n3));
	}

}
