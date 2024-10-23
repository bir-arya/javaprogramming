package programs;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		sc.close();
		
		isPrimeNumber(num);		
	}
	
	public static void isPrimeNumber(int number)
	{
		boolean flag = false;
		
		if(number==0)
		{
			System.out.println("given number is not a prime number");
		}
		if(number==1)
		{
			System.out.println("given number is not a prime number");
		}

		for(int i=2; i<=number/2; ++i)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}

		if(!flag)
		{
			System.out.println("given number is a prime number");
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
	}

}