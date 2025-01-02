package varCal;
import java.util.Scanner;


public class degreeBuddy {

	public static void main(String[] args) {
		// DegreeBuddy
		Scanner d = new Scanner(System.in);
		System.out.println("Welocme to the degreeBuddy calculator!!. This calculator converts the Farenhit to Celcius");
		System.out.print("Enter the Fahrenheit temperature, and I'll convert it for you: ");
		double con = d.nextDouble();
		double cal = (con-32)*5/9;
		System.out.println("The System is converting the temperature for you....");
		System.out.println("Guess what! the value in the celcius is " + cal);

	}

}
