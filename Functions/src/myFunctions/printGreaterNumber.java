package myFunctions;

import java.util.Scanner;

public class printGreaterNumber {
	
	public static int greater_Number(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}else {
			return n2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.print(greater_Number(n1, n2) +" is greator than ");

	}

}
