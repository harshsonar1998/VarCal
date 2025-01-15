package javaPrac;
import java.util.Scanner;

public class commInp {
	public static int[] [] numarray() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = input.nextInt();
		System.out.print("Please enter the number of col: ");
		int col = input.nextInt();
		int[][] arr = new int[rows] [col];
		
		int i=0;
		
		while(i<rows) {
			int j = 0;
			while(j <col) {
				System.out.print("Please enter the rows: "  + (i+1 )+ "col: " + (j+1) + ": ");
				arr[i][j] = input.nextInt();
				j++;
			}
			i++;
			}
		return arr;
	}
	
	

}
