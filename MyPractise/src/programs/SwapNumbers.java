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
		sc.close();
		
		swap(num1, num2);

	}
	
	public static void swap(int firstnumber, int seconndNumber)
	{
		System.out.println("Numbers you have entered are " +firstnumber +seconndNumber);
		int temp = firstnumber;
		firstnumber = seconndNumber;
		seconndNumber = temp; 
		
		System.out.println("Numbers after swaping are " +firstnumber +seconndNumber);
	}

}
