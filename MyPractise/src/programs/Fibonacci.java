package programs;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number for term of the series");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int series=0, start=1, next;
		for(int i=0; i<number; i++)
		{
			  			  
			 System.out.println(series);
			 next=series+start; 
			 series = start ;  
			 start = next; 
		}	
		
		sc.close();
	}
	
}
