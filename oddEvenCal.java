package PracticeJava;
import java.util.Scanner;

public class oddEvenCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the odd/even calculator.");
		System.out.print("Enter your number to check if it's odd or even: ");
		int num  = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Entered number is even.");
		}
		else {
			System.out.println("Entered number is odd.");
		}
		

	}

}
