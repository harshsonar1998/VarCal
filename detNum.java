package PracticeJava;
import java.util.Scanner;

public class detNum {
	public static void main(String[] args) {
		//Detnum
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the calculator that determines number is positive/negative/zero. The calculator will display true for positive num and false for negative number.");
		System.out.print("Enter your number to check: ");
		double num = input.nextDouble();
		
		if (num>0) {
			System.out.println("Entered number is p ositive.");
		}
		else  if(num==0) {
			System.out.println("Entered number is  equals to zero.");
		}
		else {
			System.out.println("Entered number is negative.");
		}
		
	}

}
