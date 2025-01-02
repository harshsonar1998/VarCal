package varCal;
import java.util.Scanner;

public class simpleInterest {
	public static void main(String[] args) {
		//SI calculator
		Scanner si = new Scanner(System.in);
		System.out.println("Welcome to the Simple Interest Calculator!");
		System.out.print("Enter the Principal amount: ");
		double p = si.nextDouble();
		System.out.print("Enter the Rate of Interest (in%): ");
		double r = si.nextDouble();
		System.out.print("Enter the time (T) in years: ");
		double t = si.nextDouble();
		
		double SI = (p*t*r)/100;
		System.out.println("Calculating Simple Interest.....");
		System.out.println("The calculated simple Interest is " + SI);
		double sum = SI+p;
		System.out.println("Your total end balance will be " + sum);
}
}