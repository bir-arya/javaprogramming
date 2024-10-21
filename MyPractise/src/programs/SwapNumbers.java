package programs;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, swap;
		
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Numbers you have entered are " +num1 +num2);
		swap = num2;
		num2=num1;
		num1=swap;
		System.out.println("Numbers after reversal are " +num1 +num2);
		sc.close();

	}

}
