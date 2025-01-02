package varCal;
import java.util.Scanner;

public class permiOfRec {
	public static void main(String[] args) {
		//RectaPeri
		Scanner peri = new Scanner(System.in);
		System.out.println("Welcome to the RectaPeri calculator!");
		System.out.print("Let's calculate the perimeter of a rectangle! What's the length: ");
		double len = peri.nextDouble();
		System.out.print("Great! Now, what's the width: ");
		double wid = peri.nextDouble();
		
		double pr= 2*(len+wid);
		System.out.println("Calculating the perimeter of rectangle....");
		System.out.println("The perimeter of given rectangle is "+ pr);
		
	}

}
