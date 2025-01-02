package varCal;
import java.util.Scanner;


public class productOfTwoFloatingNum {
	public static void main(String[] args) {
		//float num calculator
		Scanner fl = new Scanner(System.in);
		System.out.println("Welcome to the floating calculator for two numbers!!");
		System.out.print("Enter your first float number to be calculated: ");
		float a = fl.nextFloat();
		System.out.print("Enter your second float number to be calculated: ");
		float b = fl.nextFloat();
		float Fl = a*b;
		System.out.println("Performing product of two Floats");
		System.out.println(Fl);
		
	}
}
