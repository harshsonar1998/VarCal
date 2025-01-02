package varCal;
import java.util.Scanner;

public class basicCalculatorForTwoArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic operators
		Scanner input = new Scanner(System.in);		
		System.out.println("Welcome to arithmetic calculator! just enter the two numbers and we will calculate all the arithmetic operatins for you!");
		System.out.print("Enter your first number for basic arithmetic operations: ");
		double a = input.nextDouble();
		System.out.print("Enter your second number for basic arithmetic opertations: ");
		double b = input.nextDouble();
		
		double add = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		double mod = a%b;
		
		System.out.println("Perforing the basic arithmetic operations...");
		System.out.println("you're addition of two numbers are "+ add);
		System.out.println("you're substraction of two numbers are "+ sub);
		System.out.println("you're multiplication of two numbers are "+ mul);
		System.out.println("you're division of two numbers are "+ div);
		System.out.println("you're modulus of two numbers are "+ mod);
}

}
