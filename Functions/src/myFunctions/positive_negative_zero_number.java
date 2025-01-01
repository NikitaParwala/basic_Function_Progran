package myFunctions;

import java.util.Scanner;

public class positive_negative_zero_number {
	static int positive = 0;
	static int negative = 0;
	static int zeroCount = 0;
	
	public static void calculate(int n) {

		if(n > 0) {
			positive++;
		}else if(n == 0){
			zeroCount++;
		}else {
			negative++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		while(on) {
			System.out.print("Enter any number : ");
			int n = sc.nextInt();
			calculate(n);
			System.out.println();
		}	
	}

}
