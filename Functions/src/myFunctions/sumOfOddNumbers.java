package myFunctions;

import java.util.Scanner;

public class sumOfOddNumbers {
	
	public static int calculate_sum_of_odd_numbers(int n) {
		int sum = 0;
		for(int i = 1; i<=n ; i++) {
			if(i%2 != 0) {
				sum = sum + i;
			}
		}				
		return sum;

		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to calculate Sum of Odd numbers : ");
		int n = sc.nextInt();
		
		System.out.print("Sum = " + calculate_sum_of_odd_numbers(n));

	}

}
