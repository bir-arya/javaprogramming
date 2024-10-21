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
		
		for(int i=fact; i>1; i--)
		{
			fact = fact*(i-1);
			//System.out.println(" " +fact);
		}
		
		System.out.println("Factorial of inserted number is " +fact);
		sc.close();
		
	}

}
