package varCal;
import java.util.Scanner;

public class areaOfTriangle {
	public static void main(String[] args) {
		//calculating perimeter of triangle
		Scanner tri = new Scanner(System.in);
		System.out.println("Welcome to AreaCal");
		System.out.print("Enter your base value: ");
		double base = tri.nextDouble();
		System.out.print("Enter your height value: ");
		double height = tri.nextDouble();
		
		double area = 1.0/2*(base*height);
		System.out.println("Calculating the area of triangle");
		System.out.println("The calculated area of triangle is " + area);
		
	}

}
