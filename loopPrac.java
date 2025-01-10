package pracJava;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greeting();
		//multi();
		//System.out.println(oddS());
		//System.out.println(fac());
		//System.out.println(lcm());
		//System.out.println(prime());
		//System.out.print(sum());
		//reverse();
		//pali();
		//fibo();
		

	}
	public  static void greeting() {
		System.out.println("Welcome to the Java Practice Session.");
	}
	public static void multi() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number for the multiplication table: ");
		int num =  input.nextInt();
		int i =1;
		while (i<=10) {
			System.out.println(num*i);
			i++;
		}
	}
	public static int oddS() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number till you want the summation: ");
		int num = input.nextInt();
		int sum =0;
		int i =1;
		while (i<=num) {
			sum+=i;
			i+=2;
		}
		return sum;
	}
	public static long fac() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number for the factorial: ");
		long num = input.nextLong();
		long facto =1;
		int i =1;
		while (i<=num) {
			facto *= i;
			i++;
		}
		return facto;
	}
	public static int lcm() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st number for the LCM: ");
		int f = input.nextInt();
		System.out.print("Enter the 2st number for the LCM: ");
		int s = input.nextInt();
		int i =1;
		while(true) {
			int factor = f*i;
			if (factor % s ==0) {
				return factor;
			}
			i++;
		}
			
		
		}
	public static boolean prime() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to check for the prime number: ");
		int num = input.nextInt();
		int i =2;
		while (i<num) {
			if (num % i ==0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static int sum() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the nuber for the summation: ");
		int num = input.nextInt();
		int sum =0;
		while (num>0) {
			int digit = num%10;
			sum += digit;
			num /=10;
		}
		return sum;
	}
	public static void reverse() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to be reversed: ");
		int num = input.nextInt();
		int sum = 0;
		while (num>0) {
			int digit = num %10;
			sum = digit;
			num/=10;
			System.out.print(sum);
		}
	}
	public static void pali() {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter the numbe for know the palindrome number: ");
		int num = input.nextInt();
		int ov=num;
		int sum =0;
		while (num>0) {
			int digit = num % 10;
			sum = sum*10+digit;
			num/=10;
			}
		if (ov==sum) {
			System.out.println("The entered number is a palindrome number.");
		}
		else {
			System.out.println("The entered number is not a palindrome number.");
		}
		}
	public static void fibo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number up to which the Fibonacci series should be printed: ");
	    int num = input.nextInt();
	    int a=0;
	    int b=1;
	    System.out.println(a);
	    
	    if (num>=1) {
	    	System.out.println(b);
	    }
	    while (a+b<=num) {
	    	int next = a+b;
	    	System.out.println(next);
	    	a=b;
	    	b=next;
	    }

		        
		    }

	}
	
	
	
	

