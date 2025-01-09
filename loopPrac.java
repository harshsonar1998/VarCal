package javaPrac;
import java.util.Scanner;

public class loopPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greet();// To invoke the methods to main and to run.
		//multi();
		//oddS(); 
		//fac();
		//odds();
		//lcm();
		//gcd();
		//prime();
		//reverse();
		//fb();
		//pat1();
		//pat2();
		//pat3();
		pali();
	}
	public static void greet() {
		System.out.println("Welcome to the Quantum Mechanics Advance Calculator.");
	}
	public static void multi() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to display multiplication table: ");
		int num = input.nextInt();
		int i =1; // Initialization that multiplication table will starts from 1
		while (i<=10) { // the loop will run less than and equal to 10 times for the multiplication table till 10
			System.out.println(num*i); // (num*i) due to the first the number will be entered by the person, then enter the loop and will multiply by 1 as i is set to be 1, then loop  exit and then again enter the loop sees second line then multiply by 2 and goes on.
			i++;
		}
	}
	public static int oddS() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number till the summation of odd numbers: ");
		int num = input.nextInt();
		int sum =0; // summation of all odd numbers will starts from zero so 0 is set.
		int i=1; // odd number starts from 1 so Initialization starts from here. 
		while(i<=num) { // The loop  will run till the i will less than or equal to the entered number.
			sum +=i; // sum will keep the number addition till the loops end
			System.out.println(sum);
			i+=2; // loop will skip two number and then run until it reaches the conidtion.
		}
		return sum;
	}
	public static long fac() {
		Scanner input = new  Scanner(System.in);
		System.out.print("Enter the number for the factorial: ");
		long num = input.nextLong();
		long sum = 1; // Multiplier loop.
		long i = 1; // I have taken 1 due to loop  multiplies by 1 if started from 0, then the output will be 0.
		while (i<=num) { // The loop  will run till the i will less than or equal to the entered number.
			sum*=i; // It multiplies the current value of sum by i and updates sum with the result.
			System.out.println(sum);
			i++;	// the iteration will run until the condition is satisfied.		
		}
		return sum;
	}
	public static int odds() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number for the summation: ");
		int num = input.nextInt();
		int sum =0; // storage of number will be 0.
		while (num > 0) { // condition = run the loop till the number divisible by 10 is > 0.
			sum += num % 10; // Apply modulus due to finding out the last digit by diving by 10 and stored in the sum. there is an addition sign so the loop continues till the num is more  than zero and stores the num and addition.
			num /=10; // again divide by 10 to get the number and stored in sum.
			System.out.println(sum);
		}
		return sum;
	}
	public static int lcm() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st number for the LCM: ");
		int f = input.nextInt();
		System.out.print("Enter the 2nd number for the LCM: ");
		int s = input.nextInt();
		int i = 1;
		while (true) { // True = written because of the infinite loop and it will run until the the loop is satisfied and break.
			int mul = f*i; // multiplies with the entered 1st number.
			if (mul % s ==0) { // check weather the mul is divisible by second, if answer 0 then condition satisfied, if answer not 0, then loop continues.
				System.out.print(mul);
				return mul;
			}
			i++; // increments till the loop is satisfied.
		}
		
	}
	public static int prime() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int num = input.nextInt();
		int i =2; // the prime number means the number divisible by their own or by 1, so here starting from 2. This is the initialization.
		while (i<num) { // condition that loop will run until the entered number.
			if (num % i ==0) { // another condition where the entered number has any factor that give us 0, will be stored in the i.
			System.out.print(i);	
			}
			i++;
		}
		return i;
	}
	public static int reverse() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to be reversed: ");
		int num = input.nextInt();
		int sum = 0; // initial value for the storage.
		while (num>0) { // condition to run the loop till the num value is greater than 0.
			sum = num % 10; // to find out the last digit of the entered number.
			num /=10; // again to find out the second, third...n last till the num value is >0.
			System.out.print(sum);
		}
		return sum;
	}
	public static int fb() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number till for Fibonacci series: ");
		int num = input.nextInt();
		int sum = 1;// 1st digit of fibonacci
		int i=0; // initialization
		while (i+sum<=num) { // condition =  run the loop till the two numbers are less than the entered number.
			int fl = sum + i; // addition of two number.
			sum = i; // swap from 1st to second
			i = fl; // and swap of second to third
			System.out.println(fl);
		}
		return i;
	}
	public static void pat1() {
		System.out.println("*\n**\n***\n****\n*****");
	}
	public static void pat2() {
		System.out.println("*****\n****\n***\n**\n*");
	}
	public static void pat3() {
		System.out.println("    *\n   **\n  ***\n ****\n*****");
	}
	public static void pali() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to test palindrome: ");
		int num = input.nextInt();
		int ov = num; // used to store the original number for the comparison.
		int rev =0; // storage for the assignment operator.
		while (num >0) { // loop will run till the entered number is more than zero and stop if less than zero.
			int digit = num % 10; // used to extract the last digit.
			rev =rev *10 + digit; // the stored rev * 10 + last currently extracted and goes on. ex. if 123, 0*10+3 = rev =3. 3*10+2 = rev = 32. 32*10 +1 = rev = 321. (123 !=321) will not be a palindrome number.
			num /=10; // divides the remaning digits.
		}
		if (rev==ov) {
			System.out.println(ov + " palindrome number.");
		}
		else {
			System.out.println( ov + " not a palindrome number.");
		}
	}
	
}

