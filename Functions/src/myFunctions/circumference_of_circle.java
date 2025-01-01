package myFunctions;

import java.util.Scanner;

public class circumference_of_circle {

	public static double calculate_circumference(double r) {
		double c;
		final double pi = 3.14;
		c = 2 * pi * r;
		
		return c;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		double r = sc.nextDouble();
		
		System.out.print("Circumference of circle : "+ calculate_circumference(r));

	}

}
