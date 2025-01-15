package javaPrac;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


import java.lang.reflect.Array;

public class arrPrac {

	public static void main(String[] args) {
		// The Scanner file for this can be found by commInc name.
		// TODO Auto-generated method stub
		//int [] array = commInp.numarray();
		//long su = add(array);
		//avg(array, su);
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter the number you want to find out from the list: ");
		int num = input.nextInt();*/
		//occurance(array,num);
		//max(array);
		//min(array);
		/*boolean inc = increasing(array);
	    boolean dec = decreasing(array);
		if (inc || dec) {
			System.out.print("Your array is sorted.");
		}
		else {
			System.out.print("Your array is not sorted.");
		}*/
		//reverse(array);
		/*boolean ispali = pali(array);
		if (ispali) {
			System.out.println("The array is an palindrome sequence.");
		}
		else {
			System.out.println("The array is not an palindrome sequence.");
		}*/
		/*int [] array1 = commInp.numarray();
		int [] array2 = commInp.numarray();
		merge(array1, array2);*/
		int[][] arrays = commInp.numarray();
		Scanner input = new Scanner(System.in);
		System.out.print("Now enter the you want to search: ");
		int num = input.nextInt();
		boolean isfound = search2d(arrays ,num);
		if(isfound) {
			System.out.println("Your number was found in the array list.");
		}
		else {
			System.out.println("Your number was not found in the array list.");
		}
		
		
		

	}
	public static long add(int [] array) {
		long sum =0;
		int i=0;
		
		while(i < array.length) {
			sum += array[i];
			i++;
		}
		System.out.println("The sum of entered number is " + sum);
		return sum;
	}
	public static double avg(int [] array, long sum) {
		double average = (double)sum/array.length;
		System.out.print("The average of entered number is " + average);
		return average;
	}
	public static int occurance(int [] array, int num) {
		int sum =0;
		int i=0;
		
		while (i<array.length) {
			if (array[i] ==num) {
			sum++;
			}
			i++;
		}
		System.out.print("The occurance of entered number in the list is " + sum + " times");
		return sum;
	}
	public static int max(int [] array) {
		int sum =array[0];
		int i = 0;
		
		while (i<array.length) {
			if (array[i]>sum) {
				sum = array[i];
			}
			i++;
		}
		System.out.print("The maximum number in this list is " + sum);
		return sum;
	}
	public static int min(int [] array) {
		int sum =array[0];
		int i = 0;
		
		while (i<array.length) {
			if (array[i]<sum) {
				sum = array[i];
			}
			i++;
		}
		System.out.print("The maximum number in this list is " + sum);
		return sum;
	}
	public static boolean increasing(int [] array) {
		int i =1;
		
		while (i<array.length) {
			if(array[i] < array[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static boolean decreasing(int[] array) {
		int i=1;
		
		while(i<array.length) {
			if(array[i]>array[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void reverse(int [] array) {
		int i=0;

		while(i < array.length/2) {
			int temp = array[i];
			array[i] = array[(array.length -1) -i];
			array[(array.length -1) -i] = temp;
			i++;
			
		}
		System.out.println(Arrays.toString(array));
	}
	public static boolean pali(int [] array) {
		int i =0;
		
		while (i<array.length) {
			if (array[i] != array[(array.length - 1) -i ]) {
				return false;
			}
			i++;
		}
		return true;
		
	}
	public static int [] merge(int[] array1 , int [] array2) {
		int newsize = array1.length+array2.length;
		int [] newarrays = new int [newsize];
		
		int i =0, j=0, k=0;
		
		while(i<array1.length || j < array2.length) {
			if(j==array2.length || (i<array1.length && array1[i]<array2[j])) {
				newarrays[k] = array1[i];
				i++;
				k++;
			}
			else {
				newarrays[k] = array2[j];
				k++;
				j++;
			}
		}
		System.out.println(Arrays.toString(newarrays));
		return newarrays;
		
	}
	public static boolean search2d(int[][]arrays, int num) {
	    int i = 0; // Outer loop index

	    while (i < arrays.length) { // Loop over rows
	        int j = 0; // Inner loop index
	        while (j < arrays[i].length) { // Loop over columns in the current row
	            if (arrays[i][j] == num) {
	                return true; // Number found
	            }
	            j++; // Move to the next column
	        }
	        i++; // Move to the next row
	    }
	    return false; // Number not found
	}
}
	
	
	
	
	
	


