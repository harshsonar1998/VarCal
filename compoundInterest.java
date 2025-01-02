package varCal;
import java.util.Scanner;

public class compoundInterest {
	public static void main(String[] args) {
		//compoundingCal
		Scanner ci = new Scanner(System.in);
		System.out.println("Welcome to the compounding calculator!!");
		System.out.print("Hey there! Let's grow your money with compound interest! Enter the principal amount: ");
		double P = ci.nextDouble();
		System.out.print("What's the annual interest rate (in %): ");
		double R = ci.nextDouble();
		System.out.print("How many years will this grow: ");
		double T = ci.nextDouble();
		System.out.print("How often is the interest compounded each year: ");
		double n = ci.nextDouble();
		
		double CI = P*Math.pow(1+ (R/(n*100)), n*T);
		double Ci = CI- P;
		System.out.println("Let’s see how your money multiplies over time!");
		System.out.println("The Compound Interest of your money is " + CI);
		System.out.println("The Amount after " + T + " years will be " + Ci);
		
		
		
	}
}
