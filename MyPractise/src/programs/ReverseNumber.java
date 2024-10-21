package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int num, reverse=0 , value; 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		
		num = sc.nextInt();
		
		while(num>0)
		{
			value = num%10;
			reverse = reverse*10+value;
			num=num/10;
		}
		System.out.println("Reverted number is " +reverse);
		sc.close();
	}

}
