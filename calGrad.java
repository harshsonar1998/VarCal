package PracticeJava;
import java.util.Scanner;

public class calGrad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Gradcal to Improve based on your grading.");
		System.out.print("Enter your overall percentage to see where you need an extra work: ");
		double grad = input.nextDouble();
		
		if (grad>=90) {
			System.out.println("Good you did a lot of hardwork and Excellence acheived.");
		}
		else if (grad>=75 && grad<90) {
			System.out.println("You're in the range of above average. Take the help of TA's and meet prof. to acheive the excellence");
		}
		else if (grad >=60 && grad<75) {
			System.out.println("You're in the range of competent and need to speak to prof. ASAP.");
		}
		else if (grad>=30 && grad<60) {
			System.out.println("You're still in a room for improvement and speak to prof. ASAP.");
		}
		else {
			System.out.println("Fail-keep trying and meet with one of the prof. and HOD of the dept.");
		}

	}

}
