package PracticeJava;
import java.util.Scanner;

public class leapFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to leapfind.");
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		if (year % 4 ==0 && year % 100 != 0 || year % 400 ==0) {
			System.out.println("The Entered year is an leap year.");
		}
		else  {
			System.out.println("The entered year is not an leap year.");
		}
		
	}

}
