package PracticeJava;
import java.util.Scanner;

public class findGreatestNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to GreCal.");
		System.out.print("Enter your 1st number: ");
		double num = input.nextDouble();
		System.out.print("Enter your 2nd number: ");
		double nums = input.nextDouble();
		System.out.print("Enter your 3rd number: ");
		double numb = input.nextDouble();
		
		if (num >=nums && num>=numb) {
			System.out.println("From the largest number you entered is " + num);
		}
		else if (nums>=num && nums>=numb) {
			System.out.println("From the largest number you entered is " + nums);
		}
		else if (numb>=num && numb>=nums) {
			System.out.println("From the largest number you entered is " + numb);
		}

	}

}
