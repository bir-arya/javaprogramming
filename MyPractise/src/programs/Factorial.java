package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int fact;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		fact=sc.nextInt();
		sc.close();
						
		findFactorial(fact);
		
	}
	
	public static void findFactorial(int number)
	{
		for(int i=number; i>1; i--)
		{
			number = number*(i-1);
		}
		
		System.out.println("Factorial of inserted number is " +number);
	}

}
