package PracticeJava;
import java.util.Scanner;


public class ageCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//diffAgeGroups
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Age classification.");
		System.out.print("Please enter your for the classification: ");
		int age = input.nextInt();
		
		if (age<13) {
			System.out.println("You're an child.");
		}
		else if (age >=13 && age<20) {
			System.out.println("You're an teen.");
		}
		else if (age>=20 &&age <60) {
			System.out.println("You're an adult.");
		}
		else if (age >=60) {
			System.out.println("You're an senior citizen.");
		}
	}

}
