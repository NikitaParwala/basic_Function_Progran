package myFunctions;

import java.util.Scanner;

public class voting_age {
	
	public static void is_age_eligible_to_vote(int age) {
		if(age >= 18) {
			System.out.print("Congratulations!! you're eligible to vote");
		}
		else {
			System.out.print("Sorry!! you're under age you cannot vote this time");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		
		is_age_eligible_to_vote(age);

	}

}
