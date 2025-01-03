package varCal;
import java.util.Scanner;

public class permiOfRec {
	public static void main(String[] args) {
		//RectaPeri
		Scanner peri = new Scanner(System.in);
		System.out.println("Welcome to the RectaPeri calculator!");
		System.out.print("Let's calculate the perimeter of a rectangle! What's the 1 side: ");
		double len = peri.nextDouble();
		System.out.print("Let's calculate the perimeter of a rectangle! What's the 2 side: ");
		double Len = peri.nextDouble();
		System.out.print("Let's calculate the perimeter of a rectangle! What's the 3 side: ");
		double LeN = peri.nextDouble();
		System.out.print("Let's calculate the perimeter of a rectangle! What's the 4 side: ");
		double LEN = peri.nextDouble();
		
		double pr= len+Len+LeN+LEN;
		System.out.println("Calculating the perimeter of rectangle....");
		System.out.println("The perimeter of given rectangle is "+ pr);
		
	}

}
